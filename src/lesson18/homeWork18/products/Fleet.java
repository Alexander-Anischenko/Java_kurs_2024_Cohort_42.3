package lesson18.homeWork18.products;

/*В автопарке 5 транспортных средств, каждое имеет свою длину и ширину.
Рассчитайте необходимую площадь под стоянку автопарка.*/

import lesson18.homeWork18.products.model.Vehicle;

public class Fleet {
    public static void main(String[] args) {
        Vehicle[] vehicle = new Vehicle[5];
        vehicle[0] = new Vehicle(4.5, 1.9);
        vehicle[1] = new Vehicle(3.9, 1.8);
        vehicle[2] = new Vehicle(4.7, 1.95);
        vehicle[3] = new Vehicle(4.25, 1.85);
        vehicle[4] = new Vehicle(6.24, 2.4);

        for (int i = 0; i < vehicle.length; i++) {
            System.out.println(vehicle[i].toString());
        }
        System.out.println();

        double area = calculateRequiredAreaForParking(vehicle);
        System.out.println("Required area for fleet parking: " + area);

    }

    private static double calculateRequiredAreaForParking(Vehicle[] vehicle) {
        double a = 0;
        double l = 0;
        double w = 0;
        double count = 0;
        for (int i = 0; i < vehicle.length; i++) {
            l += vehicle[i].getLengthOfVehicle();
            w += vehicle[i].getWidthOfVehicle();
            count++;
        }
        return a =(((l * w) / count) * 1.5); // Added an area for the gap between vehicles
    }
}
