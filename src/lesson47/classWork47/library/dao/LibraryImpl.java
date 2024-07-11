package lesson47.classWork47.library.dao;

import lesson47.classWork47.library.model.Author;
import lesson47.classWork47.library.model.Book;

import java.util.HashSet;
import java.util.Set;

public class LibraryImpl implements Library {

    Set<Book> books = new HashSet<>();

    @Override
    public boolean addBook(Book book) {

        return false;
    }

    @Override
    public Book findBookByAuthor(Author author) {
        return null;
    }

    @Override
    public Book findBookByIsbn(String isbn) {
        return null;
    }

    @Override
    public boolean rentBook(String isbn) {
        return false;
    }

    @Override
    public boolean getBackBook(String isbn) {
        return false;
    }

    @Override
    public int quantity() {
        return books.size();
    }
}
