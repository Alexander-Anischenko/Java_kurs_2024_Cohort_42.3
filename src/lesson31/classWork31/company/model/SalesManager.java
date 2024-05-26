package lesson31.classWork31.company.model;

public class SalesManager extends Employee {

    private double salesRevenue; // Выручка

    private double percent;

    public SalesManager(int id, int age, String firstName, double hours, String secondName, double percent, double salesRevenue) {
        super(id, age, firstName, hours, secondName);
        this.percent = percent;
        this.salesRevenue = salesRevenue;
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }

    public double getSalesRevenue() {
        return salesRevenue;
    }

    public void setSalesRevenue(double salesRevenue) {
        this.salesRevenue = salesRevenue;
    }

    @Override
    public double calcSalary() {
        double salary = salesRevenue + percent;
        return salary;
    }
}
