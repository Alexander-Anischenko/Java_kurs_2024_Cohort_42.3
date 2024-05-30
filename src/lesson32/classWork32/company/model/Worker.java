package lesson32.classWork32.company.model;

public class Worker extends Employee {

    private int grade;

    public Worker(int id, int age, String firstName, double hours, String secondName, int grade) {
        super(id, age, firstName, hours, secondName);
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public double calcSalary() {
        double salary = hours * grade;
        return salary;
    }
}
