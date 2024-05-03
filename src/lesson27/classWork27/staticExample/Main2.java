package lesson27.classWork27.staticExample;

public class Main2 {
    public static void main(String[] args) {

        Car bmw = new Car(0, "BMW");
        Car audi = new Car(35, "AUDI");

        bmw.go(20);
        audi.go(3);
        bmw.go(43);
        audi.go(12);
        bmw.go(52);

        System.out.println(bmw);
        System.out.println(audi);
        System.out.println(Car.totalMileage);
    }
}
