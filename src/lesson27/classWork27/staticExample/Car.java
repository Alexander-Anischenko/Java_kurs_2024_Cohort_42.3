package lesson27.classWork27.staticExample;

import java.util.Scanner;

public class Car {
    public String vendor;
    public double mileage;
    public static double totalMileage;
    static {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите изначальное значение для totalMileage: ");
        totalMileage = scanner.nextDouble();
    }


    public Car(double mileage, String vendor) {
        this.mileage = mileage;
        this.vendor = vendor;
    }

    @Override
    public String toString() {
        return "Car{" +
                "vendor='" + vendor + '\'' +
                ", mileage=" + mileage +
                '}';
    }
    public void go(double distance) {
        this.mileage += distance;
        Car.totalMileage += distance;
        System.out.println("Car " + this.vendor + "drove " + distance + "miles.");
        System.out.println("Общий пробег всех машин: "+ Car.totalMileage);

    }
    public static String drawCar(Car inputCar) {
        StringBuilder sb = new StringBuilder();
        sb.append("  ______\n");
        sb.append(" /|_||_\\`.__\n");
        sb.append("(   _    _ _\\\n");
        sb.append("=`-(_)--(_)-'   ");
        sb.append(inputCar.vendor);
        sb.append(", ");
        sb.append(inputCar.mileage + "/" + Car.totalMileage);
        // this.mileage; // ошибка, статический метод не имеет доступа к this,
        // потому что он связан только с классом Car, а не с объектами его типа
        return sb.toString();
    }
}
