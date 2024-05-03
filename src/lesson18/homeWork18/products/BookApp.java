package lesson18.homeWork18.products;
//В классе BookAppl в методе main создайте массив типа Book и в нем 4 книги и 3 словаря. Выведите информацию о них в консоль.
/* Реализуйте методы, которые выдают:

общее количество страниц во всех книгах;
среднее значение количества слов в словарях;
средний возраст всех изданий.*/

import lesson18.homeWork18.products.model.Book;
import lesson18.homeWork18.products.model.Dictionary;

public class BookApp {
    public static void main(String[] args) {

        Book[] b = new Book[7];

        b[0] = new Book("Love and flame", "Ashley Stone", 2022, 1234567891234l, 87);
        b[1] = new Book("The catacombs of Jakarta", "Anditi Gupta", 1999, 1234567891235l, 176);
        b[2] = new Book("1,000 years ahead", "Bur Kilychev", 1978, 1234567891236l, 203);
        b[3] = new Book("Lost in the Amazon", "Jacob Anderson", 2005, 1234567891237l, 324);
        b[4] = new Dictionary("Paperback Oxford English Dictionary" ,"Oxford University Press", 2013, 9780199640942l, 864, "Pocket book" ,120000);
        b[5] = new Dictionary("Collins English Dictionary", "Collins; 11th edition", 2011, 9780007437863l, 1920, "Dictionary", 200000);
        b[6] = new Dictionary("Duden - Deutsches Universalwörterbuch", "Bibliographisches Institut, Mannheim", 2011, 9783411055074l, 2112, "German dictionary", 500000);

        System.out.println("---------List of books----------");
        showListOfBooks(b);
        System.out.println();

        int sum = getTotalNumberOfPages(b);
        System.out.println("Total number of pages: " + sum);
        System.out.println();

        double averNum = getAverageNumberOfWords(b);
        System.out.println("Average number of words in dictionarie: " + averNum);
        System.out.println();

        int averAge = getAverageAgeOfAllPublications(b);
        System.out.println("Average age of all publications: " + averAge);


    }

    // средний возраст всех изданий.
    private static int getAverageAgeOfAllPublications(Book[] b) {
        int a = 0; // averaging down to int
        int count = 0; // Cycle counter
        for (int i = 0; i < b.length; i++) {
            a += b[i].getYearOfPublishing();
            count++;
        }
        return a /= count;
    }

    // среднее значение количества слов в словарях;
    private static double getAverageNumberOfWords(Book[] b) {
        double num = 0;
        int count = 0; // Cycle counter
        for (int i = 0; i < b.length; i++) {
            if (b[i] instanceof Dictionary) {
                Dictionary dictionary = (Dictionary) b[i];
                num += dictionary.getWordQuantity();
                count++;
            }
        }
        return num /= count;
    }

    // общее количество страниц во всех книгах;
    private static int getTotalNumberOfPages(Book[] b) {
        int sum = 0;
        for (int i = 0; i < b.length; i++) {
            sum += b[i].getPageQuantity();

        }
        return sum;
    }

    private static void showListOfBooks(Book[] b) {
        for (int i = 0; i < b.length; i++) {
            b[i].display();
        }
    }
}
