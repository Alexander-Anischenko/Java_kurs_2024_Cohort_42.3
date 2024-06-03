package lesson32.homeWork32.library;

import lesson32.homeWork32.library.dao.Library;
import lesson32.homeWork32.library.dao.LibraryImpl;
import lesson32.homeWork32.library.model.Book;

public class LibraryApp {
    public static void main(String[] args) {

        LibraryImpl library = new LibraryImpl(4);

        Book[] books = new Book[3];
        books[0] =new Book("DAuthor1", 1000000000000l, "RTitle1", 1958);
        books[1] =new Book("TAuthor2", 1000000000001l, "VTitle2", 1949);
        books[2] =new Book("ZAuthor3", 1000000000002l, "STitle2", 2003);

        //add books to library
        for (Book b : books) {
            library.createBook(b);
        }
        //print books
        library.printBooks();
        //find book with isbn 1000000000001l
        Book book = library.findBook(1000000000001l);
        System.out.println("Book with isbn 1000000000001l => " + book);
        System.out.println("<===========================================>");
        //find TAuthor2
        Book book1 = library.findAuthor("TAuthor2");
        System.out.println("Find TAuthor2=> " + book1);
        System.out.println("<===========================================>");
        //get size
        int total = library.getSize();
        System.out.println("Total books in library=> " + total);
        System.out.println("<===========================================>");
        // remove book with isbn 1000000000001l
        Book removable = library.removeBook(1000000000001l);
        System.out.println("Remove book with isbn 1000000000001l => " + removable);
        library.printBooks();int total1 = library.getSize();
        System.out.println("Total books in library=> " + total1);
        System.out.println("<===========================================>");

    }
}
