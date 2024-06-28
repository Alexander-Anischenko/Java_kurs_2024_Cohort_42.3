package lesson41.homeWork41.cars.test;

import lesson41.homeWork41.cars.dao.Garage;
import lesson41.homeWork41.cars.dao.GarageImpl;
import lesson41.homeWork41.cars.model.Car;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GarageImplTest {

    Garage garage;

    Car[] c;

    @BeforeEach
    void setUp() {
        garage = new GarageImpl(6);
        c = new Car[5];
        c[0] = new Car("N3", "Model1", "Company4", 2.0, "White");
        c[1] = new Car("N4", "Model2", "Company3", 2.5, "Black");
        c[2] = new Car("N1", "Model3", "Company2", 3.0, "Silver");
        c[3] = new Car("N2", "Model4", "Company1", 1.7, "Yellow");
        c[4] = new Car("N5", "Model1", "Company3", 2.5, "Silver");

        for (Car o : c) {
            garage.addCar(o);
        }
    }
    @Test
    void findCarByModel() {

        Car[] actual = garage.findCarByModel("Model1");
        Car[] expected = {c[0], c[4]};
        assertArrayEquals(expected, actual);



    }

    @Test
    void addCar() {
        // нельзя добавить null
        assertFalse(garage.addCar(null));
        // нельзя добавить второй раз уже существующий объект
        assertFalse(garage.addCar(c[0]));
        // добавление объекта
        Car car = new Car("N6", "Model5", "Company5", 2.2, "White");
        assertTrue(garage.addCar(car));
        //проверяем кол-во после добавления
        assertEquals(6, garage.quantity());
        // превышение capacity
        Car car1 = new Car("N7", "ModelY", "Tesla", 0, "Purple");
        assertFalse(garage.addCar(car1));
    }


    @Test
    void removeCar() {
        // удаление по regNumber
        assertEquals(c[0], garage.removeCar("N3"));
        //проверяем кол-во после удаления
        assertEquals(4, garage.quantity());
    }

    @Test
    void findCarByRegNumber() {
        // проверяем совпадение по полю RegNumber
        assertEquals(c[1], garage.findCarByRegNumber("N4"));
        // проверяем на отсутствующем RegNumber возвращение значения Null
        assertNull(garage.findCarByRegNumber("N6"));
    }



    @Test
    void findCarByCompany() {
        Car[] actual = garage.findCarByCompany("Company3");
        Car[] expected = {c[1], c[4]};
        assertArrayEquals(expected, actual);
    }

    @Test
    void findCarByEngine() {
        Car[] actual = garage.findCarByEngine(2.0, 2.5);
        Car[] expected = {c[0], c[1], c[4]};
        assertArrayEquals(expected, actual);
    }

    @Test
    void findCarByColor() {
        Car[] actual = garage.findCarByColor("Silver");
        Car[] expected = {c[2], c[4]};
        assertArrayEquals(expected, actual);
    }

    @Test
    void quantity() {
        assertEquals(4, garage.quantity());
    }
}