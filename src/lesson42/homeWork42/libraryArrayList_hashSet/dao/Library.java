package lesson42.homeWork42.libraryArrayList_hashSet.dao;

import lesson42.homeWork42.libraryArrayList_hashSet.model.Book;

public interface Library {

    // Abstract methods
    boolean createBook(Book book);
    Book findBook(long isbn);
    Book findAuthor(String author);
    Book removeBook(long isbn);
    void printBooks();
    int getSize();
}
