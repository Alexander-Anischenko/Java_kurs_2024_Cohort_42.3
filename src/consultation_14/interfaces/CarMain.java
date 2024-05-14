package consultation_14.interfaces;

public class CarMain {
    public static void main(String[] args) {
        Car car1 = new KiaRio();
        Car car2 = new BMW_M5();

        car1.go();
        car2.lightOn();
        car2.startEngine();
        car1.stopEngine();
        car2.go();
        car1.stop();
        System.out.println("=============================================");

        Car[] cars = {car1, car2};
        for (Car car: cars) {
            car.startEngine();
            car.lightOn();
            car.go();
            car.stop();
            car.stopEngine();

            if (car instanceof BMW_M5) {
                BMW_M5 bmw = (BMW_M5) car;
                bmw.helloWorld();
            }
        }
    }
}
