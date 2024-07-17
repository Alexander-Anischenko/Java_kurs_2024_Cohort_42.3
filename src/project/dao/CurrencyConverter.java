package project.dao;

import project.model.Currency;

import java.util.List;

public interface CurrencyConverter {
    List<Currency> readCurrenciesFromFile(String filePath);
    void buyCurrency(String currencyCode, double amount);
    void sellCurrency(String currencyCode, double amount);
    void saveTransactionsToFile(String filePath);
}
