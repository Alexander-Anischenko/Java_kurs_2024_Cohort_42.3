package lesson38.classWork38.complexity;
//заведем простой массив целых чисел
//будем выполнять с ним различные операции:
//        - вычисление среднего значения,
//        - поиск элемента,
//- поиск мин и макс,
//- сортировка
//оценим вычислительную сложность используемых алгоритмов

import java.util.Arrays;

public class ComplexityApp {
    public static void main(String[] args) {

        int[] array = {12, 17, 43, 115, -28, -4, -35};

        int sum = 0;// 1 операция O(1)
        for (int i = 0; i < array.length; i++) { // O(n) растет кол-во операций прямо пропорционально количеству элементов в массиве
            sum += array[i];// O(1)
        }
        double avg = (double) sum / array.length; //O(1)
        System.out.println("Average = " + avg);

        //Общая сложность : O(1) + O(n) + O(1) = O(n)

        System.out.println("Befor sorting: ");
        System.out.println(Arrays.toString(array));

        int index = Arrays.binarySearch(array, 100);
        System.out.println(index);

        //сортируем массив BubbleSort
        for (int i = 0; i < array.length - 1 ; i++) { //O(n)
            for (int j = 0; j < array.length - 1 - i; j++) { //O(n)
                if(array[j] > array[j + 1]) { // O(1)
                    // переставим элементы местами
                    int temp = array[j]; // O(1)
                    array[j] = array[j + 1]; // O(1)
                    array[j + 1] = temp; // O(1)
                }
            }
        }

        // Квадратичная сложность O(n^2)
        System.out.println("After sorting: ");
        System.out.println(Arrays.toString(array));
        index = Arrays.binarySearch(array, 100);
        System.out.println(index);

        index = Arrays.binarySearch(array, 115);
        System.out.println(index);

        Arrays.sort(array); //полилинейная сложность O(n*log(n))
        System.out.println("After sorting: ");
        System.out.println(Arrays.toString(array));

    }
}
