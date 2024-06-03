package lesson32.classWork32.company;

import lesson32.classWork32.company.dao.CompanyImpl;
import lesson32.classWork32.company.model.Employee;
import lesson32.classWork32.company.model.Manager;
import lesson32.classWork32.company.model.SalesManager;
import lesson32.classWork32.company.model.Worker;

public class CompanyApp {
    public static void main(String[] args) {

        CompanyImpl company = new CompanyImpl(5);

        Employee[] empl = new Employee[4];
        empl[0] = new Manager(100, 45, "Jon", 160,"Smith", 5000 , 5 );
        empl[1] = new SalesManager(101, 36, "Anna",160 , "Black",0.1 , 25000);
        empl[2] = new SalesManager(102, 28,"Thomas", 160, "White", 0.1, 30000);
        empl[3] = new Worker(103, 30, "Gans", 80, "Bauer", 5);

        // add all employee
        for (Employee e : empl) {
            company.addEmployee(e);
        }
        //print
        company.printEmployee();
        System.out.println("<===========================================>");
        // find employee with id: 101
        Employee employee = company.findEmployee(101);
        System.out.println(employee);
        System.out.println("<===========================================>");
        // total salary
        double totalSalary = company.totalSalary();
        System.out.println("Total salary of company=> " + totalSalary);
        // add new employee
        Employee newEmployee = new Worker(104 , 26, "Robert", 80, "Humbert",5);
        company.addEmployee(newEmployee);
        System.out.println("<===========================================>");
        company.printEmployee();
         totalSalary = company.totalSalary();// calculate new salary
        System.out.println("Total salary of company=> " + totalSalary);
        System.out.println("<===========================================>");
        Employee[] goodEmployee = company.findEmployeeHoursGreaterThen(100);
        for (Employee e : goodEmployee) {
            System.out.println(e);
        }
        System.out.println("<===========================================>");
        //update employee with id 101
        Employee employee1 = company.updateEmployee(101, "White");
        System.out.println(employee1);

    }
}