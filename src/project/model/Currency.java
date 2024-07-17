package project.model;

public class Currency {
    private String code;
    private double buyRate;
    private double sellRate;

    public Currency(String code, double buyRate, double sellRate) {
        this.code = code;
        this.buyRate = buyRate;
        this.sellRate = sellRate;
    }

    public String getCode() {
        return code;
    }

    public double getBuyRate() {
        return buyRate;
    }

    public double getSellRate() {
        return sellRate;
    }
}
