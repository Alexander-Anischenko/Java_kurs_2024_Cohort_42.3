package lesson49.homeWork49.currency_converter.tests;

import lesson49.homeWork49.currency_converter.dao.Converter;
import lesson49.homeWork49.currency_converter.dao.ConverterImpl;
import lesson49.homeWork49.currency_converter.model.Currency;
import lesson49.homeWork49.currency_converter.model.ExchangeRate;
import lesson49.homeWork49.currency_converter.model.Transaction;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ConverterImplTest {

    Converter converter;

    @BeforeEach
    void setUp() {
        converter = new ConverterImpl();
        converter.loadExchangeRates(List.of(
                new ExchangeRate(Currency.USD, 1.0),
                new ExchangeRate(Currency.EUR, 0.85),
                new ExchangeRate(Currency.JPY, 110.0)
        ));
    }

    @Test
    void loadExchangeRates() {
    }

    @Test
    void convert() {
        double amount = 100.0;

        double exchangedAmount = converter.convert(Currency.USD, Currency.EUR, amount);
        assertEquals(85.0, exchangedAmount, 0.01);
    }

    @Test
    void getTransactions() {
        converter.convert(Currency.USD, Currency.EUR, 100.0);
        List<Transaction> transactions = converter.getTransactions();
        assertEquals(1, transactions.size());
        assertEquals(Currency.USD, transactions.get(0).getFromCurrency());
        assertEquals(Currency.EUR, transactions.get(0).getToCurrency());
        assertEquals(100.0, transactions.get(0).getAmount(), 0.01);
    }

    @Test
    void generateReport() {
        converter.convert(Currency.USD, Currency.EUR, 100.0);
        converter.convert(Currency.EUR, Currency.JPY, 85.0);
        converter.convert(Currency.JPY, Currency.USD, 11000.0);

        Map<Currency, Map<String, Double>> report = converter.generateReport();
        assertEquals(100.0, report.get(Currency.USD).get("sold"), 0.01);
        assertEquals(85.0, report.get(Currency.EUR).get("bought"), 0.01);
        assertEquals(85.0, report.get(Currency.EUR).get("sold"), 0.01);
        assertEquals(11000.0, report.get(Currency.JPY).get("bought"), 0.01);
    }
}