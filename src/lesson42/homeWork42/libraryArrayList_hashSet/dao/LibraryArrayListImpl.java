package lesson42.homeWork42.libraryArrayList_hashSet.dao;

import lesson42.homeWork42.libraryArrayList_hashSet.model.Book;

import java.util.ArrayList;
import java.util.List;

public class LibraryArrayListImpl implements Library {

    private List<Book> books;
    private int capacity;

    public LibraryArrayListImpl(int capacity) {
        this.books = new ArrayList<>(capacity);
        // не нужно поле size, потму-что ArrayList сам меняет размер по необходимости
        this.capacity = capacity;
    }


    // O(1), O(n)
    @Override
    public boolean createBook(Book book) {
        if (book == null || books.size() == capacity || books.contains(book)) {
            return false;
        }
        books.add(book);
        return true;
    }

    //o(n)
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

    //o(n)
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

    // O(1), O(n)
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
