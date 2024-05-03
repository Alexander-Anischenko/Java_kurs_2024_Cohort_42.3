package lesson_08;

public class Apples {
    public static void main(String[] args) {

        int apples = 30;
        int counter = 0;  // Колтчество попыток
        int applesInBasket = apples;
        System.out.println("There are 30 apples in basket.");

        while (applesInBasket >0) {
            // cycle body
            System.out.println("Take one apple from basket. ");
            applesInBasket = applesInBasket - 1;
            System.out.println("We have appels " + applesInBasket + "now.");
            counter++;
        }
        System.out.println("The yob is done. Total apples " + counter + "added in pie.");
    }
}
