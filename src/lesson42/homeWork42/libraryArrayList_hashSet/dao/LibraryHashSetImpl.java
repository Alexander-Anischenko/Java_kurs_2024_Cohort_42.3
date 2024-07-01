package lesson42.homeWork42.libraryArrayList_hashSet.dao;

import lesson42.homeWork42.libraryArrayList_hashSet.model.Book;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LibraryHashSetImpl implements Library {

    private Set<Book> books;
    private int capacity;

    public LibraryHashSetImpl(int capacity) {
        this.books = new HashSet<>();
        // не нужно поле size, протму-что ArrayList сам меняет размер по необходимости
        this.capacity = capacity;
    }


    // O(1)
    @Override
    public boolean createBook(Book book) {
        if (book == null || books.size() == capacity) {
            return false;
        }
        if (books.add(book)) {
            return true;
        }
        return false;
    }

    //o(1)
    @Override
    public Book findBook(long isbn) {
        for (Book book : books) {
            if (book.getIsbn() == isbn) {
                return book;
            }
        }
//        for (int i = 0; i < size; i++) {
//            if (books[i].getIsbn() == isbn) {
//                return books[i];
//            }
//        }
        return null;
    }

    //o(1)
    @Override
    public Book findAuthor(String author) {
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                return book;
            }
        }
//        for (int i = 0; i < size; i++) {
//            if (books[i].getAuthor() == author) {
//                return books[i];
//            }
//        }
        return null;
    }

    //O(1)
    @Override
    public Book removeBook(long isbn) {
        Book victim = findBook(isbn);
        books.remove(victim);
//        for (int i = 0; i < size; i++) {
//            if (books[i].getIsbn() ==isbn) {
//                victim =books[i];
//                books[i] = books[size - 1];
//                books[size - 1] = null;
//                size--;
//                break;
//            }
//        }
        return victim;
    }

    @Override
    public void printBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
//        for (int i = 0; i < size; i++) {
//            System.out.println(books[i]);
//        }
        System.out.println("<==========================================>");
    }

    @Override
    public int getSize()
    {
        return books.size();
    }
}
