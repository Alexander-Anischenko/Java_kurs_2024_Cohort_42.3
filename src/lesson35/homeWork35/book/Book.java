package lesson35.homeWork35.book;

/*Create an example of a class with the Comparable interface using two fields. For example:
books by the same author, but with different years of publication.*/

import java.util.Objects;

public class Book implements Comparable<Book>{

    // Fields
    private String title;
    private String author;
    private int yearOfPublishing;
    private long isbn;

    // Constructor


    public Book(String title, String author, int yearOfPublishing, long isbn) {
        this.title = title;
        this.author = author;
        this.yearOfPublishing = yearOfPublishing;
        this.isbn = isbn;
    }

    public long getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
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
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
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
        int res = this.author.compareTo(o.author); //compare by author
        if (res != 0) { //if res is not 0
            return res; // then we are satisfied with it and it will be sorted by it
        } else  {
            res = this.yearOfPublishing - o.yearOfPublishing; // sorted by field int yearOfPublishing via subtracting
        }
        return res;
    }
}
