package lesson39.classWork39.homeWork39.solarSystem;

/*Display a list of planets sorted by:
order of location in the solar system;
alphabet;
mass;
number of satellites.*/

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SolarSystemApp {
    public static void main(String[] args) {
        List<Planet> solarSystem = new ArrayList<>();

        Planet planet = new Planet("Earth", 149.6, 5_972_300, 1);
        solarSystem.add(planet);

        solarSystem.add(new Planet("Mars", 227.92, 641_710, 2));
        solarSystem.add(new Planet("Venus", 108.2, 4_876_500, 0));
        solarSystem.add(new Planet("Mercury", 57.91, 330_104, 0));
        solarSystem.add(new Planet("Jupiter", 778.57, 1_898_200_000, 79));
        solarSystem.add(new Planet("Saturn", 1433.53, 568_340_000, 82));
        solarSystem.add(new Planet("Uranus", 2872.46, 86_810_000, 27));
        solarSystem.add(new Planet("Neptune", 4495.06, 102_410_000, 14));
        int size = solarSystem.size();
        System.out.println("Number of planets => " + size);

        System.out.println("<============= unsorted list =================>");
        for (Planet planets : solarSystem) {
            System.out.println(planets);
        }

        //sorting by order of location in the solar system
        solarSystem.sort(Planet::compareTo);
        System.out.println("<============= sorted by order of location =================>");
        for (Planet planets : solarSystem) {
            System.out.println(planets);
        }

        // sorting by alphabet
        Comparator<Planet> alphabetComparator = new Comparator<Planet>() {
            @Override
            public int compare(Planet o1, Planet o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
        System.out.println("<============= sorted by alphabet =================>");
        solarSystem.sort(alphabetComparator);
        for (Planet planets : solarSystem) {
            System.out.println(planets);
        }

        // sorting by mass
        Comparator<Planet> massComparator = new Comparator<Planet>() {
            @Override
            public int compare(Planet o1, Planet o2) {
                return Double.compare(o1.getMassQuadTon(), o2.getMassQuadTon());
            }
        };
        System.out.println("<============= sorted by mass =================>");
        solarSystem.sort(massComparator);
        for (Planet planets : solarSystem) {
            System.out.println(planets);
        }

        // sorting by number of satellites
        Comparator<Planet> satNumComparator = new Comparator<Planet>() {
            @Override
            public int compare(Planet o1, Planet o2) {
                return Integer.compare(o1.getSatNumber(), o2.getSatNumber());
            }
        };
        System.out.println("<============= sorted by number of satellites =================>");
        solarSystem.sort(satNumComparator);
        for (Planet planets : solarSystem) {
            System.out.println(planets);
        }
    }
}
