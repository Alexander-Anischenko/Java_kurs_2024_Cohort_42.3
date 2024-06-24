package lesson39.classWork39.homeWork39.latinCharacters;
// Fill a structure of type ArrayList with Latin characters from A to Z.

import java.util.ArrayList;
import java.util.List;

public class AToZ_ArrayList {
    public static void main(String[] args) {

        //create array list
        List<Character> alphabetList = new ArrayList<Character>();

        // using While loop
        System.out.println("<============= alphabet list with While loop =================>");
        char ch = 'A';
        while (ch <= 'Z') {
            alphabetList.add(ch);
            ch++;
        }
        alphabetList.forEach(a -> System.out.print(a + ", "));

        List<Character> alphabetList1= new ArrayList<Character>();
        // using For loop
        System.out.println();
        System.out.println("<============= alphabet list with For loop =================>");
        for (char a = 'A'; a <= 'Z'; a++) {
            alphabetList1.add(a);
        }
        for (Character c : alphabetList1) {
            System.out.print(c + ", ");
        }
    }
}
