package lesson27.classWork27;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите радиус окружности: ");
        double radius = scanner.nextDouble();
        double circeArea = Constants.PI * radius * radius;
        System.out.println("Площадь окружности: " + circeArea);

    }
}
