package lesson17.homeWork17.products.model;

/*Создать класс Food расширяющий класс Product с полем private String expDate, которое хранит дату истечения срока годности*/

public class Food extends Product{

    private String expDate; // хранит дату истечения срока годности

    public Food(double price, String name, long barCode, String expDate) {
        super(price, name, barCode);
        this.expDate = expDate;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    //Во всех классах переопределить метод toString.
    @Override
    public String toString() {
        return super.toString() + "Food{" +
                "expDate='" + expDate + '\'' +
                '}';
    }
}
