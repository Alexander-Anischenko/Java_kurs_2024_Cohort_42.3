package lesson27.classWork27.final_example;

public class CarApp {
    public static void main(String[] args) {
        // так делать не надо final обычно не изменяются
        final Car car = new Car(2008, "BMW");
        car.builtYear = 2050;
        System.out.println(car);
    }
}
