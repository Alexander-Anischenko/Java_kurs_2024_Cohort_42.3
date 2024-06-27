package lesson41.classWork41.treeset;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetExampleCar {
    public static void main(String[] args) {

        Comparator<Car> carComparatorByAge = new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.getAge() - o2.getAge();
            }
        };
        Comparator<Car> carComparatorByMiles = new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.getMiles() - o2.getMiles();
            }
        };

        // Create treeSet
        TreeSet<Car> carTreeSet = new TreeSet<>(carComparatorByAge);

        Car[] cars = new Car[5];
        cars[0] = new Car("N400", "Model1", 5, 2.0, 15000);
        cars[1] = new Car("N300", "Model2", 3, 2.5, 25000);
        cars[2] = new Car("N200", "Model1", 2, 3.0, 50000);
        cars[3] = new Car("N100", "Model3", 7, 1.4, 10000);
        cars[4] = new Car("N100", "Model1", 5, 2.0, 15000); // dublicat

        for (Car car : cars) {
            carTreeSet.add(car);
        }
//        for (int i = 0; i < cars.length; i++) {
//            carTreeSet.add(cars[i]);
//        }

        // create another treeSet
        TreeSet<Car> carTreeSet1= new TreeSet<>(carComparatorByMiles);
        for (Car c: cars) {
            carTreeSet1.add(c);
        }
        //print
        System.out.println(carTreeSet);
        System.out.println("=====================================");
        System.out.println(carTreeSet1);
    }
}
