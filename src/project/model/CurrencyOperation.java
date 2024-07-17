package project.model;

public enum CurrencyOperation {
    LOAD_CURRENCIES(1, "Load currencies"),
    BUY_CURRENCY(2, "Buy currency"),
    SELL_CURRENCY(3, "Sell currency"),
    REPORT(4, "Report"),
    EXIT(5, "Exit");

    private final int code;
    private final String description;

    CurrencyOperation(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public static CurrencyOperation fromCode(int code) {
        for (CurrencyOperation operation : values()) {
            if (operation.getCode() == code) {
                return operation;
            }
        }
        throw new IllegalArgumentException("Invalid operation code: " + code);
    }
}
