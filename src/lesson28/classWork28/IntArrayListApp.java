package lesson28.classWork28;

public class IntArrayListApp {
    public static void main(String[] args) {
        IntArrayList myArray = new IntArrayList();
        myArray.add(3);
        myArray.add(1);
        myArray.add(8);
        myArray.add(9);
        myArray.add(45);
        myArray.add(42);


//        for (int i = 0; i < myArray.getCount(); i++) {
//            System.out.println(myArray.get(i));
//        }
        System.out.println(myArray);

        int removedValue = myArray.remove(2);
        System.out.println("removedValue: " + removedValue);
        System.out.println(myArray);

        myArray.add(88);
        System.out.println(myArray);

        System.out.println("The end!");
    }
}
