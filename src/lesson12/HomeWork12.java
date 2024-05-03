package lesson12;
/*Задача 4. (*) Вводится шестизначное число (номер автобусного билета).
Определите, является ли этот билет "счастливым" (сумма первых трех цифр равна сумме трех последних цифр).
*/

import java.util.Scanner;

public class HomeWork12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите шестизначное число: ");
        int tiketNumber = scanner.nextInt();
        if (!(tiketNumber >= 100000 && tiketNumber <=999999)) {
            System.out.println("Значение некорректно");
            return;
        }
        //сумма млачших трех разрядов
        int sum1 = 0;
        //сумма старших трех разрядов
        int sum2 = 0;

        //делитель
        int divider = 1;
        while (divider <=100000) {
            int digit = tiketNumber / divider % 10;
            sum1 = sum1 + digit;
            divider = divider * 10;
        }

        while (divider <=100000) {
            int digit = tiketNumber / divider % 10;
            sum2 = sum2 + digit;
            divider = divider * 10;
        }

//        System.out.println("sum1 = " + sum1);
//        System.out.println("sum2 = " + sum2);

        if (sum1 == sum2) {
            System.out.println("У вас счачтливый билет!");
        } else {
            System.out.println("Повезет в любвию");
        }
    }
}
