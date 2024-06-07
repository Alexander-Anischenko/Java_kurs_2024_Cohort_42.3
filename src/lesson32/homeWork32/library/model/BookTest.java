package lesson32.homeWork32.library.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    Book[] books;

    @BeforeEach
    void setUp() {
        // Задаем массив книг и заполняем его значениями
        books = new Book[3];
        books[0] =new Book("TAuthor1", 1000000000000l, "RTitle1", 2003);
        books[1] =new Book("DAuthor2", 1000000000001l, "VTitle2", 1949);
        books[2] =new Book("ZAuthor3", 1000000000002l, "STitle2", 1958);
    }
    @Test
    void testBookSort() {
        System.out.println("<===Test Book sorting===>");
        //напечатать массив, отсортировать и напечатать отсортированый
        printArray(books);
        Arrays.sort(books);//производим сортировку по полю указаному в методе compareTo
        System.out.println("<==After sorting by author===>");
        printArray(books);
    }
    @Test
    void testBookComparator() {
        Comparator<Book> bookComparator = new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getAuthor().compareTo(o2.getAuthor());//сортируем по названию(по алфавиту)
            }
        };
        printArray(books);// печатаем как есть
        System.out.println("<===========================>");
        Arrays.sort(books, bookComparator);// сортируем
        printArray(books);// печатаем после сортировки
    }
    @Test
    void testComparator2() {
        Comparator<Book> bookComparator = new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getYearOfPublishing() - o2.getYearOfPublishing();
            }
        };
        printArray(books);// печатаем как есть
        System.out.println("<===========================>");
        Arrays.sort(books, bookComparator);// сортируем
        printArray(books);// печатаем после сортировки
    }
    

    public void printArray(Object[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

}