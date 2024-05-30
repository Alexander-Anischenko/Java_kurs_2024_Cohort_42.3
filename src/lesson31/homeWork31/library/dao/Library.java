package lesson31.homeWork31.library.dao;

import lesson31.homeWork31.library.model.Book;

public interface Library {

    // Abstract methods
    boolean createBook(Book book);
    Book findBook(long isbn);
    Book removeBook(long isbn);
    void printBooks();
    int getSize();
}
