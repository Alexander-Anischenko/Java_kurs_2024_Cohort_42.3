package lesson14.firma;

import lesson14.firma.model.Employee;

public class FirmaApp {
    public static void main(String[] args) {

        Employee employee1 = new Employee(1, "Leonid", "Smoll", 60, true, 7000);
        Employee employee2 = new Employee(2, "Victoria", "Smoll", 35, false, 7500);
        Employee employee3 = new Employee(3, "Paul", "Mueller", 60, true, 6500);
        Employee employee4 = new Employee(4, "Sergry", "big", 60, true, 8000);

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);
        System.out.println(employee4);
        System.out.println();

        double totalSalary = employee1.getSalary() + employee2.getSalary() + employee3.getSalary() + employee4.getSalary();
        System.out.println("Total salary: " + totalSalary);
        System.out.println();

        employee1.lunch();
        employee2.work();
        employee3.work();
        employee4.sleep();
        System.out.println();

        System.out.println(employee1.getFirstName());
        employee1.work();

    }
}
