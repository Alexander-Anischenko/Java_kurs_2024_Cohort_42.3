package lesson29.classWork29;

public class CarApp {
    public static void main(String[] args) {
        Transport bmw = new Transport("bmw", "personal", 4);
        System.out.println(bmw);

        bmw.go();
        bmw.handleAnimalOnWay();
    }
}
