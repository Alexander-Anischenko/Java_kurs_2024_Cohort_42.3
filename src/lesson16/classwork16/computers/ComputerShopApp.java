package lesson16.classwork16.computers;

import lesson16.classwork16.computers.model.SmartPhone;
import lesson16.classwork16.computers.model.Computer;
import lesson16.classwork16.computers.model.Laptop;

public class ComputerShopApp {
    public static void main(String[] args) {

        Computer[] comp = new Computer[6];

        comp[0] = new Computer("i7", 8, 256, "Asus", 1200);
        comp[1] = new Computer("i9", 16, 512, "Acer", 1800);
        comp[2] = new Laptop("M2", 16, 512, "Apple MacBook", 3000, 14, 2.15, 10);
        comp[3] = new Laptop("AMD", 64, 2042, "MCI", 3500, 21, 3.5, 4);
        comp[4] = new Laptop("Intel", 32, 1024, "MCI", 1500, 15, 2.5,6);
        comp[5] = new SmartPhone("Snapdragon 8 Gen 2", 12, 512, "Honor Magic 5 Pro", 850, 6.81, 0.210, 10, "Android 13",false);

        for (int i = 0; i < comp.length; i++) {
            System.out.println(comp[i]);
        }

        int sumSSD = 0;
        for (int i = 0; i < comp.length; i++) {
            sumSSD = sumSSD+comp[i].getSsd();
        }
        System.out.println("Total ssd memory = " + sumSSD);

        double totalPrice = 0;
        for (int i = 0; i < comp.length; i++) {
            totalPrice += comp[i].getPrice();
        }
        System.out.println("Total price = " + totalPrice);
    }
}
