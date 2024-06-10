package lesson35.homeWork33_34.city_comparable;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

public class CityTest {
    City[] cities;
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
    private void printArray(Object[] arr, String reportTitle) {
        System.out.println("<=======" + reportTitle + "========>");
        for (Object o : arr) {
            System.out.println(o);
        }
    }
    @Test
    void testArray() {
        printArray(cities, "list of sities");
    }

    @Test
    void testNativeSorting() {
        printArray(cities, "list of sities as is");
        Arrays.sort(cities);
        printArray(cities, "list of sities sorted by name");
    }
    @Test
    void testComparator() {
        //Comparator<City> comparator = (c1, c2) ->(int) (c1.getIndex() - c2.getIndex());
        Comparator<City> comparator1 = (c1, c2) -> Double.compare(c1.getIndex(), c2.getIndex());
        printArray(cities, "Before sorting");
        Arrays.sort(cities);//native
        printArray(cities, "After sorting by name");
        Arrays.sort(cities, comparator1);
        printArray(cities, "After sorting by index");
    }
}
