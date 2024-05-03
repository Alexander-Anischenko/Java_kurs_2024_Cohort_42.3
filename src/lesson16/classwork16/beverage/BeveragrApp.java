package lesson16.classwork16.beverage;

import lesson16.classwork16.Beverage;

public class BeveragrApp {
    public static void main(String[] args) {

        Beverage b1 = new Beverage("Milk", false, "Bauern", 2, "box");
        b1.toBuy("Milk", "box", 3);
        b1.displayStock();

        Beer beer = new Beer("Beer", true, "Pauliner", 2, "box", true, "white");
        beer.toBuy("Beer", "box", 5);
        beer.displayStock();
    }
}
