package lesson27.classWork27.final_example;

public class Main4 {
    public static void main(String[] args) {
        // так делать не надо Final обычно не изменяются
        final double[] values ={3.14};
        // нельзя переопределить переменную values
        values[0] = 2; //меняем данные в уже существующем масиве, но не переопределяем переменную
        System.out.println("Площадь с окружности с радиусом 2: " + values[0] * 4);
    }
}
