package lesson47.classWork47.library.dao;

import lesson47.classWork47.library.model.Author;
import lesson47.classWork47.library.model.Book;

public interface Library {

    boolean addBook(Book book);
    Book findBookByAuthor(Author author);
    Book findBookByIsbn(String isbn);
    boolean rentBook(String isbn);
    boolean getBackBook(String isbn);
    // save
    // load
    int quantity();

}
