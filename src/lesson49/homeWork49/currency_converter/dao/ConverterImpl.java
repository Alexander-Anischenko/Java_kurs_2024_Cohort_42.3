package lesson49.homeWork49.currency_converter.dao;

import lesson49.homeWork49.currency_converter.model.Currency;
import lesson49.homeWork49.currency_converter.model.ExchangeRate;
import lesson49.homeWork49.currency_converter.model.Transaction;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConverterImpl implements Converter {

    private final Map<Currency, ExchangeRate> exchangeRates = new HashMap<>();
    private final List<Transaction> transactions = new ArrayList<>();

    @Override
    public void loadExchangeRates(List<ExchangeRate> rates) {
        for (ExchangeRate rate : rates) {
            exchangeRates.put(rate.getCurrency(), rate);
        }
    }

    @Override
    public double convert(Currency fromCurrency, Currency toCurrency, double amount) {
        ExchangeRate fromRate = exchangeRates.get(fromCurrency);
        ExchangeRate toRate = exchangeRates.get(toCurrency);

        if (fromRate == null || toRate == null) {
            throw new IllegalArgumentException("Invalid currency code");
        }

        double exchangedAmount = amount * (toRate.getRate() / fromRate.getRate());
        transactions.add(new Transaction(fromCurrency, toCurrency, amount, exchangedAmount));
        return exchangedAmount;
    }

    @Override
    public List<Transaction> getTransactions() {
        return transactions;
    }

    @Override
    public Map<Currency, Map<String, Double>> generateReport() {
        Map<Currency, Map<String, Double>> report = new HashMap<>();

        for (Transaction transaction : transactions) {
            Currency fromCode = transaction.getFromCurrency();
            Currency toCode = transaction.getToCurrency();

            report.putIfAbsent(fromCode, new HashMap<>());
            report.putIfAbsent(toCode, new HashMap<>());

            Map<String, Double> fromReport = report.get(fromCode);
            Map<String, Double> toReport = report.get(toCode);

            fromReport.put("sold", fromReport.getOrDefault("sold", 0.0) + transaction.getAmount());
            toReport.put("bought", toReport.getOrDefault("bought", 0.0) + transaction.getExchangedAmount());
        }

        return report;
    }
}
