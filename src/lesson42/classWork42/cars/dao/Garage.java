package lesson42.classWork42.cars.dao;

import lesson42.classWork42.cars.model.Car;

public interface Garage {

    boolean addCar(Car car);
    Car removeCar(String regNumber);
    Car findCarByRegNumber(String regNumber);
    Car[] findCarByModel(String model);
    Car[] findCarByCompany(String company);
    Car[] findCarByEngine(double min, double max);
    Car[] findCarByColor(String color);
    int quantity();

}
