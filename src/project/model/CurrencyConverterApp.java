package project.model;

import project.dao.CurrencyConverter;
import project.dao.CurrencyImpl;

import java.util.List;
import java.util.Scanner;

public class CurrencyConverterApp {
    private static CurrencyConverter currencyDAO = new CurrencyImpl();
    private static List<Currency> currencies;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            displayMenu();
            int choice = getValidChoice(scanner);

            CurrencyOperation operation;
            try {
                operation = CurrencyOperation.fromCode(choice);
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid choice!");
                continue;
            }

            switch (operation) {
                case LOAD_CURRENCIES:
                    loadCurrencies(scanner);
                    break;
                case BUY_CURRENCY:
                    handleCurrencyTransaction(scanner, true);
                    break;
                case SELL_CURRENCY:
                    handleCurrencyTransaction(scanner, false);
                    break;
                case REPORT:
                    generateReport();
                    break;
                case EXIT:
                    exitApplication();
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    private static void displayMenu() {
        System.out.println("Choose an operation:");
        System.out.println("1. Load currencies");
        System.out.println("2. Buy currency");
        System.out.println("3. Sell currency");
        System.out.println("4. Report");
        System.out.println("5. Exit");
    }

    private static int getValidChoice(Scanner scanner) {
        System.out.print("Enter your choice: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Please enter a valid number.");
            scanner.next();
        }
        return scanner.nextInt();
    }

    private static void loadCurrencies(Scanner scanner) {
        currencies = currencyDAO.readCurrenciesFromFile("C:/Users/ilyaa/Java course 2024/lesson_01/src/project/resources/exchange_rates");
        System.out.println("Exchange rates loaded successfully.");
        System.out.println("Available currencies:");
        for (Currency currency : currencies) {
            System.out.printf("- %s%n", currency.getCode());
        }
    }

    private static void handleCurrencyTransaction(Scanner scanner, boolean isBuy) {
        if (currencies == null || currencies.isEmpty()) {
            System.out.println("Please load currencies first.");
            return;
        }

        System.out.printf("Enter currency to %s (e.g., EUR): ", isBuy ? "buy" : "sell");
        String currencyCode = scanner.next().toUpperCase();

        System.out.printf("Enter amount to %s: ", isBuy ? "buy" : "sell");
        while (!scanner.hasNextDouble()) {
            System.out.println("Please enter a valid amount.");
            scanner.next();
        }
        double amount = scanner.nextDouble();

        if (isBuy) {
            currencyDAO.buyCurrency(currencyCode, amount);
        } else {
            currencyDAO.sellCurrency(currencyCode, amount);
        }
    }

    private static void generateReport() {
        System.out.println("Transaction Report:");
        if (currencyDAO instanceof CurrencyImpl) {
            List<Transaction> transactions = ((CurrencyImpl) currencyDAO).getTransactions();
            for (Transaction transaction : transactions) {
                System.out.println(transaction.toString());
            }
        } else {
            System.out.println("No transaction history available.");
        }
    }

    private static void exitApplication() {
        System.out.println("Exiting application.");
        System.exit(0);
    }
}
