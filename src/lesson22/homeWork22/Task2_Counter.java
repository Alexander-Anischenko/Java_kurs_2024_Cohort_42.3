package lesson22.homeWork22;

import java.util.Scanner;

public class Task2_Counter {

    // Напишите программу, которая запрашивает строку от пользователя и затем:
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type text: ");
        String str = scanner.nextLine();
        System.out.println("You entered-> " + str);

        // сообщает сколько слов в строке
        int wordCount = str.trim().isEmpty() ? 0 : str.trim().split("\\s+").length;
        System.out.println("Number of words-> " + wordCount);

        // сообщает сколько букв (символов) в строке
        String letterCount = str.replaceAll("[^A-Za-z]", "");
        System.out.println("Number of letters-> " + letterCount.length());

        // печатает строку задом наперед, начиная с последнего слова.
        String[] words = str.split("\\s+");
        String reversed = "";
        for (int i = words.length - 1; i >= 0; i--) {
            reversed += words[i];
            if (i > 0) {
                reversed+=" ";
            }
        }
        System.out.println("String backwards, starting from the last word-> " + reversed);
    }
}
