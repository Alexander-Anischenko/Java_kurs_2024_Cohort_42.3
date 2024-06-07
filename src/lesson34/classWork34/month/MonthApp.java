package lesson34.classWork34.month;

public class MonthApp {
    public static void main(String[] args) {
        Month month = Month.JUN;
        System.out.println(month);
        Month newMonth = month.plusMonth(2);
        System.out.println(newMonth);
        newMonth = month.plusMonth(24);
        System.out.println(newMonth);
    }
}
