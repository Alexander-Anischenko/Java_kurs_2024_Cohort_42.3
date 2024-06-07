package lesson34.classWork34.coffee;

import java.util.Scanner;

public class CoffeeApp {
    public static void main(String[] args) {
        System.out.println("Welcome to our CoffeeShop!");

        Coffee[] menu = Coffee.values();
        for (int i = 0; i < menu.length; i++) {
            System.out.println(i + 1 + " - " + menu[i].getName());
        }
        Scanner scanner = new Scanner(System.in);
        int choice;
        while (true) {
            System.out.println("Inpunt your choice: ");
            choice = scanner.nextInt();
            if (choice == 0) {

                System.out.println("Exiting...");
                break;
            }


            switch (choice) {
                case 1, 2, 3, 4 -> {
                    System.out.println("Here you are: " + menu[choice - 1].getName() + ", price" + menu[choice - 1].getPrice());
                }
                default -> {
                    System.out.println("Wrong choice!");
                }
            }
        }
        scanner.close();
    }
}
