package lesson32.homeWork32.library.dao;

import lesson32.homeWork32.library.model.Book;

public class LibraryImpl implements Library{

    private Book[] books;

    private int size;

    public LibraryImpl(int capacity) {
        this.books = new Book[capacity];
        this.size = 0;
    }


    @Override
    public boolean createBook(Book book) {
        if (book == null || size == books.length || findBook(book.getIsbn()) != null) {
            return false;
        }
        books[size] =book;
        size++;
        return true;
    }

    @Override
    public Book findBook(long isbn) {
        for (int i = 0; i < size; i++) {
            if (books[i].getIsbn() == isbn) {
                return books[i];
            }
        }
        return null;
    }

    @Override
    public Book findAuthor(String author) {
        for (int i = 0; i < size; i++) {
            if (books[i].getAuthor() == author) {
                return books[i];
            }
        }
        return null;
    }

    @Override
    public Book removeBook(long isbn) {
        Book victim = null;
        for (int i = 0; i < size; i++) {
            if (books[i].getIsbn() ==isbn) {
                victim =books[i];
                books[i] = books[size - 1];
                books[size - 1] = null;
                size--;
                break;
            }
        }
        return victim;
    }

    @Override
    public void printBooks() {
        for (int i = 0; i < size; i++) {
            System.out.println(books[i]);
        }
        System.out.println("<==========================================>");
    }

    @Override
    public int getSize()
    {
        return size;
    }
}
