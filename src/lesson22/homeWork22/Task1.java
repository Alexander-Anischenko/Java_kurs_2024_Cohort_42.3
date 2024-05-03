package lesson22.homeWork22;
/*Дана строка "I'm proud to learn Java! Java is the most famous programming language!!!" Выполнить практикум с этой строкой:*/

public class Task1 {
    public static void main(String[] args) {

        String string = "I'm proud to learn Java! Java is the most famous programming language!!!";
        System.out.println(string);
        System.out.println("--------------------------------------------");

        // Распечатать последний символ строки.
        System.out.println("Last character of string-> " + string.charAt(string.length() -1));
        System.out.println("--------------------------------------------");

        // Найти позицию подстроки “Java” в строке.
        int ind1 =string.indexOf("Java");
        System.out.println("Position of 'Java' substring in string-> " + (ind1 + 1));
        System.out.println("--------------------------------------------");

        // Проверить, содержит ли заданная строка подстроку “Java”.
        String substring = "Java";
        System.out.println("Checked word-> " + substring);
        if (string.contains(substring)) {
            System.out.println("The string contains the word 'Java'");
        } else {
            System.out.println("The string not contains the word 'Java'");
        }
        System.out.println("--------------------------------------------");

        // Заменить все символы “o” на “a”.
        System.out.println("Replace all 'o' character with 'a' ");
        System.out.println(string.replace('o', 'a' ));
        System.out.println("--------------------------------------------");

        // Преобразуйте строку к верхнему регистру.
        System.out.println("Convert string to upper case.");
        System.out.println(string.toUpperCase());
        System.out.println("--------------------------------------------");

        // Преобразуйте строку к нижнему регистру
        System.out.println("Convert string to lower case.");
        System.out.println(string.toLowerCase());
        System.out.println("--------------------------------------------");

        //Вырезать подстроку Java c помощью метода substring().
        System.out.println("To extract a substring in Java, use the substring() method-> " + string.substring(19, 23));
        System.out.println("--------------------------------------------");

        // Проверить, заканчивается ли строка подстрокой “!!!”.
        System.out.println("Verify whether the string concludes with the substring \"!!!\".");
        String substring1 = "!!!";
        if (string.contains(substring1)) {
            System.out.println("The string contains '!!!'");
        } else {
            System.out.println("The string not contains '!!!'");
        }
        System.out.println("--------------------------------------------");

        // Проверить, начинается ли строка подстрокой “I'm proud”.
        System.out.println("Check if the string starts with the substring \"I'm proud\".");
        String substring2 = "I'm proud";
        if (string.contains(substring2)) {
            System.out.println("The string contains 'I'm proud'");
        } else {
            System.out.println("The string not contains 'I'm proud'");
        }
        System.out.println("--------------------------------------------");

    }
}
