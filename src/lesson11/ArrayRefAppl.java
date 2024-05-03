package lesson11;
/*Возведите число в квадрат с помощью метода, получающего число в качестве аргумента.
Возведите элемент массива в квадрат с помощью метода, получающего массив в качестве аргумента.
Сравните первоначальные значения и полученные результаты.*/

public class ArrayRefAppl {
    public static void main(String[] args) {
        int x = 10;
        System.out.println("x before x^2 = " + x);

        pow2var(x);
        System.out.println("x after metod pow2Var " + x);
        //work with array
        int[] arr = {1, 10, 3};
        System.out.println("array[1] befor^2 " + arr[1]);
        pow2Arr(arr);//call method arr - as argument
        System.out.println("arr[1] after method p[ow2Arr(int[] arr " + arr[1]);
        System.out.println(arr);
    }// end of main

    private static void pow2Arr(int[] arr) {
        arr[1] = arr[1] * arr[1] ;
        System.out.println("array[1] in^2 " + arr[1]);
    }

    public static void pow2var(int x) {
        x = x * x;
        System.out.println("x^2 = " + x);
    }

}//end of class
