package project.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import project.dao.CurrencyImpl;
import project.model.Currency;
import project.model.Transaction;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CurrencyImplTest {
    private CurrencyImpl currencyImpl;

    @BeforeEach
    void setUp() {
        currencyImpl = new CurrencyImpl();
        currencyImpl.readCurrenciesFromFile("C:/Users/ilyaa/Java course 2024/lesson_01/src/project/resources/exchange_rates");
    }

    @Test
    void readCurrenciesFromFile() {
        List<Currency> currencies = currencyImpl.readCurrenciesFromFile("C:/Users/ilyaa/Java course 2024/lesson_01/src/project/resources/exchange_rates");

        // Assert that currencies are loaded correctly
        assertEquals(12, currencies.size()); // Adjust the number based on your test file
        assertEquals(0.91, currencies.get(0).getBuyRate());
        assertEquals(0.92, currencies.get(0).getSellRate());

    }

    @Test
    void buyCurrency() {
        currencyImpl.buyCurrency("USD", 100.0);
        List<Transaction> transactions = currencyImpl.getTransactions();

        assertEquals(1, transactions.size());
        assertEquals("USD", transactions.get(0).getCurrencyCode());
        assertEquals(100.0, transactions.get(0).getAmount());
        // Add more assertions based on your expected behavior
    }

    @Test
    void sellCurrency() {
        currencyImpl.sellCurrency("USD", 100.0);
        List<Transaction> transactions = currencyImpl.getTransactions();

        assertEquals(1, transactions.size());
        assertEquals("USD", transactions.get(0).getCurrencyCode());
        assertEquals(100.0, transactions.get(0).getAmount());
        // Add more assertions based on your expected behavior
    }

    @Test
    void getTransactions() {
        currencyImpl.buyCurrency("USD", 100.0);
        currencyImpl.sellCurrency("EUR", 200.0);

        List<Transaction> transactions = currencyImpl.getTransactions();

        assertEquals(2, transactions.size());
        assertEquals("USD", transactions.get(0).getCurrencyCode());
        assertEquals("EUR", transactions.get(1).getCurrencyCode());
    }

    @Test
    void saveTransactionsToFile() {
        currencyImpl.buyCurrency("USD", 100.0);
        currencyImpl.sellCurrency("EUR", 200.0);

        currencyImpl.saveTransactionsToFile("C:/Users/ilyaa/Java course 2024/lesson_01/src/project/resources/transactions");

        // Implement assertions to check if the file has been saved correctly
        // You can also read the file back and verify its contents if necessary
    }
}
