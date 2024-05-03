package lesson20.classWork20.library;

import lesson20.classWork20.library.controller.Library;
import lesson20.classWork20.library.model.Book;

public class libraryApp {
    public static void main(String[] args) {
        Library library = new Library(1000);

        library.addBook(new Book("Война и мир", "Л.Н.Толстой",2020, 1000000000000l));
        library.addBook(new Book("Title1", "Autor1",2021, 2000000000000l));
        library.addBook(new Book("Title2", "Autor2",2023, 3000000000000l));

        System.out.println("Book number: " + library.getSize());

        library.addBook(new Book("Title3", "Autor3",2023, 3000000000000l));

        System.out.println("Book number: " + library.getSize());

        library.printBooks();

        library.addBook(new Book("Title4", "Autor4",2024, 4000000000000l));

        library.printBooks();

        library.removeBook(4000000000000l); //  remove

        System.out.println("Book number: " + library.getSize());

        library.printBooks();

        library.removeBook(1000000000000l);

        System.out.println("Book number: " + library.getSize());

        library.printBooks();


    }
}
