package lesson16.homeWork16.task2;

/* В классе BookAppl в методе main создайте несколько словарей и выведите информацию о них в консоль.*/

public class BookApp {
    public static void main(String[] args) {

        Book[] book = new Book[3];
        book[0] = new Dictionary("5000 word Russian-German dictionary", "Savitskaya L.I.", 1999, 1234567891, "Russian", "German", 5000);
        book[1] = new Dictionary("10000 word German-russian dictionary", "Fischer M.", 2000, 1234567892, "German", "Russian", 10000);
        book[2] = new Dictionary("Large Russian-English dictionary for 50000 words", "Kasparjan E.A.", 1987, 1234567893, "Russian", "English", 50000);

        book[0].displayBook();
        System.out.println();
        book[1].displayBook();
        System.out.println();
        book[2].displayBook();
    }

}
