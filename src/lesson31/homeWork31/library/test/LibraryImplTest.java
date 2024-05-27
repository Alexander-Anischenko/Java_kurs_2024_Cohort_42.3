package lesson31.homeWork31.library.test;

import lesson31.homeWork31.library.dao.Library;
import lesson31.homeWork31.library.dao.LibraryImpl;
import lesson31.homeWork31.library.model.Book;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibraryImplTest {
    Library library;
    Book[] b;

    @BeforeEach
    void setUp() {
        library = new LibraryImpl(4);
        b = new Book[3];
        b[0] =new Book("Author1", 1000000000000l, "Title1", 2001);
        b[1] =new Book("Author2", 1000000000001l, "Title2", 2002);
        b[2] =new Book("Author3", 1000000000002l, "Title2", 2003);

        // необходимо добавить злементы массива в объект company
        for (int i = 0; i < b.length; i++) {
            library.createBook(b[i]);
        }
    }

    @Test
    void createBook() {
        //нельзя добавить null
        assertFalse(library.createBook(null));
        //нельзя добавить второй раз уже имеющеюся книгу
        assertFalse(library.createBook(b[1]));
        // добавляем книгу
        Book book = new Book("Author4", 1000000000003l, "Title3", 2004);
        assertTrue(library.createBook(book));
        //проверяем кол-во после добавления
        assertEquals(4,library.getSize());
        // нельзя превысить capacity
        Book book1 = new Book("Author5", 1000000000004l, "Title4", 2005);
        assertFalse(library.createBook(book1));
        library.printBooks();
    }

    @Test
    void findBook() {
    }

    @Test
    void removeBook() {
    }

    @Test
    void printBooks() {
    }

    @Test
    void getSize() {
    }
}