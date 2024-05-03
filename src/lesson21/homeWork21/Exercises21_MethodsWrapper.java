package lesson21.homeWork21;

public class Exercises21_MethodsWrapper {
    public static void main(String[] args) {

        Integer integer1 = Integer.valueOf("6");
        Integer integer2 = Integer.valueOf(6);

        System.out.println(integer1);
        System.out.println(integer2);

        Long long1 = Long.valueOf("45"); // Обьект
        long long2 = Long.parseLong("67"); // Значение

        System.out.println("long1 = " + long1);
        System.out.println("long2 = " + long2);

        Double double1 = Double.valueOf("4.6");
        System.out.println(double1);

        String string1 = Double.toString(3.14);
        System.out.println(string1);

        String string2 = Long.toString(254, 16); // string2 = "fe"
        System.out.println(string2);

        String string4 = Integer.toHexString(254);
        System.out.println("254 в 16-ой системе = " + string4);

        String string
                = Long.toOctalString(254);
        System.out.println("254 в  8-ой системе = " + string);

        String string3 = Long.toBinaryString(254);
        System.out.println("254 в  2-ой системе = " + string3);
    }
}
