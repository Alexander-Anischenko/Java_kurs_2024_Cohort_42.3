package lesson13;
//Создать массив из 20 случайных целых чисел в интервале от -100 до 100.
//Сколько в нем получилось отрицательных чисел?
//Сформируйте из них новый массив.

import lesson12.ArraysMetods;

public class FindInArray {
    public static void main(String[] args) {

        int[] array = new int[20];
        int a = -100;
        int b = 100;

        ArraysMetods.fillArray(array, a, b);
        ArraysMetods.printArray(array);

        // step 1 - count Quantity of negative elements
        int count = countNegativeElementsInArray(array);

        // step 2 - create new array and move negativenumbers to new array
        int[] newArray = new int[count];
        fillNewArray(array, newArray);
        ArraysMetods.printArray(newArray);

    } // end of main

    private static void fillNewArray(int[] array, int[] newArray) {
        for (int i = 0, j = 0; j < newArray.length; i++) {
            if (array[i] < 0) {
                newArray[j++] = array[i];
            }
        }
    }

    private static int countNegativeElementsInArray(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                count++;
            }
        }
        return count;
    }

}
