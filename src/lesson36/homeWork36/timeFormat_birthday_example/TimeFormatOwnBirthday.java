package lesson36.homeWork36.timeFormat_birthday_example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class TimeFormatOwnBirthday {
    public static void main(String[] args) {
        LocalDate ownBirthday = LocalDate.of(1979, 7, 27);
        System.out.println(ownBirthday);
        System.out.println("<=====================================>");

        DateTimeFormatter dtf = DateTimeFormatter.ISO_DATE;
        System.out.println(ownBirthday.format(dtf));
        System.out.println("<=====================================>");

        dtf = DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.GERMANY);
        System.out.println(ownBirthday.format(dtf));
        System.out.println("<=====================================>");
        dtf = DateTimeFormatter.ofPattern("E, dd MMMM yyyy");
        System.out.println(ownBirthday.format(dtf));


        // parsing date from string
        System.out.println("<==================parsing date from string===================>");
        String str = "27 07 1979"; //просто строка
        System.out.println("This is a string => " + str);
        LocalDate date = dateParse2(str); //извлекаем из строки дату(МАГИЯ!!!)
        System.out.println("This is a date => " + date + " " + date.getDayOfWeek());

        // пример из https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/format/DateTimeFormatter.html
        LocalDate dat = LocalDate.now();
        System.out.println(dat);// нынешняя дата
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("E, MMM dd yyyy");// формат можно менять
        String text = dat.format(formatter);
        System.out.println(text);// перевод даты в строку
        LocalDate parsedDate = LocalDate.parse(text, formatter);
        System.out.println(parsedDate);// и обратно по формату
    }
    // извлекает из строки дату по разным вариантам написания(так работает магия)
    private static LocalDate dateParse2(String string) {
        // варианрты написания можно расширить
        DateTimeFormatter dtf  = DateTimeFormatter.ofPattern("[dd MM yyyy][yyyy-MM-dd][dd/MM/yyyy][dd.MM.yyyy][dd-MM-yyy]");
        return LocalDate.parse(string, dtf);
    }




}
