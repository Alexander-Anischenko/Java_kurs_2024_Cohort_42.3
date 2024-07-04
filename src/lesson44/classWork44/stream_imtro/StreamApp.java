package lesson44.classWork44.stream_imtro;

import java.util.ArrayList;
import java.util.List;

public class StreamApp {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(11, -9, 122, -17, 32, 458, -5, 6, 7));

        numbers.stream()
                .filter(n-> n>0)
                .sorted((n1, n2) -> - Integer.compare(n1, n2)) // sorting
                .forEach(System.out::println);

        for (Integer i : numbers) {
            System.out.print(i + " ");
        }
    }
}
