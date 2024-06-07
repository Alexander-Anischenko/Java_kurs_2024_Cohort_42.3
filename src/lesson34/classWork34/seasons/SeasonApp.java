package lesson34.classWork34.seasons;

public class SeasonApp {
    public static void main(String[] args) {
        // Опробовать на нем методы:
        // .values()
        // .toString
        // .ordinal()
        // .valueOf()
        Season[] seasons = Season.values(); //Fill array

        for (int i = 0; i < seasons.length; i++) {
            System.out.println(seasons[i].getNumber() + "." + seasons[i].getName());
        }
        System.out.println("<======================================>");
        
        //foreach
        for (Season s : seasons) {
            System.out.println(s.getNumber() + "." + s.getName());
        }
        System.out.println("<==================toString()====================>");
        String str = Season.AUTUMN.toString();
        System.out.println(str);

        System.out.println("<====================ordinal()==================>");
        int n = Season.AUTUMN.ordinal();
        System.out.println(n);

        System.out.println("<====================valueOf()==================>");
        Season s = Season.valueOf("AUTUMN");
        System.out.println(s);
    }
}
