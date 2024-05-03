package lesson19.classWork19.computer;

import java.util.Scanner;

public class ComputerApp {
    public static void main(String[] args) {

        Computer computer1 = new Computer("i5", 16, 512, "HP");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter cpu: ");
        String cpu = scanner.nextLine();

        System.out.println("Enter ram: ");
        int ram = scanner.nextInt();

        System.out.println("Enter SSD: ");
        int ssd = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Enter brand: ");
        String brand = scanner.nextLine();

        Computer computer2 = new Computer(cpu, ram, ssd, brand);

        System.out.println("Comp 1: " + computer1);
        System.out.println("Comp 2: " + computer2);

        System.out.println("Comp1 = Comp2: " + computer1.equals(computer2)); // True or false

    }
}
