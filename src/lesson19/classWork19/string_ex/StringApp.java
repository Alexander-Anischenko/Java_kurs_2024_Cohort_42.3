package lesson19.classWork19.string_ex;

import java.util.Scanner;

public class StringApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = "Hello";
        String str2 = "Hello";

        System.out.println(str1 == str2);
        String str3 = new String("Hello");

        System.out.println(str1 == str3);
        System.out.println(str1.equals(str3));

        System.out.println("Input string: ");
        String str4 = scanner.nextLine();
        System.out.println(str1.equals(str4));
        System.out.println(str2.equals(str4));
        System.out.println(str3.equals(str4));
    }
}
