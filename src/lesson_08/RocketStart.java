package lesson_08;

public class RocketStart {
    public static void main(String[] args) {
        int countDown = 10;
        System.out.println("There are : " + countDown + "to start.");

        while (countDown > 0) {
            countDown--;
            System.out.println("There are : " + countDown + "to start.");
        }
        System.out.println("Поехали!...");
    }
}
