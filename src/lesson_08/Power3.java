package lesson_08;

public class Power3 {
    public static void main(String[] args) {

        int count = 1; //parameter
        int res = 1;

        while (count <= 10) { // conditions
            res = res * 3;
            System.out.println(res + " * 3 in power " + count);
            count++; //increment parameter
        }
    }
}
