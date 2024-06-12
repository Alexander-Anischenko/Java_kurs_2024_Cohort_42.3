package lesson36.classWork36.sity_arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class CityTest {

    City[] cities;

    //     - найти индекс элемента в массиве Comparable объектов
//    - найти индекс элемента в массиве объектов, отсортированных с помощью Comparator
//    - скопировать часть массива в новый массив
//    - создать копию массива, увеличить его длину, вставить содержимое внутрь
//    - увеличить размер массива, отсортировать новый массив, найти в нем индекс, куда встанет добавляемый элемент
//    - вставить новый объект в массив, соблюдая порядок сортировки

    @BeforeEach
    void setUp() {
        cities = new City[6];
        cities[0] = new City("Berlin", 800_000, "USA", 7.0);
        cities[1] = new City("Berlin", 670_000, "USA", 7.5);
        cities[2] = new City("Chicago", 2_700_000, "USA", 6.0);
        cities[3] = new City("Atlanta", 470_000, "USA", 8.0);
        cities[4] = new City("New York", 8_500_000, "USA", 6.5);
        cities[5] = new City("Dallas", 1_300_000, "USA", 3.0);
    }
    private void printArray(Object[] arr, String title) {
        System.out.println("<============" + title + "==================>");
        for (Object o : arr) {
            System.out.println(o);
        }
    }

    //найти индекс элемента в массиве Comparable объектов
    @Test
    void testComparable() {
        printArray(cities,"Original array: ");
        Arrays.sort(cities);
        printArray(cities, "Native sorting by population");
        City city = new City(null, 1300000, null, 0);
        int index = Arrays.binarySearch(cities, city);
        System.out.println("Index = " + index);
    }

    //    - найти индекс элемента в массиве объектов, отсортированных с помощью Comparator
    @Test
    void testComparator() {
        Comparator<City> comparatorByName = (c1, c2) -> c1.getName().compareTo(c2.getName());
        Arrays.sort(cities, comparatorByName);
        printArray(cities, "Sorting by name");
        City findCity = new City("Chicago", 0, null, 0);
        int index = Arrays.binarySearch(cities, findCity, comparatorByName);
        System.out.println("Index = " + index);
    }
    //    - скопировать часть массива в новый массив
    @Test
    void testCopyOfRange() {
        printArray(cities, "List of cities as is");
        City[] citiesCopyRange = Arrays.copyOfRange(cities, 2, cities.length);
        printArray(citiesCopyRange, "Cities copy of range from 2 to last");
    }
    //    - создать копию массива, увеличить его длину, вставить содержимое внутрь
    @Test
    void testSystemArrayCopy() {
        printArray(cities, "List of cities as is");
        City[] citiesCopy = new City[cities.length * 2];
        System.arraycopy(cities,1, citiesCopy,4, cities.length - 2);
        printArray(citiesCopy, "System.arraycopy");
    }

    //    - увеличить размер массива, отсортировать новый массив, найти в нем индекс, куда встанет добавляемый элемент

    @Test
    void testArrayCopy() {
        City[] citiesCopy = Arrays.copyOf(cities, cities.length * 2);
        printArray(citiesCopy, "citiesCopy befor sort");
        Arrays.sort(cities);
        printArray(cities, "citiesCopy after sort of sities");
        Comparator<City> comparator = (c1, c2) -> c1.getName().compareTo(c2.getName());
        Arrays.sort(citiesCopy, 0, cities.length, comparator);
        printArray(citiesCopy, "citiesCopy sort by name");
        System.out.println("<============================>");
        City newCity = new City("Astana", 0, null, 0);
        int index = Arrays.binarySearch(citiesCopy, 0, cities.length, newCity, comparator);
        System.out.println("City: " + newCity.getName() + ", index" + index);
    }
    //    - вставить новый объект в массив, соблюдая порядок сортировки

    @Test
    void testKeepSorted() {
        Arrays.sort(cities);
        printArray(cities, "Native order (population)");
        City city = new City("Gothem", 690000, "USA", 1);
        City[] citiesCopy = Arrays.copyOf(cities, cities.length + 1); //создаем копию мамссива длинной +1
        int index = Arrays.binarySearch(citiesCopy,0,citiesCopy.length - 1, city);
        index = index >= 0 ? index : - index - 1; //обработали полученный индекс
        System.arraycopy(citiesCopy, index, citiesCopy, index + 1, citiesCopy.length - index - 1);//раздвигаем массив
        citiesCopy[index] = city; //ставим элемент на нужное место
        cities = citiesCopy;
        printArray(cities, "Added sity and array keep sorted");

    }
}