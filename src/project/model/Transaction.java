package project.model;

public class Transaction {
    private String currencyCode;
    private double amount;
    private double exchangedAmount;
    private boolean isBuy; // true for buy, false for sell

    public Transaction(String currencyCode, double amount, double exchangedAmount, boolean isBuy) {
        this.currencyCode = currencyCode;
        this.amount = amount;
        this.exchangedAmount = exchangedAmount;
        this.isBuy = isBuy;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public double getAmount() {
        return amount;
    }

    public double getExchangedAmount() {
        return exchangedAmount;
    }

    public boolean isBuy() {
        return isBuy;
    }

    @Override
    public String toString() {
        return String.format("%s %s %.2f for %.2f", isBuy ? "Bought" : "Sold", currencyCode, exchangedAmount, amount);
    }
}
