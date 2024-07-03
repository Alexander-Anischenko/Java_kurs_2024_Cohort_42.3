package lesson43.homeWork43.map_tasks;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapWorldCountries {
    public static void main(String[] args) {

        //Создадим структуру Map из 20 стран на разных континентах
        Map<String, String> worldCountries = new HashMap<>();
        worldCountries.put("Nigeria", "Africa");
        worldCountries.put("Egypt", "Africa");
        worldCountries.put("South Africa", "Africa");
        worldCountries.put("Kenya", "Africa");
        worldCountries.put("China", "Asia");
        worldCountries.put("Japan", "Asia");
        worldCountries.put("India", "Asia");
        worldCountries.put("South Korea", "Asia");
        worldCountries.put("Germany", "Europe");
        worldCountries.put("France", "Europe");
        worldCountries.put("Russia", "Europe");
        worldCountries.put("Italy", "Europe");
        worldCountries.put("USA", "North America");
        worldCountries.put("Canada", "North America");
        worldCountries.put("Mexico", "North America");
        worldCountries.put("Brazil", "South America");
        worldCountries.put("Argentina", "South America");
        worldCountries.put("Chile", "South America");
        worldCountries.put("Australia", "Australia and Oceania");
        worldCountries.put("New Zealand", "Australia and Oceania");

        System.out.println("Number of countries on continents");

        // Количество стран из Африки Number of African countries
        // 1st approach
        // устанавливаем счетчик  на 0  set the counter to 0
        int africa = 0;
        // проходим по всем ключам структуры Map go through all key of the Map structure
        for (String country : worldCountries.keySet()) {
            // если при сравнении строки страны в структуре worldCountries мы получаем в поле value true
            // if we get true in the value field when comparing the country string in the worldCountries structure
            if (worldCountries.get(country).equals("Africa")) {
                // увеличиваем счетчик на одно значение increment the counter by one value
                africa++;
            }
        }
        // выводим количество стран в Африке output the number of countries in Africa
        System.out.println("Africa: " + africa);

        // Количество стран из Азии Number of countries from Asia
        // 2nd approach
        // устанавливаем счетчик  на 0  set the counter to 0
        int asia = 0;
        // проходим по всем значениям структуры Map go through all values of the Map structure
        for (String continent : worldCountries.values()) {
            // если при сравнении значения мы получаем true if we get true when comparing the value
            if (continent.equals("Asia")) {
                // увеличиваем счетчик на одно значение increment the counter by one value
                asia++;
            }
        }
        // выводим количество стран в Азии output the number of countries in Asia
        System.out.println("Asia: " + asia);

        int europe = 0;
        for (String country : worldCountries.keySet()) {
            if (worldCountries.get(country).equals("Europe")) {
                europe++;
            }
        }
        System.out.println("Europe: " + europe);

        int count = 0;
        for (String cont : worldCountries.values()) {
            if (cont.equals("North America")) {
                count++;
            }
        }
        System.out.println("North America: " + count);

        int s_a = 0;
        for (String country : worldCountries.keySet()) {
            if (worldCountries.get(country).equals("South America")) {
                s_a++;
            }
        }
        System.out.println("South America: " + s_a);

        int aO = 0;
        for (String cont : worldCountries.values()) {
            if (cont.equals("Australia and Oceania")) {
                aO++;
            }
        }
        System.out.println("Australia and Oceania: " + aO);
        System.out.println("<===================================================>");

        //3rd approach
        //Вызываем метод для подсчета стран на каждом континенте
        // для этого создаем структуру Map с именем continentCounts и используем метод, чтобы обработать worldCountries
        Map<String, Integer> continentCounts = countCountriesByContinent(worldCountries);
        // Выводим результаты
        System.out.println(continentCounts);
        // а теперь красиво
        // проходим по всем ключам структуры Map go through all key of the Map structure
        for (String continent : continentCounts.keySet()) {
            // выводим ключи и их значения output the keys and their values
            System.out.println(continent + ": " + continentCounts.get(continent));
        }
    }

    // метод принимает структуру Map в которой ключи и значения содержат переменную String method accepts Map structure in which keys and values contain String variable
    // возвращает структуру Map в которой ключи содержат переменную String, а значения содержат переменную Integer
    // returns a Map structure in which the keys contain a String variable and the values contain an Integer variable
    private static Map<String, Integer> countCountriesByContinent(Map<String, String> worldCountries) {
        //создаем структуру TreeMap для сортировки в алфавитном порядке
        Map<String, Integer> continentCount = new TreeMap<>();
        // проходим по всем значениям изначальной структуры Map go through all values of the Map structure
        for (String continent : worldCountries.values()) {
            //добавляем в новую структуру Map значения прошлой структуры как ключ и при каждом совпадении добавляем +1 к значению int начиная от 0
            continentCount.put(continent, continentCount.getOrDefault(continent, 0) + 1);
        }
        //возвращаем новую структуру
        return continentCount;
    }
}
