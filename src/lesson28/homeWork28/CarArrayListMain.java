package lesson28.homeWork28;

public class CarArrayListMain {
    public static void main(String[] args) {
        CarArrayList list = new CarArrayList();

        Car car1 = new Car("Tesla", 2020);
        Car car2 = new Car("Toyota", 2021);
        Car car3 = new Car("Opel", 2022);
        Car car4 = new Car("BMW", 2023);

        list.add(car1);
        list.add(car2);
        list.add(car3);
        list.add(car4);
        System.out.println(list);
        System.out.println("=====================================");

        System.out.println("Removing car" + list.remove(1));
        System.out.println(list);
        System.out.println("=====================================");

        System.out.println("Index 0: " + list.get(0));


    }
}
