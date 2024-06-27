package lesson41.homeWork41.cars.dao;

import lesson41.homeWork41.cars.model.Car;

public interface Garage {

    boolean addCar(Car car);
    Car removeCar(String regNumber);
    Car findCarByRegNumber(String regNumber);
    Car[] findCarByModel(String model);
    Car[] findCarByCompany(String company);
    Car[] findCarByEngine(double min, double max);
    Car[] findCarByColor(String color);

}
