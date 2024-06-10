package lesson35.homeWork35.book;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class BookTest {
    Book[] books;

    @BeforeEach
    void setUp() {
        books = new Book[6];
        books[0] = new Book("1984", "George Orwell", 1949, 9780451524935L);
        books[1] = new Book("To Kill a Mockingbird", "Harper Lee", 1960, 9780060935467L);
        books[2] = new Book("Brave New World", "Aldous Huxley", 1932, 9780060850524L);
        books[3] = new Book("Animal Farm", "George Orwell", 1945, 9780451526342L);
        books[4] = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925, 9780743273565L);
        books[5] = new Book("Fahrenheit 451", "Ray Bradbury", 1953, 9781451673319L);
    }

    private void printArray(Object[] arr, String reportTitle) {
        System.out.println("<=======" + reportTitle + "========>");
        for (Object o : arr) {
            System.out.println(o);
        }
    }

    @Test
    void testArray() {
        printArray(books, "list of books");
    }

    @Test
    void nativeSorting() {
        printArray(books, "list of books as is");
        Arrays.sort(books);
        printArray(books, "list of books sorted by author");
    }
}