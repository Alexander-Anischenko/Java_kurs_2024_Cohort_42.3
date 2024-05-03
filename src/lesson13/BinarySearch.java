package lesson13;

import lesson12.ArraysMetods;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {

        //create array
        int a = -10;
        int b = 10;
        int [] numbers = new  int[10];
        ArraysMetods.fillArray(numbers, a, b);
        ArraysMetods.printArray(numbers);

        // sorting array
        ArraysMetods.bubbleSort(numbers);
        ArraysMetods.printArray(numbers);

        //binary search
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input integer number: ");
        int num = scanner.nextInt();

        int index = ArraysMetods.binarySearch(numbers,num);
        System.out.println("Index = " + index);
    }
}
