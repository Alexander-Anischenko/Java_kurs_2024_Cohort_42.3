package lesson32.homeWork32.library.dao;

import lesson32.homeWork32.library.model.Book;

public interface Library {

    // Abstract methods
    boolean createBook(Book book);
    Book findBook(long isbn);
    Book findAuthor(String author);
    Book removeBook(long isbn);
    void printBooks();
    int getSize();
}
