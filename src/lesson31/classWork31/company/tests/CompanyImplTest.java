package lesson31.classWork31.company.tests;

import lesson31.classWork31.company.dao.Company;
import lesson31.classWork31.company.dao.CompanyImpl;
import lesson31.classWork31.company.model.Employee;
import lesson31.classWork31.company.model.Manager;
import lesson31.classWork31.company.model.SalesManager;
import lesson31.classWork31.company.model.Worker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompanyImplTest {
    Company company;
    Employee[] e;

    @BeforeEach
    void setUp() {
        company = new CompanyImpl(5);
        e = new Employee[4];
        e[0] = new Manager(101, 45, "Jon", 160,"Smith", 5000 , 5 );
        e[1] = new SalesManager(102, 36, "Anna", 160,"Black", 0.1 , 25000 );
        e[2] = new SalesManager(103, 36, "Thomas", 160,"White", 0.1 , 30000 );
        e[3] = new Worker(104,30, "Hans", 80, "Bauer", 5);

        // необходимо добавить злементы массива в объект company
        for (int i = 0; i < e.length; i++) {
            company.addEmployee(e[i]);
        }
    }

    @Test
    void addEmployee() {
        // нельзя добавить null
        assertFalse(company.addEmployee(null));

        //нельзя добавить второй раз уже имеющегося
        assertFalse(company.addEmployee(e[1]));
        //нельзя превысить capacity

        //добавляем сотрудника
        Employee employee = new Manager(105, 55, "Ivan", 160, "Dubinin", 6000, 6);
        assertTrue(company.addEmployee(employee));
        //проверяем кол-во после добавления
        assertEquals(5, company.quantity());
        // нельзя превысить capacity
        Employee employeeOneMore = new Worker(106, 45, "Leon", 80, "Kruger", 5);
        assertFalse(company.addEmployee(employeeOneMore));
        company.printEmployee();
    }

    @Test
    void removeEmployee() {
    }

    @Test
    void findEmployee() {
    }

    @Test
    void quantity() {
    }

    @Test
    void totalSalary() {
    }

    @Test
    void averageSalary() {
    }

    @Test
    void totalSales() {
    }

    @Test
    void printEmployee() {
    }

    @Test
    void findEmployeeHoursGreaterThen() {
    }

    @Test
    void findEmployeeSalaryRange() {
    }
}