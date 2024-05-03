package lesson12;

public class ArrayApplication {
    public static void main(String[] args) {
         int[] numbers = {5, 9, -74, 64, -82, 27, 24, -17, 34, -2};
         ArraysMetods.printArray(numbers);
         int max = ArraysMetods.maxOfArray(numbers);
        System.out.println("Max of array: " + max);
        int maxIndex = ArraysMetods.indexMaxOfArray(numbers);
        System.out.println("Index max  of array: " + maxIndex);

        String[] dayOfWeek = {"Mo","Tu", "We", "Th", "Fr", "Sb", "Su"};
        ArraysMetods.printArray(dayOfWeek);

        ArraysMetods.bubbleSort(numbers);
        ArraysMetods.printArray(numbers);
    }
}
