package lesson49.homeWork49.currency_converter.dao;

import lesson49.homeWork49.currency_converter.model.Currency;
import lesson49.homeWork49.currency_converter.model.ExchangeRate;
import lesson49.homeWork49.currency_converter.model.Transaction;

import java.util.List;
import java.util.Map;

public interface Converter {

    void loadExchangeRates(List<ExchangeRate> rates);

    double convert(Currency fromCurrency, Currency toCurrency, double amount);

    List<Transaction> getTransactions();

    Map<Currency, Map<String, Double>> generateReport();

}
