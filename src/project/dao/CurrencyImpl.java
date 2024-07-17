package project.dao;

import project.model.Currency;
import project.model.Transaction;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CurrencyImpl implements CurrencyConverter{

    //fields
    // Константа, содержащая путь к файлу с транзакциями
    private static final String TRANSACTION_FILE = "C:/Users/ilyaa/Java course 2024/lesson_01/src/project/resources/transactions";
    // Список для хранения всех транзакций
    private List<Transaction> transactions = new ArrayList<>();
    // Мапа для хранения валют, где ключом является код валюты, а значением - объект Currency
    private Map<String, Currency> currencyMap = new HashMap<>();

    // Переопределенный метод для чтения данных о валютах из файла
    @Override
    public List<Currency> readCurrenciesFromFile(String filePath) {
        // Список для хранения прочитанных валют
        List<Currency> currencies = new ArrayList<>();
        // Попытка открыть файл для чтения
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            // Чтение файла построчно
            while ((line = br.readLine()) != null) {
                // Разделение строки на части по запятой
                String[] parts = line.split(",");
                // Код валюты в верхнем регистре
                String currencyCode = parts[0].toUpperCase();
                // Курс покупки
                double buyRate = Double.parseDouble(parts[1]);
                // Курс продажи
                double sellRate = Double.parseDouble(parts[2]);
                // Создание нового объекта Currency
                Currency currency = new Currency(currencyCode, buyRate, sellRate);
                // Добавление валюты в список и карту
                currencies.add(currency);
                currencyMap.put(currencyCode, currency);
            }
        } catch (IOException e) {
            // Обработка исключений ввода-вывода
            e.printStackTrace();
        }
        // Возврат списка валют
        return currencies;
    }

    // Метод для покупки валюты
    @Override
    public void buyCurrency(String currencyCode, double amount) {
        // Поиск валюты в карте по коду
        Currency currency = currencyMap.get(currencyCode);
        // Если валюта найдена
        if (currency != null) {
            // Вычисление суммы в пересчете на курс покупки
            double exchangedAmount = amount * currency.getBuyRate();
            // Добавление новой транзакции в список
            transactions.add(new Transaction(currencyCode, amount, exchangedAmount, true));
            // Сохранение транзакций в файл
            saveTransactionsToFile(TRANSACTION_FILE);
            // Вывод информации о покупке на консоль
            System.out.printf("You bought %.2f %s%n", exchangedAmount, currencyCode);
        } else {
            // Если валюта не найдена, вывод сообщения об ошибке
            System.out.println("Invalid currency code!");
        }
    }

    // Метод для продажи валюты
    @Override
    public void sellCurrency(String currencyCode, double amount) {
        // Поиск валюты в карте по коду
        Currency currency = currencyMap.get(currencyCode);
        // Если валюта найдена
        if (currency != null) {
            // Вычисление суммы в пересчете на курс продажи
            double exchangedAmount = amount / currency.getSellRate();
            // Добавление новой транзакции в список
            transactions.add(new Transaction(currencyCode, amount, exchangedAmount, false));
            // Сохранение транзакций в файл
            saveTransactionsToFile(TRANSACTION_FILE);
            // Вывод информации о продаже на консоль
            System.out.printf("You sold %.2f %s%n", exchangedAmount, currencyCode);
        } else {
            // Если валюта не найдена, вывод сообщения об ошибке
            System.out.println("Invalid currency code!");
        }
    }

    // Метод для получения списка всех транзакций
    public List<Transaction> getTransactions() {
        return transactions;
    }

    // Метод для сохранения транзакций в файл
    @Override
    public void saveTransactionsToFile(String filePath) {
        // Попытка открыть файл для записи
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            // Запись каждой транзакции в файл
            for (Transaction transaction : transactions) {
                bw.write(transaction.toString());
                // Переход на новую строку
                bw.newLine();
            }
        } catch (IOException e) {
            // Обработка исключений ввода-вывода
            e.printStackTrace();
        }
    }
}
