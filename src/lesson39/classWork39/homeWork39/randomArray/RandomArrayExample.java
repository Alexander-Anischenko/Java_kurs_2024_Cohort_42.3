package lesson39.classWork39.homeWork39.randomArray;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomArrayExample {
    public static void main(String[] args) {

        List<Integer> randomArray = new ArrayList<Integer>();

        int capacity = 20;
        Random random = new Random();
        for (int i = 0; i < capacity; i++) {
            int randNumber = 1 + random.nextInt(10);
            randomArray.add(randNumber);
        }
        for (Integer in : randomArray) {
            System.out.print(in + ", ");
        }
        System.out.println();

        List<Integer> newArrayList = new ArrayList<>();
        for (Integer n : randomArray) {
            if (! newArrayList.contains(n)) {
                newArrayList.add(n);
            }
        }
        System.out.println("Array list without duplicates => " + newArrayList);
    }
}
