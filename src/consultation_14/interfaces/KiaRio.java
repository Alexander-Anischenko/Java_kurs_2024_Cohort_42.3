package consultation_14.interfaces;

public class KiaRio implements Car {

    @Override
    public void startEngine() {
        System.out.println("Kia Rio is starting engine. ");
    }

    @Override
    public void stopEngine() {
        System.out.println("Kia Rio is stopping engine. ");
    }

    @Override
    public void go() {
        System.out.println("Kia Rio is going. ");
    }

    @Override
    public void stop() {
        System.out.println("Kia Rio is stopping. ");
    }

    @Override
    public void lightOn() {
        System.out.println("Kia Rio turned on lights. ");
    }

    @Override
    public void lightOff() {
        System.out.println("Kia Rio turned off lights. ");
    }
}
