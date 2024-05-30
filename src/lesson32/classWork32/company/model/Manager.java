package lesson32.classWork32.company.model;

public class Manager extends Employee {

    //fields
    private double baseSalary;

    private int grade;

    public Manager(int id, int age, String firstName, double hours, String secondName, double baseSalary, int grade) {
        super(id, age, firstName, hours, secondName);
        this.baseSalary = baseSalary;
        this.grade = grade;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public double calcSalary() {
        double salary = baseSalary + hours * grade;
        return salary;
    }
}
