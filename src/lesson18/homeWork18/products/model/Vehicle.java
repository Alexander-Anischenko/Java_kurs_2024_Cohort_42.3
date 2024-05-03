package lesson18.homeWork18.products.model;

/*Задача 3. Создайте класс Vehicle с полями:

длина;
ширина.*/

public class Vehicle {
    private double lengthOfVehicle;
    private double widthOfVehicle;

    public Vehicle(double lengthOfVehicle, double widthOfVehicle) {
        this.lengthOfVehicle = lengthOfVehicle;
        this.widthOfVehicle = widthOfVehicle;
    }

    public double getLengthOfVehicle() {
        return lengthOfVehicle;
    }

    public void setLengthOfVehicle(double lengthOfVehicle) {
        this.lengthOfVehicle = lengthOfVehicle;
    }

    public double getWidthOfVehicle() {
        return widthOfVehicle;
    }

    public void setWidthOfVehicle(double widthOfVehicle) {
        this.widthOfVehicle = widthOfVehicle;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "lengthOfVehicle=" + lengthOfVehicle +
                ", widthOfVehicle=" + widthOfVehicle +
                '}';
    }
}
