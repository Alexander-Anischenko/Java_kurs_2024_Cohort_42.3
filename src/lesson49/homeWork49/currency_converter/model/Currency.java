package lesson49.homeWork49.currency_converter.model;

public enum Currency {
    USD("US Dollar"),
    EUR("Euro"),
    JPY("Japanese Yen"),
    GBP("British Pound"),
    AUD("Australian Dollar"),
    CAD("Canadian Dollar"),
    CHF("Swiss Franc"),
    CNY("Chinese Yuan"),
    SEK("Swedish Krona"),
    NZD("New Zealand Dollar");

    private final String name;

    Currency(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
