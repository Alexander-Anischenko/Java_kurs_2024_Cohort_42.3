package lesson20.homeWork20;

public class Exercises20 {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= 10; j++) {

                System.out.println(i + " * " + j + " = " + (i * j));

            }

            System.out.println(); // Добавляем пустую строку для разделения строк таблицы

        }

        System.out.println("Таблица квадратов чисел от 1 до 100:");
        for (int i = 1; i <= 10; i++) { // Внешний цикл для строк
            for (int j = 1; j <= 10; j++) { // Внутренний цикл для столбцов
                int number = (i - 1) * 10 + j; // Вычисляем число для текущей позиции
                System.out.print(number * number + "\t"); // Выводим квадрат числа с табуляцией
            }
            System.out.println(); // Переходим на новую строку после каждой строки из 10 чисел
        }

        char white = '◻'; // символ
        char black = '◼'; // символ
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(white + " ");
                } else {
                    System.out.print(black + " ");
                }
            }
            System.out.println();
        }
    }
}
