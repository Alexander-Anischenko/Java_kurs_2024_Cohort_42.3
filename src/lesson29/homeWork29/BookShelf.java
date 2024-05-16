package lesson29.homeWork29;

import java.util.ArrayList;
import java.util.List;

public class BookShelf {
    private List<Book> books = new ArrayList<>();

    static class Book {
        String title;
        String author;
        int year;

        Book(String title, String author, int year) {
            this.title = title;
            this.author = author;
            this.year = year;
        }

        @Override
        public String toString() {
            return title + " by " + author + ", " + year;
        }
    }

    void addBook(String title, String author, int year) {
        this.books.add(new Book(title, author, year));
    }

    void removeBook(int index) {
        this.books.remove(index);
    }

    class Iterator {
        private int cursor = 0;

        public Book nextBook() {
            // дописать
            // надо взять книжку с полки по индексу
            Book book = books.get(cursor);
            // перемещаем руку библиотекаря на следующую книгу
            cursor++;
            // проверяем не вышла ли рука библиотекаря за пределы полки
            if (cursor >= books.size()) {
                cursor =0;
            }

            return book;
        }

        @Override
        public String toString() {
            return "Iterator{" +
                    "cursor=" + cursor +
                    '}';
        }
    }

    // добавить метод toString

    @Override
    public String toString() {
        return "BookShelf{" +
                "books=" + books +
                '}';
    }
}


class Main2 {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf();
        bookShelf.addBook("Война и мир", "Лев Толстой", 1873);
        bookShelf.addBook("Игрок", "Фёдор Достоевский", 1866);
        bookShelf.addBook("Как закалялась сталь", "Николай Островский", 1934);
        bookShelf.addBook("Аристономия", "Борис Акунин", 2012);

        System.out.println(bookShelf);
        System.out.println("<========================================>");

        // Создать объект внутреннего класса Iterator и вызвать на нем несколько раз метод nextBook
        BookShelf.Iterator iterator = bookShelf.new Iterator();
        System.out.println(iterator.nextBook());
        System.out.println(iterator.nextBook());
        System.out.println(iterator.nextBook());
        System.out.println(iterator.nextBook());

    }
}
