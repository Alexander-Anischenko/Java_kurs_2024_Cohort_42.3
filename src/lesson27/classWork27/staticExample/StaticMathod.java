package lesson27.classWork27.staticExample;

public class StaticMathod {
    public static void main(String[] args) {


        Car bmw = new Car(0, "BMW");
        bmw.go(31);
        bmw.go(64);
        bmw.go(98);

        Car audi = new Car(15, "AUDI");
        audi.go(31);
        audi.go(64);
        audi.go(38);

        String carArt = Car.drawCar(bmw);
        System.out.println(carArt);

        String carArt2 = Car.drawCar(audi);
        System.out.println(carArt2);
    }
}
