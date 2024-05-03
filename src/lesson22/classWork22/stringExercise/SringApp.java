package lesson22.classWork22.stringExercise;

import java.util.Arrays;

public class SringApp {
    public static void main(String[] args) {

        String str = "Hello world";
        System.out.println(str);
        System.out.println("--------------------------------------------");

        String str1 = "Hallo";
        char[] str2 = {32, 'w', 'o', 'r', 'l', 'd'}; // Array of char, 32 - ASCII-code of space(пробел)
        String str3 = new String(str2);
        System.out.println(str1 + str3);
        System.out.println("--------------------------------------------");
        String str4 = str1 + str3;
        System.out.println(str4);
        System.out.println("--------------------------------------------");
        str = str1.concat(str3); //Обьединение
        System.out.println(str);
        System.out.println("--------------------------------------------");

        // length
        int l = str.length();
        System.out.println("Length of sting: " + l);
        System.out.println("--------------------------------------------");

        // .charAt
        char c = str.charAt(str.length() - 1); // last simbol
        System.out.println("Last simbol: " + c);
        System.out.println("--------------------------------------------");

        // print every letter of string
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
        System.out.println("--------------------------------------------");

        String w1 = "World";
        String w2 = "world";
        boolean check= w1.equals(w2);// expect false
        System.out.println(check);
        check = w1.equalsIgnoreCase(w2); // expect true
        System.out.println(check);
        System.out.println("--------------------------------------------");

        // toLowerCase, toUpperCase
        String lowerCase = str.toLowerCase();
        System.out.println(lowerCase); //hallo world

        String upperCase = str.toUpperCase();
        System.out.println(upperCase); // HALLO WORLD
        System.out.println("--------------------------------------------");

        // index
        int index = str.indexOf('l');
        System.out.println(index); // 2
        index = str.lastIndexOf('l');
        System.out.println(index); // 9
        index = str.indexOf("world"); // С какого индекса начинается слово
        System.out.println(index); // 6
        System.out.println("--------------------------------------------");
        index = str.indexOf('l',4);
        System.out.println(index);
        System.out.println("--------------------------------------------");

        //substring
        System.out.println(str.substring(5));
        System.out.println(str.substring(2, 7)); // from to
        System.out.println("--------------------------------------------");

        //replace
        System.out.println(str.replace('o', 'a'));
        System.out.println(str);
        System.out.println(str.replace("o", "o-o-o"));
        System.out.println("--------------------------------------------");

        //trim- убираем пробелы
        String string = "      Bill Smith    ";
        System.out.println(string.trim());
        System.out.println("--------------------------------------------");

        //numbers of words, or letters
        String string1 = "One two three, fore five six seven";
        String[] words = string1.split(" ");
        System.out.println("Number of words =" + words.length);
        // print with for loop
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }

        //print with Arrais.toStrimg
        System.out.println(Arrays.toString(words));
        System.out.println("--------------------------------------------");

        String[] letters = string1.split("");
        System.out.println(letters.length);
        System.out.println(Arrays.toString(letters));

    }
}
