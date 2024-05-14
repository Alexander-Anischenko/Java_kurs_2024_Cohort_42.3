package consultation_14.interfaces;

public class BMW_M5 implements Car {
    @Override
    public void startEngine() {
        System.out.println("BMW M5 is starting engine. ");
    }

    @Override
    public void stopEngine() {
        System.out.println("BMW M5 is stopping engine. ");
    }

    @Override
    public void go() {
        System.out.println("BMW M5 is going. ");
    }

    @Override
    public void stop() {
        System.out.println("BMW M5 is stopping. ");
    }

    @Override
    public void lightOn() {
        System.out.println("BMW M5 turned on lights. ");
    }

    @Override
    public void lightOff() {
        System.out.println("BMW M5 turned off lights. ");
    }

    public void helloWorld() {
        System.out.println("Hello world!");
    }
}
