package lesson49.homeWork49.currency_converter.dao;

import lesson49.homeWork49.currency_converter.model.Currency;
import lesson49.homeWork49.currency_converter.model.ExchangeRate;
import lesson49.homeWork49.currency_converter.model.Transaction;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileHandler {
    public List<ExchangeRate> loadExchangeRates(String filename) throws IOException {
        List<ExchangeRate> rates = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                Currency currency = Currency.valueOf(parts[0]);
                double rate = Double.parseDouble(parts[1]);
                ExchangeRate exchangeRate = new ExchangeRate(currency, rate);
                rates.add(exchangeRate);
            }
        }

        return rates;
    }

    public void saveTransactions(String filename, List<Transaction> transactions) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (Transaction transaction : transactions) {
                writer.write(transaction.getFromCurrency().name() + "," +
                        transaction.getToCurrency().name() + "," +
                        transaction.getAmount() + "," +
                        transaction.getExchangedAmount());
                writer.newLine();
            }
        }
    }
}
