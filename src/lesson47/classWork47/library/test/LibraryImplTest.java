package lesson47.classWork47.library.test;

import lesson47.classWork47.library.dao.Library;
import lesson47.classWork47.library.dao.LibraryImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LibraryImplTest {

    Library library;

    @BeforeEach
    void setUp() {
        library = new LibraryImpl();
    }

    @Test
    void addBook() {
    }

    @Test
    void findBookByAuthor() {
    }

    @Test
    void findBookByIsbn() {
    }

    @Test
    void rentBook() {
    }

    @Test
    void getBackBook() {
    }

    @Test
    void quantity() {
    }
}