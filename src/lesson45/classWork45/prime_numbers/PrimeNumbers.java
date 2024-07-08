package lesson45.classWork45.prime_numbers;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers {
    public static void main(String[] args) {
        //10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20
        // отфильтровать только простые числа

        List<Integer> numbers = new ArrayList<>(List.of(
                10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20
        ));

        numbers.stream()
                .forEach(n -> System.out.print(n + " | ")); // terminal
        System.out.println();
        System.out.println("<====================================>");
        System.out.println("Prime numbers: ");
        //1-st way
        numbers.stream()
                .filter(n -> isPrime(n)) //filter
                .forEach(n -> System.out.print(n + " | "));

        System.out.println();
        System.out.println("<====================================>");

        // 2-nd way
        numbers.stream()//map
                .map(n -> isPrime(n))
                .forEach(n -> System.out.print(n + " | "));



    }

    public static boolean isPrime(int n ) {
        int i = 2;
        while (i < n) {
            if (n % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }

}
