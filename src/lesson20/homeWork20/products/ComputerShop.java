package lesson20.homeWork20.products;


import lesson20.homeWork20.products.controller.Stock;
import lesson20.homeWork20.products.model.Computer;

import java.math.BigInteger;

public class ComputerShop {
    public static void main(String[] args) {

        Stock stock = new Stock(100);
        stock.addComputer(new Computer("HP", "i5", 16,  new BigInteger("12345678901234567890")));
        stock.addComputer(new Computer("HP1", "i5", 16,  new BigInteger("22345678901234567890")));
        stock.addComputer(new Computer("HP2", "i5", 16,  new BigInteger("32345678901234567890")));
        stock.addComputer(new Computer("HP3", "i5", 16,  new BigInteger("42345678901234567890")));

        System.out.println("Number of computers: " + stock.getSize());
        System.out.println();

        stock.printComputers();

        stock.removeComputer(new BigInteger("22345678901234567890"));

        System.out.println("Number of computers: " + stock.getSize());
        System.out.println();

        stock.printComputers();

    }
}
