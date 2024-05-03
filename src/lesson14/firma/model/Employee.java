package lesson14.firma.model;

public class Employee {

    // Fields
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private boolean gender;
    private double salary;// зарплата

    // Constructor


    public Employee(int id, String firstName, String lastName, int age, boolean gender, double salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
    }

    // Getters and setters


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", salary=" + salary +
                '}';
    }

    public void work() {
        System.out.println("Employee is working hard!...");
    }
    public void lunch() {
        System.out.println("Employee is eating lunch. ");
    }
    public void sleep() {
        System.out.println("Employee is sleeping. ");
    }
}
