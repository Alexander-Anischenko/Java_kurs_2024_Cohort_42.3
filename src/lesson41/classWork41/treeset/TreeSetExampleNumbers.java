package lesson41.classWork41.treeset;

import java.util.TreeSet;

public class TreeSetExampleNumbers {
    public static void main(String[] args) {

        //Загрузить в трисет 10 случайных чисел и понять:
        //Это сет?
        // имеется ли порядок в этом множестве

        TreeSet<Integer> numbersTreeSet = new TreeSet<>();
        //add elements
        numbersTreeSet.add(8);
        numbersTreeSet.add(-7);
        numbersTreeSet.add(15);
        numbersTreeSet.add(41);
        numbersTreeSet.add(65);
        numbersTreeSet.add(245);
        numbersTreeSet.add(69);
        numbersTreeSet.add(987);
        numbersTreeSet.add(-7);
        numbersTreeSet.add(245);

        //elements of TreeSet
        System.out.println(numbersTreeSet);
        numbersTreeSet.remove(245);
        System.out.println(numbersTreeSet);
        System.out.println("=====================================");
        System.out.println(numbersTreeSet.contains(15));

        System.out.println(numbersTreeSet.first());
        System.out.println("=====================================");
        System.out.println(numbersTreeSet.last());
        System.out.println("=====================================");
        System.out.println(numbersTreeSet.floor(50));
        System.out.println("=====================================");
        System.out.println(numbersTreeSet.ceiling(50));
        //TODO - try other methods

    }
}
