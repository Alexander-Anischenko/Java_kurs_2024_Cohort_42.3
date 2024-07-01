package lesson42.homeWork42.libraryArrayList_hashSet.test;

import lesson42.homeWork42.libraryArrayList_hashSet.dao.Library;
import lesson42.homeWork42.libraryArrayList_hashSet.dao.LibraryArrayListImpl;
import lesson42.homeWork42.libraryArrayList_hashSet.dao.LibraryHashSetImpl;
import lesson42.homeWork42.libraryArrayList_hashSet.dao.LibraryImpl;
import lesson42.homeWork42.libraryArrayList_hashSet.model.Book;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibraryImplTest {
    Library library;
    Book[] b;


    @BeforeEach
    void setUp() {
        //library = new LibraryImpl(4);
        //library = new LibraryArrayListImpl(4);
        library = new LibraryHashSetImpl(4);
        b = new Book[3];
        b[0] =new Book("QAuthor1", 1000000000000l, "Title1", 2001);
        b[1] =new Book("SAuthor2", 1000000000001l, "Title2", 2002);
        b[2] =new Book("DAuthor3", 1000000000002l, "Title2", 2003);

        // необходимо добавить злементы массива в объект library
        for (Book book : b) {
            library.createBook(book);
        }
//        for (int i = 0; i < b.length; i++) {
//            library.createBook(b[i]);
//        }
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
        // find book with isbn 1000000000001l
        assertEquals(b[1], library.findBook(1000000000001l));
        // bind book with isbn 1000000000005l
        assertNull(library.findBook(1000000000005l));
    }

    @Test
    void removeBook() {
        assertEquals(b[1], library.removeBook(1000000000001l));
        assertEquals(2, library.getSize());
    }

    @Test
    void printBooks() {
        library.printBooks();
    }

    @Test
    void getSize() {
        assertEquals(3, library.getSize());
    }

    @Test
    void findAuthor() {
        assertEquals(b[2], library.findAuthor("DAuthor3"));
        assertNull(library.findAuthor("jgjg"));
    }
}