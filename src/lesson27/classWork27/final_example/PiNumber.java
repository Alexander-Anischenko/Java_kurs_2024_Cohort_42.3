package lesson27.classWork27.final_example;

public class PiNumber {
    public static void main(String[] args) {
        //при попытке переопределения будет ошибка
        final double PI = 3.14;
        System.out.println("Площадь окружности с радиуом 2: " + PI * 4);
    }

}
