package lesson20.classWork20.library.controller;

import lesson20.classWork20.library.model.Book;

public class Library {

    // fields
    //array for books
    private Book[] books;

    //number of books in library
    private int size;

    // constructor
    public Library(int capasity) {
        this.books = new Book[capasity];
        this.size = 0;
    }

    // methods
    // addBook
    public boolean addBook(Book book) {
        // необходимо в массив добавить элемент
        //  предусмотреть, что не добавляется null, не добавляется дубликатб нельзя превысить вместимость библиотеки
        if (book == null || size == books.length || findBook(book.getIsbn()) != null) {
            return false;
        }
        books[size] = book; //size - это индекс книги, которой еще нет в массиве, size - 1 - это индекс последней, которая есть
        size++;
        return true;
    }

    public Book findBook(long isbn) {
        for (int i = 0; i < size; i++) {
            if (books[i].getIsbn() == isbn) {
                return books[i];
            }
        }
        return null;
    }

    // print books
    public void printBooks() {
        for (int i = 0; i < size; i++) {
            System.out.println(books[i]);
        }
        System.out.println("=================================================");
    }

    // получение количества книг в библиотеке
    public int getSize() {
        return size;
    }

    public Book removeBook(long isbn) {
        //найдем жертву, удаляемую книгу
        Book victim = null;
        //ищем книгу по её isbn
        for (int i = 0; i < size; i++) {
            if (books[i].getIsbn() == isbn) {
                victim = books[i];
                books[i] = books[size - 1];  // на место i-й книги поставили последнюю
                books[size - 1] = null;
                size--;
                break;
            }
        }
        // return удаляемую книгу
        return victim;
    }

}
