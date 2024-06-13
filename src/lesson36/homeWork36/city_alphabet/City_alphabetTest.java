package lesson36.homeWork36.city_alphabet;

import lesson36.classWork36.sity_arrays.City;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class City_alphabetTest {
    City_alphabet[] cities;

    //     - найти индекс элемента в массиве Comparable объектов
//    - найти индекс элемента в массиве объектов, отсортированных с помощью Comparator
//    - скопировать часть массива в новый массив
//    - создать копию массива, увеличить его длину, вставить содержимое внутрь
//    - увеличить размер массива, отсортировать новый массив, найти в нем индекс, куда встанет добавляемый элемент
//    - вставить новый объект в массив, соблюдая порядок сортировки

    @BeforeEach
    void setUp() {
        cities = new City_alphabet[6];
        cities[0] = new City_alphabet("Berlin", 800_000, "USA", 7.0);
        cities[1] = new City_alphabet("Berlin", 670_000, "USA", 7.5);
        cities[2] = new City_alphabet("Chicago", 2_700_000, "USA", 6.0);
        cities[3] = new City_alphabet("Atlanta", 470_000, "USA", 8.0);
        cities[4] = new City_alphabet("New York", 8_500_000, "USA", 6.5);
        cities[5] = new City_alphabet("Dallas", 1_300_000, "USA", 3.0);
    }

    private void printArray(Object[] arr, String title) {
        System.out.println("<============" + title + "==================>");
        for (Object o : arr) {
            System.out.println(o);
        }
    }

    //     - найти индекс элемента в массиве Comparable объектов
    @Test
    void testComparable() {
        printArray(cities, "Original array: ");
        Arrays.sort(cities);
        printArray(cities, "Native sorting by name");
        // depending on the name of the city, the expected index changes: Alabama -1; Orlando -7.
        City_alphabet city = new City_alphabet("Alabama", 0, null, 0);
        int index = Arrays.binarySearch(cities, city);
        System.out.println("Index => " + index);
    }

}