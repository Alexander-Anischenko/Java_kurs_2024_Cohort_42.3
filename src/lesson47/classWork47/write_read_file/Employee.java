package lesson47.classWork47.write_read_file;

import java.io.Serializable;
import java.util.Objects;

public class Employee implements Serializable {

    private final int id;
    private String name;
    private String lastName;
    private int age;
    private double salary;
    private Adderss address;

    public Employee(int id, String name, String lastName, int age, double salary, Adderss address) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Adderss getAddress() {
        return address;
    }

    public void setAddress(Adderss address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee employee)) return false;
        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Employee: ");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", age=").append(age);
        sb.append(", salary=").append(salary);
        sb.append(", address=").append(address);
        sb.append(' ');
        return sb.toString();
    }
}
