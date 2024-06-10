package lesson35.homeWork35.car;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class CarTest {

    Car[] cars;

    @BeforeEach
    void setUp() {
        cars = new Car[8];
        cars[0] = new Car("Toyota", "Camry", 2018, 30000, 20000);
        cars[1] = new Car("Honda", "Civic", 2018, 28000, 19000);
        cars[2] = new Car("Toyota", "RAV4", 2020, 15000, 25000);
        cars[3] = new Car("Ford", "Mustang", 2019, 20000, 30000);
        cars[4] = new Car("Toyota", "Prius", 2016, 50000, 15000);
        cars[5] = new Car("Toyota", "Corolla", 2019, 25000, 18000);
        cars[6] = new Car("Chevrolet", "Malibu", 2020, 10000, 24000);
        cars[7] = new Car("Nissan", "Altima", 2017, 45000, 17000);
    }

    private void printArray(Object[] arr, String reportTitle) {
        System.out.println("<=======" + reportTitle + "========>");
        for (Object o : arr) {
            System.out.println(o);
        }
    }

    @Test
    void testArray() {
        printArray(cars, "list of cars");
    }

    @Test
    void nativeSorting() {
        printArray(cars, "list of cars as is");
        Arrays.sort(cars);
        printArray(cars, "list of cars sorted by brand");
    }

}
