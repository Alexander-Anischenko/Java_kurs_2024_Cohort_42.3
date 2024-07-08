package lesson45.classWork45.primitive_stream;

import java.util.IntSummaryStatistics;
import java.util.Random;
import java.util.stream.Stream;

public class PrimitiveStreamExample {

    private static final int N_NUMBERS = 10;
    private static final  int MIN =1;
    private static final  int MAX =10;

    public static void main(String[] args) {

        // получить случайные целые числа в виде потока
        Stream<Integer> numbers = getRandomNumbers( N_NUMBERS, MIN, MAX);
        numbers.forEach(System.out::println);

        System.out.println("<================= Sum of numbers ==================>");

        int sum = getRandomNumbers(N_NUMBERS, MIN, MAX)
                .mapToInt(Integer::intValue)
                .peek(System.out::println) //текущая печать
                .sum();

        System.out.println("Sum: " + sum);

        System.out.println("<================= Summary statistics ==================>");

        IntSummaryStatistics intStat = getRandomNumbers(N_NUMBERS, MIN, MAX)
                .mapToInt(Integer::intValue)
                .summaryStatistics(); //Terminal

        System.out.println("Min = " + intStat.getMin());
        System.out.println("Max = " + intStat.getMax());
        System.out.println("Average value = " + intStat.getAverage());
        System.out.println("Sum = " + intStat.getSum());

        System.out.println("<================= Lotto 6 from 49 ==================>");
        new Random()
                .ints(1, 50)
                .distinct()
                .limit(6)
                .forEach(System.out::println);

        System.out.println("<================= Shuffle ==================>");
        int[] arr = {10, 20, 30, 40, 50};

        new Random()
                .ints(0, arr.length)
                .distinct()
                .limit(arr.length)
                .forEach(i -> System.out.println(arr[i]));


    }

    private static Stream<Integer> getRandomNumbers(int nNumbers, int min, int max) {
        return new Random()
                .ints(min, max)
                .limit(nNumbers)
                .mapToObj(n->(Integer) n); // то-же самое,что .boxed()
                //.boxed(); // терминальная операция
    }
}
