package lesson23.homeWork23;
/* В классе Calculator реализовать 5 методов для калькулятора (сложение, вычитание, умножение,
деление с остатком, целая часть от деления), которыйработает с целыми числами.*/

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 2 number-> ");
        int a = scanner.nextInt();

        int b = scanner.nextInt();

        int sum = addition(a, b);
        System.out.println("Sum of two numbers-> " + sum);

        int difference = subtraction(a, b);
        System.out.println("difference of two numbers-> " + difference);

        int product = multiplication(a, b);
        System.out.println("Product of two numbers-> " + product);

        int remainder = divisionWithRemainder(a, b);
        System.out.println("Remainder of two numbers-> " + remainder);

        int integerPart = divisionWithIntegerPart(a, b);
        System.out.println("Integer part of division-> " + integerPart);
    }

    public static int divisionWithIntegerPart(int a, int b) {
        return a / b;
    }

    public static int  divisionWithRemainder(int a, int b) {
        return a % b;
    }

    public static int subtraction(int a, int b) {
        return a - b;
    }

    public static int multiplication(int a, int b) {
        return a * b;
    }

    public static int addition(int a, int b) {
        return a + b;
    }
}
