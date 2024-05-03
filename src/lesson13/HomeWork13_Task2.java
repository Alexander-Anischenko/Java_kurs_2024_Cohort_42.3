package lesson13;

/*Задача про поиск "счастливого пельменя". Хозяйка налепила для гостей 30 пельменей.
В один из пельменей она положила монету, которая увеличивает вес пельменя на 15 грамм.
Напишите программу, которая ищет счастливый пельмень.*/

import lesson12.ArraysMetods;

import java.util.Random;

public class HomeWork13_Task2 {
    public static void main(String[] args) {

        /// Create and fill an array of 30 elements with random numbers between 14 and 18
        int[] dumplings = new int[30];
        ArraysMetods.fillArray(dumplings, 14, 18);
        ArraysMetods.printArray(dumplings);

        // Add 15 to the random index
        addValue(dumplings, 15);
        ArraysMetods.printArray(dumplings);

        // Find the lucky dumpling by finding an index with equal to or higher than the minimum index value + 15,
        // which in this case is 29
        int luckyDumpling = 0;
        int luckyDuplingWeight = 0;
        for (int i = 0; i < dumplings.length; i++) {
            if (dumplings[i] >= 29) {
                luckyDumpling = i + 1;
                luckyDuplingWeight = dumplings[i];
            }
        }
        System.out.println("Lucky dumpling: " + luckyDumpling + " ,  with weight: " + luckyDuplingWeight);
    }

    // Method to add a value to a random index
    public static void addValue(int[] array, int value) {
        Random random = new Random();
        int randomIndex = random.nextInt(array.length);
        array[randomIndex] += value;
    }
}
