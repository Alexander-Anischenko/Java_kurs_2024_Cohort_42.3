package lesson47.classWork47.library.test;

import lesson47.classWork47.library.dao.Library;
import lesson47.classWork47.library.dao.LibraryImpl;
import lesson47.classWork47.library.model.Author;
import lesson47.classWork47.library.model.Book;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class LibraryImplTest {

    Library library;
    Author author1, author2, author3;
    Set<Book>  b;

    @BeforeEach
    void setUp() {
        library = new LibraryImpl();
        author1 = new Author("John", "Doe", LocalDate.of(1980, 1, 1), "USA", 4.5);
        author2 = new Author("Jane", "Smith", LocalDate.of(1975, 5, 15), "UK", 4.7);
        author3 = new Author("Bob", "Dilan", LocalDate.of(1985, 7, 21), "Canada", 4.3);

        b.add(new Book(" 978-0-7432-7356-5", "Book 1", author1, 2020, true));
        b.add(new Book("978-1-56619-909-4", "Book 2", author2, 2001, false));
        b.add(new Book("978-0-395-19395-8", "Book 3", author1, 2015, true));
        b.add(new Book("13: 978-0-14-017739-8", "Book 4", author3, 2018, false));

        for (Book book : b) {
            library.addBook(book);
        }
    }

    @Test
    void addBook() {
        Book newBook = new Book("978-3-16-148410-0", "New Book", author1, 2022, false);
        assertTrue(library.addBook(newBook));
        assertFalse(library.addBook(newBook)); // Проверяем, что дубликаты не добавляются

    }

    @Test
    void findBookByAuthor() {
        Book foundBook = library.findBookByAuthor(author1);
        assertNotNull(foundBook);
        assertEquals(author1, foundBook.getAuthor());
    }

    @Test
    void findBookByIsbn() {
        Book foundBook = library.findBookByIsbn("978-0-7432-7356-5");
        assertNotNull(foundBook);
        assertEquals("Book 1", foundBook.getTitle());

    }

    @Test
    void rentBook() {
        assertTrue(library.rentBook("978-1-56619-909-4")); // Книга должна быть доступна для аренды
        assertFalse(library.rentBook("978-1-56619-909-4")); // Книга уже взята

    }


    @Test
    void getBackBook() {
        library.rentBook("978-1-56619-909-4");
        assertTrue(library.getBackBook("978-1-56619-909-4")); // Книга должна быть возвращена
        assertFalse(library.getBackBook("978-1-56619-909-4")); // Книга уже возвращена
    }

    @Test
    void quantity() {
        assertEquals(4, library.quantity());
    }
}