package lesson16.homeWork16.task2;

/*Создайте класс Book с полями: название - title автор - author год издания - year уникальный номер - ISBN
В классе Book реализуйте конструктор, геттеры и сеттеры на все поля и метод display, который выводит информацию о книге.*/

public class Book {

    private  String title;
    private String author;
    private int year;
    private long isbn;

    public Book(String title, String author, int year, long isbn) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.isbn = isbn;
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public void displayBook() {
        System.out.println("Book title: " + title + " , autor: " + author + " , year of publication: " + year + " , ISBN: " + isbn);
    }
}
