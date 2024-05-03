package lesson16.homeWork16.task2;

//Создайте класс Dictionary, который расширяет класс Book.

public class Dictionary extends Book{

    // Предложите для него набор полей и переопределите метод display
    private String motherLanguage;
    private String foreignLanguage;
    private int wordCount;

    public Dictionary(String title, String author, int year, long isbn, String motherLanguage, String foreignLanguage, int wordCount) {
        super(title, author, year, isbn);
        this.motherLanguage = motherLanguage;
        this.foreignLanguage = foreignLanguage;
        this.wordCount = wordCount;
    }

    public String getMotherLanguage() {
        return motherLanguage;
    }

    public void setMotherLanguage(String motherLanguage) {
        this.motherLanguage = motherLanguage;
    }

    public String getForeignLanguage() {
        return foreignLanguage;
    }

    public void setForeignLanguage(String foreignLanguage) {
        this.foreignLanguage = foreignLanguage;
    }

    public int getWordCount() {
        return wordCount;
    }

    public void setWordCount(int wordCount) {
        this.wordCount = wordCount;
    }

    public void displayBook() {
        super.displayBook();
        System.out.println( motherLanguage + " - " + foreignLanguage + " dictionary for " + wordCount + " words.");
    }
}
