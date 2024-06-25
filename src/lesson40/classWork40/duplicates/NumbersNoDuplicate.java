package lesson40.classWork40.duplicates;
/*- Создайте массив из 10 случайных чисел в интервале от 1 до 10.
Необходимо удалить из него все дубликаты.
Сколько чисел осталось после удаления дубликатов?*/

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class NumbersNoDuplicate {
    public static void main(String[] args) {

        int[] numbers = new int[10];
        int a = 1, b = 11;
        Random random = new Random();

        // fill array

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(a, b);
        }

        //print array
        System.out.println("<================= Numbers (array) =================>");
        for (Integer num : numbers) {
            System.out.print(num + " | ");
        }

        Set<Integer> uniqueNumbers = new HashSet<>();
        System.out.println("<================= Empty set =================>");
        System.out.println("Size of set: " + uniqueNumbers.size()); // 0
        System.out.println("Is empty: " + uniqueNumbers.isEmpty()); // true

        System.out.println("<================= Unique numbers from array =================>");

        //fori
//        for (int i = 0; i <numbers.length; i++) {
//            // add elements from array to HashSet uniqueNumbers
//            uniqueNumbers.add(numbers[i]);
//        }
//
//        System.out.println(uniqueNumbers);
        for (Integer i : numbers) {
            uniqueNumbers.add(i);
        }
        for (Integer i : uniqueNumbers) {
            System.out.print(i + " | ");
        }

        System.out.println();
        System.out.println("Unique numbers quantity: " + uniqueNumbers.size());
    }
}
