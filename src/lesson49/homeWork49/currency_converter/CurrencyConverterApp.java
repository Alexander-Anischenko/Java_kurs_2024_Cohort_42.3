package lesson49.homeWork49.currency_converter;

import lesson49.homeWork49.currency_converter.dao.Converter;
import lesson49.homeWork49.currency_converter.dao.ConverterImpl;
import lesson49.homeWork49.currency_converter.dao.FileHandler;
import lesson49.homeWork49.currency_converter.model.Currency;
import lesson49.homeWork49.currency_converter.model.ExchangeRate;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class CurrencyConverterApp {
    public static void main(String[] args) {

        Converter converter = new ConverterImpl();
        FileHandler fileHandler = new FileHandler();

        try {
            List<ExchangeRate> rates = fileHandler.loadExchangeRates("C:/Users/ilyaa/Java course 2024/lesson_01/read_file/exchange_rates");
            converter.loadExchangeRates(rates);
        } catch (IOException e) {
            System.err.println("Error loading exchange rates: " + e.getMessage());
            return;
        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Currency Converter!");
        System.out.print("Enter the currency you have (code): ");
        String fromCode = scanner.nextLine().toUpperCase();
        System.out.print("Enter the amount you have: ");
        double amount = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline character
        System.out.print("Enter the currency you want (code): ");
        String toCode = scanner.nextLine().toUpperCase();

        try {
            Currency fromCurrency = Currency.valueOf(fromCode);
            Currency toCurrency = Currency.valueOf(toCode);
            double exchangedAmount = converter.convert(fromCurrency, toCurrency, amount);
            System.out.printf("You will receive %.2f %s\n", exchangedAmount, toCode);
        } catch (IllegalArgumentException e) {
            System.err.println("Invalid currency code: " + e.getMessage());
        }

        try {
            fileHandler.saveTransactions("transactions.txt", converter.getTransactions());
        } catch (IOException e) {
            System.err.println("Error saving transactions: " + e.getMessage());
        }

        System.out.println("Thank you for using the Currency Converter!");
    }
}
