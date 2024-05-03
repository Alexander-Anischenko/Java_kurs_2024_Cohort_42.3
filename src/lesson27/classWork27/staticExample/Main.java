package lesson27.classWork27.staticExample;

public class Main {
    public static void main(String[] args) {

        Car bmw = new Car(0, "BMW");
        bmw.go(20);
        bmw.go(43);
        bmw.go(52);
        System.out.println(bmw);
    }
}
