package lesson16.classwork16.computers.model;

public class Laptop extends Computer {

    private double displaySize;
    private double weight;
    private int batteryCapacity;

    public Laptop(String cpu, int ram, int ssd, String brand, double price, double displaySize, double weight, int batteryCapacity) {
        super(cpu, ram, ssd, brand, price);
        this.displaySize = displaySize;
        this.weight = weight;
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public String toString() {
        return super.toString() + "Laptop{" +
                "displaySize=" + displaySize +
                ", weight=" + weight +
                ", batteryCapacity=" + batteryCapacity +
                '}';
    }
}
