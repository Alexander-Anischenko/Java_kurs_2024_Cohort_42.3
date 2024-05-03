package lesson15.homeWork15.book;
/*Создать класс BookAppl в пакете ait.book с методом main.
В методе main создать несколько экземпляров Book и вывести для каждого из них результат работы метода display.*/

import lesson15.homeWork15.book.model.Book;

public class BookApp {
    public static void main(String[] args) {

        Book book1 = new Book(1234567891, "Love and flame", "Ashley Stone", 2022);
        Book book2 = new Book(1234567892, "The catacombs of Jakarta", 1999);
        Book book3 = new Book(1234567893, "1,000 years ahead", "Bur Kilychev", 1978);

        book1.displayBook();
        book2.displayBook();
        book3.displayBook();
    }
}
