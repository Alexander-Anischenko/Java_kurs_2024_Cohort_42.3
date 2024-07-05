package lesson44.homeWork44.streamTasks.task1_streamExercises;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Exercise2 {
    public static void main(String[] args) {
        String[] array = {"Java", "Ruuuuussshhh"};
        Stream<String> streamOfArray = Arrays.stream(array);
        streamOfArray.map(s->s.split("")) //Преобразование слова в массив букв
                .flatMap(Arrays::stream).distinct() //выравнивает каждый сгенерированный поток в один поток
                .collect(Collectors.toList()).forEach(System.out::println);

        System.out.println("<====================================>");

        String[] array1 = {"Java", "Ruuuuussshhh"};
        Stream<String> streamOfArray1 = Arrays.stream(array1);
        streamOfArray1.map(s->s.split("")) //Преобразование слова в массив букв
                .map(Arrays::stream).distinct() //Сделать массив в отдельный поток
                .collect(Collectors.toList()).forEach(System.out::println);

        System.out.println("<====================================>");
        Stream.of(2, 3, 0, 1, 3) // Создаем поток из чисел 2, 3, 0, 1, 3
                .flatMapToInt(x -> IntStream.range(0, x))  // Преобразуем каждое число в поток чисел от 0 до (x-1)
                .forEach(System.out::print);// 010120012 // Выводим каждое число в результирующем потоке
        System.out.println();

        Stream.of(2, 3, 0, 1, 3)
                .map(x -> IntStream.range(0, x))
                .forEach(System.out::print);//перечень стримов(потоков);
    }
}
