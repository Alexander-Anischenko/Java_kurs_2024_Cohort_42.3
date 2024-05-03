package lesson13;
/*. Заполните массив целыми числами от 1 до 100.
 Добавьте случайное целое число в интервале от 1 до 100 на случайное место в исходный массив.
 Найдите наиболее коротким способом, какое число было добавлено в массив*/

import java.util.Random;

public class HomeWork13 {
    public static void main(String[] args) {
        // Create an array of 100 elements
        int maxValue = 100;
        int[] array = new int[maxValue + 1];

        // Fill an array with integers from 1 to 100
        for (int i = 0; i < maxValue; i++) {
            array[i] = i + 1;
        }

        // Find the sum of the initial array
        int sumOfNumbers = maxValue * (maxValue +1) / 2;
        System.out.println("Sum of the initial array; " + sumOfNumbers);

        // Add a random number between 1 and 100 to a random place in the array
        Random random = new Random();
        // Random index
        int randomIndex = random.nextInt(maxValue + 1);
        // Random value
        int randomValue = random.nextInt(maxValue) +1;
        // Shift array elements
        for (int i = maxValue; i > randomIndex; i--) {
            array[i] = array[i - 1];
        }
        array[randomIndex] = array[randomValue];

        // Find the sum of the obtained array
        int sum = sumOfArray(array);
        System.out.println("Find sum of the obtained array: " + sum);

        // Find the desired number mathematically by calculating the sum of numbers of the initial array
        // from the sum of numbers of the obtained array

        int num = sum - sumOfNumbers;
        System.out.println("Added number is: " + num);

    }

    private static int sumOfArray(int[] array) {
        int a = 0;
        for (int i = 0; i < array.length; i++) {
            a += array[i];
        }
        return a;
    }
}
