package lesson41.classWork41.treeset;

import java.util.TreeSet;

public class TreeSetExampleString {
    public static void main(String[] args) {

        // create TreeSet
        TreeSet<String> rivers = new TreeSet<String>();
        rivers.add("Volga");
        rivers.add("Rhein");
        rivers.add("Weser");
        rivers.add("Kama");
        rivers.add("Ural");
        rivers.add("Oker");
        rivers.add("Lech");
        rivers.add("Weser");
        rivers.add("Kama");
        rivers.add("Ural");
        rivers.add("Oker");
        rivers.add("Lech");

        //print elements
        System.out.println(rivers);

        System.out.println(rivers.first());
        System.out.println("=====================================");
        System.out.println(rivers.last());
        System.out.println("=====================================");
        System.out.println(rivers.ceiling("M"));
        System.out.println("=====================================");
        System.out.println(rivers.floor("M"));
        System.out.println("=====================================");
        System.out.println(rivers.contains("Don"));



    }
}
