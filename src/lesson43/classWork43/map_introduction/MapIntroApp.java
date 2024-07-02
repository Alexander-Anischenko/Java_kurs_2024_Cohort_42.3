package lesson43.classWork43.map_introduction;

import java.util.*;

public class MapIntroApp {
    public static void main(String[] args) {
        // создадим Map, которая содержит наименование города и его население

        // key это город, тип String
        // value это население, тип Integer
        Map<String, Integer> usaCities = new TreeMap<>(); // create object, type of object- TreeMap
        usaCities.put("Denver", 600_000);
        usaCities.put("Boston", 670_000);
        usaCities.put("Chicago", 2_700_000);
        usaCities.put("Atlanta", 470_000);
        usaCities.put("New York", 8_500_000);
        usaCities.put("Dallas", 1_300_000);
        usaCities.replace("Dallas", 1_300_010); //update

        //map size
        System.out.println("Size of sities: " + usaCities.size()); // 6
        System.out.println(usaCities.isEmpty()); //false

        int population = usaCities.get("Chicago");
        System.out.println("Population of Chicago is " + population);

        int population1 = usaCities.get("Dallas");
        System.out.println("Population of Dallas is " + population1);

        //check key
        System.out.println(usaCities.containsKey("Boston")); // true
        System.out.println(usaCities.containsKey("Texas")); // false

        //1st approach подход
        Collection<Integer> totalPopulation = usaCities.values(); // create new object
        int total = 0;

        for (Integer i : totalPopulation) {
            //total = total + i;
            total += i;
        }
        System.out.println("Total population in cicies: " + total);

        //2st approach подход
        Set<String> setOfCities = usaCities.keySet();
        total = 0;
        for (String str : setOfCities) {
            total += usaCities.get(str);
        }
        System.out.println("Total population in cicies: " + total);

        // Pint map
        System.out.println("<========================== Pint map =========================>");
        Set<String> keys = usaCities.keySet();
        for (String str : keys) {
            System.out.println(str);
        }

        //print map using Entry
        Set<Map.Entry<String, Integer>> entries = usaCities.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + " => " + entry.getValue());


        }
        // print map another time
        System.out.println(usaCities.entrySet());
    }
}
