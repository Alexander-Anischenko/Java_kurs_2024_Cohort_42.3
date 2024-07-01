package lesson42.classWork42.cars.test;

import static org.junit.jupiter.api.Assertions.*;
import lesson42.classWork42.cars.dao.Garage;
import lesson42.classWork42.cars.dao.GarageArrayListImpl;
import lesson42.classWork42.cars.dao.GarageHashSetImpl;
import lesson42.classWork42.cars.dao.GarageImpl;
import lesson42.classWork42.cars.model.Car;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GarageImplTest {


Garage garage;

    Car[] cars;

    @BeforeEach
    public void setUp() throws Exception {

        // garage = new GarageImpl(5);

         //garage = new GarageArrayListImpl(5); // switch implementation

        garage = new GarageHashSetImpl(5);

        cars = new Car[4];
        cars[0] = new Car("Number1", "Model1", "Company1", 1.5, "Red");
        cars[1] = new Car("Number2", "Model2", "Company1", 2.5, "Green");
        cars[2] = new Car("Number3", "Model3", "Company2", 1.5, "Red");
        cars[3] = new Car("Number4", "Model4", "Company2", 2.0, "Green");

//		for (int i = 0; i < cars.length; i++) {
//			garage.addCar(cars[i]);
//		}

        for (Car car : cars) {
            garage.addCar(car);
        }
    }

    @Test
    public void testAddCar() {
        // can't add existed element
        assertFalse(garage.addCar(cars[0]));
        // add one car
        Car car = new Car("Number5", "Model4", "Company2", 2.0, "Green");
        assertTrue(garage.addCar(car));
        // add more than capacity
        car = new Car("Number6", "Model4", "Company2", 2.0, "Green");
        assertFalse(garage.addCar(car));
    }

    @Test
    public void testRemoveCar() {
        // remove element
        assertEquals(cars[0], garage.removeCar("Number1"));
        // remove absent element, try to remove already removed element
        Assertions.assertNull(garage.removeCar("Number1"));
    }

    @Test
    public void testFindCarByRegNumber() {
        // find car by regNumber
        Car car = garage.findCarByRegNumber("Number4");
        assertEquals(cars[3], car);
        // check fields
        assertEquals(cars[3].getColor(), car.getColor());
        assertEquals(cars[3].getEngine(), car.getEngine());
        // ???
        assertEquals(cars[3], garage.findCarByRegNumber("Number4"));
        // find absent element
        assertNull(garage.findCarByRegNumber("Number40"));
    }

    @Test
    public void testFindCarByModel() {
        Car[] expecteds = {cars[2]};
        Car[] actuals = garage.findCarByModel("Model3");
        assertArrayEquals(expecteds, actuals);
    }

    @Test
    public void testFindCarByCompany() {
        Car[] expecteds = {cars[2], cars[3]};
        Car[] actuals = garage.findCarByCompany("Company2");
        assertArrayEquals(expecteds, actuals);
    }

    @Test
    public void testFindCarByColor() {
        Car[] expecteds = {cars[0], cars[2]};
        Car[] actuals = garage.findCarByColor(new String("Red"));
        assertArrayEquals(expecteds, actuals);
        // find absent element (no such color)
        assertEquals(0, garage.findCarByColor("Purple").length);
    }

    @Test
    public void testFindCarByEngine() {
        Car[] expecteds = {cars[1], cars[3]};
        Car[] actuals = garage.findCarByEngine(2.0, 2.5);
        assertArrayEquals(expecteds, actuals);
    }
}