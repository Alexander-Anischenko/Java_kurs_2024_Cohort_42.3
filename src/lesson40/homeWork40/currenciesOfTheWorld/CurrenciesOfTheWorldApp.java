package lesson40.homeWork40.currenciesOfTheWorld;

// Create an application in which the bank operator enters international currency denominations.
// The application must not allow two identical currencies to exist.

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CurrenciesOfTheWorldApp {
    public static void main(String[] args) {
        // Создаем объект currency из массива строк
        Set<String> currency = new HashSet<>();

        //создаем строку newCurrency, как инструмент наполнения массива
        String newCurrency;

        // приветствие
        System.out.println("Hallo, bank employee!");
        // объект scanner для ввода наименовантй валют
        Scanner scanner = new Scanner(System.in);

        // используем цикл do while для работы меню приложения
        do {
            // вводится название новой валюты
            System.out.println("Input a currency name: ");
            newCurrency = scanner.nextLine();
            // если условие добавления новой валюты срабатывает, то-есть нет дубликата
            if (currency.add(newCurrency)) {
                // выводится сообщение об успешном вводе
                System.out.println("New currency added.");
            } else { // в противном случае
                // выводится сообщение о том, что такая валюта уже существует
                System.out.println("Currency already exists.");
            }
            //предложение продолжить ввод
            System.out.println("Continue? y/n");
            String choice = scanner.nextLine();
            // при условии ввода буквы n выходим из цикла, в остальных случаях продолжаем ввод валют
            if (choice.equals("n")) {
                System.out.println("Good bye!");
                break;
            }
        } while (true);

        // выводим в консоль все введенные валюты
        System.out.println("<==================================>");
        System.out.println("Currencies used in the bank: ");
        System.out.println(currency);
    }
}
