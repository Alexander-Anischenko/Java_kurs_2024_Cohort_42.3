package lesson49.homeWork49.currency_converter.model;

import java.util.Objects;

public class ExchangeRate {
    private final Currency currency;
    private final double rate;

    public ExchangeRate(Currency currency, double rate) {
        this.currency = currency;
        this.rate = rate;
    }

    public Currency getCurrency() {
        return currency;
    }

    public double getRate() {
        return rate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExchangeRate that = (ExchangeRate) o;
        return Double.compare(that.rate, rate) == 0 && currency == that.currency;
    }

    @Override
    public int hashCode() {
        return Objects.hash(currency, rate);
    }

    @Override
    public String toString() {
        return "ExchangeRate{" +
                "currency=" + currency +
                ", rate=" + rate +
                '}';
    }
}
