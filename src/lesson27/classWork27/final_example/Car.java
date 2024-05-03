package lesson27.classWork27.final_example;

public class Car {
    public String vendor;
    public int builtYear;

    @Override
    public String toString() {
        return "Car{" +
                "builtYear=" + builtYear +
                ", vendor='" + vendor + '\'' +
                '}';
    }

    public Car(int builtYear, String vendor) {
        this.builtYear = builtYear;
        this.vendor = vendor;

    }
}
