package lesson_08;

import java.util.Scanner;

public class DigitsInNumber {

    public static void main(String[] args) {

        //Алгоритм:
        // числа записываются в 10-чной системе счисления, каждый знак отвечает за казряд числа
        // будем на каждом шагу делить числа с остатком.


        //Взаимодействие с пользователем:
        //Запросить число
        //Напечатать число равное количеству цифр

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input integer and positive number: ");
        long num = scanner.nextLong();
        int count = 0;

        while (num > 0) {
            num = num / 10; // Деление дает количество цифр
            count++; //Увеличиваем счетчик
        }
        System.out.println("Number of digits are: " + count);
    }
}
