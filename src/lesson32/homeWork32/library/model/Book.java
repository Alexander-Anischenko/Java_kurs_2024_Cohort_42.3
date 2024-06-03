package lesson32.homeWork32.library.model;

import java.util.Objects;

public class Book implements Comparable<Book>{

    public static final int ISBN_LENGTH = 13; // Константа (final - значение константы изменить нельзя)

    private String title;
    private String author;
    private int yearOfPublishing;
    private long isbn;

    public Book(String author, long isbn, String title, int yearOfPublishing) {
        this.author = author;
        this.isbn = isbn;
        this.title = title;
        this.yearOfPublishing = yearOfPublishing;
    }

    public long getIsbn() {
        return isbn;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", yearOfPublishing=" + yearOfPublishing +
                ", isbn=" + isbn +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book book)) return false;
        return yearOfPublishing == book.yearOfPublishing && isbn == book.isbn && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, yearOfPublishing, isbn);
    }

    @Override
    public int compareTo(Book o) {
        return this.author.compareTo(o.author);
    }
}
