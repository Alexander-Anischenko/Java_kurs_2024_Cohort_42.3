package lesson14.car;

import lesson14.car.model.Car;

public class CarApp {
    public static void main(String[] args) {

        Car car = new Car("white", "BMW", false, 25000, 2016, 145000);
        car.displayCar();
        car.moveCar();

    }
}
