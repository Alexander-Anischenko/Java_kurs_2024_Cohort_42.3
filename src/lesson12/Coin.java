package lesson12;
/*Подбросьте монетку 100 раз. Сколько раз выпала решка? Сколько орел?
Сравните итоговые вероятности выпадения орла и решки.
 */

public class Coin {
    public static void main(String[] args) {

        int[] coin = new int[100];
        int a = 0;
        int b = 1;

        // fill array
        ArraysMetods.fillArray(coin, a, b);
        ArraysMetods.printArray(coin);

        int avers = 0;
        int reverse = 0;
        for (int i = 0; i < coin.length; i++) {
            if (coin[i] == 0) {
                avers++;
            }else {
                reverse++;
            }
        }

        System.out.println("Avers = " + avers + " possibility: " + (double) avers / coin.length);
        System.out.println("Reverse = " + reverse +" possibility: " + (double) reverse / coin.length);
    }
}
