package lesson11;

import java.util.Random;
import java.util.Scanner;

public class HomeWork11 {
    public static void main(String[] args) {


        Random random = new Random();


        Scanner scanner = new Scanner(System.in);
        // Create neu array of 10 random natural numbers between -20 and 20
        int [] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(41) - 20;
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        //Task 1
        //Ask the number
        System.out.println("Enter a natural number between -20 and 20: ");
        int num = scanner.nextInt();
        //Determine if this number is in the array vis metod searchInArray
        boolean found = searchInArray(arr, num);
        if (found) {
            System.out.println("The number " + num + " was found");
        } else {
            System.out.println("The number " + num + " was not found");
        }

        //Task 2
        double mean = searchArithMean(arr);
        System.out.println("Arithmetic mean is: " + mean);
        System.out.println();

        // Create neu array of 10 random natural numbers between -10 and 10
        int [] arr2 = new int[10];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = random.nextInt(21) - 10;
            System.out.println(arr2[i] + " ");
            //System.out.println();


        // Task 3
        int odd = calculateOddElements(arr2);
        System.out.println("Summ of all odd elements is: " + odd);

        // Task 4
        int even = multiplicateEvenElements(arr2);
            System.out.println("Multiply of all even elements is: " + even);

        // Task 5

        }
    }

    //Task 1
    public static boolean searchInArray(int[] array, int value) {
        for (int i : array) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    //Task 2
    public static double searchArithMean(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (double) sum/ array.length;
    }

    // Task 3
    public static int calculateOddElements(int[] array) {
        int a = 0;
        for (int num : array) {
            if (num % 2 != 0) {
                a += num;
            }
        }
        return a;
    }

    // Task 4
    public static int multiplicateEvenElements(int[] array) {
        int a = 1;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                a *= array[i];
            }
        }
        return a;
    }

    // Task 5

//    public static int[] getRewersArray(int[] array) {
//
//    }

}