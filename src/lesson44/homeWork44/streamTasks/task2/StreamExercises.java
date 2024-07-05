package lesson44.homeWork44.streamTasks.task2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExercises {
    public static void main(String[] args) {
        // Вместо обычного класса Instead regular class
        List<Integer> list = Arrays.asList(5, 3, 8, 1, 9, 2);

        // Сортировка списка в обратном порядке с использованием лямбда-выражения Sorting a list in reverse order using a lambda expression
        list.sort((x, y) -> Integer.compare(y, x));

        // Сортировка списка с блоком кода в лямбда-выражении
        list.sort((x, y) -> {
            System.out.println("Comparing " + x + " and " + y);
            return Integer.compare(y, x);
        });

        // Вывод отсортированного списка Output sorted list
        list.forEach(System.out::println);

        System.out.println();
        System.out.println("<====================================>");

        // Вместо анонимного класса Instead of an anonymous class
        Consumer<String> consumer1 = new Consumer<String>() {
            @Override
            public void accept(String string) {
                System.out.println(string);
            }
        };
        // Лямбда-выражение
        Consumer<String> consumer2 = s -> System.out.println(s);
        // Использование потребителей
        consumer1.accept("Hello from anonymous class");
        consumer2.accept("Hello from lambda expression");

        System.out.println();
        System.out.println("<====================================>");

        //Методные ссылки в Java — это короткий способ написания лямбда-выражений, которые вызывают один метод с теми же параметрами в том же порядке.
        // Они делают код более читаемым и понятным. Существует несколько типов методных ссылок:
        //Примеры использования методных ссылок
        //Ссылка на статический метод
        //Формат: <ClassName>::<methodName>
        list.sort(StreamExercises::compareNumbers);

        list.forEach(System.out::println);

        System.out.println();
        System.out.println("<====================================>");

        // Ссылка на метод экземпляра объекта
        //Формат: <ObjectReference>::<methodName>

        List<String> words = Arrays.asList("apple", "banana", "cherry");

        // Использование методной ссылки на метод экземпляра объекта
        words.forEach(System.out::println);

        System.out.println();
        System.out.println("<====================================>");

        //Ссылка на метод конкретного объекта
        //Формат: <ClassName>::<methodName>
        // Использование методной ссылки на метод экземпляра
        words.sort(String::compareToIgnoreCase);

        words.forEach(System.out::println);

        System.out.println();
        System.out.println("<====================================>");

        // Ссылка на конструктор
        //Формат: <ClassName>::new
        Stream<String>  namesStream = Stream.of("John", "Jane", "Jack");
        // Использование методной ссылки на конструктор
        List<Person> people = namesStream.map(Person::new)
                .collect(Collectors.toList());

        people.forEach(person -> System.out.println(person.getName()));


    }

    public static int compareNumbers(Integer a, Integer b) {
        return Integer.compare(a, b);
    }
}
class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

