package lesson49.homeWork49.currency_converter.model;

import java.util.Objects;

public class Transaction {
    private final Currency fromCurrency;
    private final Currency toCurrency;
    private final double amount;
    private final double exchangedAmount;

    public Transaction(Currency fromCurrency, Currency toCurrency, double amount, double exchangedAmount) {
        this.fromCurrency = fromCurrency;
        this.toCurrency = toCurrency;
        this.amount = amount;
        this.exchangedAmount = exchangedAmount;
    }

    public Currency getFromCurrency() {
        return fromCurrency;
    }

    public Currency getToCurrency() {
        return toCurrency;
    }

    public double getAmount() {
        return amount;
    }

    public double getExchangedAmount() {
        return exchangedAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transaction that = (Transaction) o;
        return Double.compare(that.amount, amount) == 0 &&
                Double.compare(that.exchangedAmount, exchangedAmount) == 0 &&
                fromCurrency == that.fromCurrency &&
                toCurrency == that.toCurrency;
    }

    @Override
    public int hashCode() {
        return Objects.hash(fromCurrency, toCurrency, amount, exchangedAmount);
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "fromCurrency=" + fromCurrency +
                ", toCurrency=" + toCurrency +
                ", amount=" + amount +
                ", exchangedAmount=" + exchangedAmount +
                '}';
    }
}
