package lesson39.classWork39.city_bus;
//        - создать список городских маршрутов на основе автобусов из городского автопарка;
//        - подсчитать общую вместимость автобусов из автопарка.

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CityBusApp {
    public static void main(String[] args) {

        List<Bus> cityBusList = new ArrayList<>();

        Bus bus = new Bus("MAN", "num1", "100", 60);
        cityBusList.add(bus);

        cityBusList.add(new Bus("Mercedes", "num1", "100", 30));
        cityBusList.add(new Bus("Scania", "num2", "10A", 40));
        cityBusList.add(new Bus("MAN", "num3", "10C", 25));
        cityBusList.add(new Bus("Mercedes", "num4", "3", 35));
        cityBusList.add(new Bus("Volvo", "num5", "100", 45));
        int size = cityBusList.size();
        System.out.println("number of buses = " + size);

        System.out.println("============= unsorted list ==========================");
        for (Bus b : cityBusList) {
            System.out.println(b);
        }

        //sorting
        cityBusList.sort(Bus::compareTo);

        System.out.println("============= sorted native list ==========================");
        for (Bus b : cityBusList) {
            System.out.println(b);

        }

        int totalCapacity = 0;
        for (Bus b : cityBusList) {
            totalCapacity +=b.getCapacity();
        }

        System.out.println("Total capacity: " + totalCapacity);

        Comparator<Bus> busModelComparator = new Comparator<Bus>() {
            @Override
            public int compare(Bus o1, Bus o2) {
                return o1.getModel().compareTo(o2.getModel());
            }
        };
        System.out.println("============= sorting by model ==========================");
        cityBusList.sort(busModelComparator);
        for (Bus b: cityBusList) {
            System.out.println(b);
        }
    }
}
