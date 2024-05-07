package lesson28.classWork28;

public class ArrayExample2 {
    public static void main(String[] args) {
        int[] myArray = new int[4];
        myArray[0] = 3;
        myArray[1] = 4;
        myArray[2] = 1;
        myArray[3] = 9;

        int[] myArray2 = new int[8];
        for (int i = 0; i < myArray.length; i++) {
            myArray2[i] = myArray[i];
        }
        myArray = myArray2;
        myArray[4]= 11;
        for (int i : myArray) {
            System.out.println(i);
        }
    }
}
