package lesson18.homeWork18.products.model;

import lesson18.homeWork18.products.model.Book;

public class Dictionary extends Book {

    private String type;
    private int wordQuantity;

    public Dictionary(String title, String author, int yearOfPublishing, long isbn, int pageQuantity, String type, int wordQuantity) {
        super(title, author, yearOfPublishing, isbn, pageQuantity);
        this.type = type;
        this.wordQuantity = wordQuantity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getWordQuantity() {
        return wordQuantity;
    }

    public void setWordQuantity(int wordQuantity) {
        this.wordQuantity = wordQuantity;
    }

    public void display() {
        super.display();
        System.out.println("Dictionary type: " + type + " , number of words: " + wordQuantity);
    }

}
