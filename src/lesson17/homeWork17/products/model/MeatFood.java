package lesson17.homeWork17.products.model;

/* Создать класс MeatFood расширяющий класс Food с полем private String meatType*/

public class MeatFood extends Food{

    private String meatType; //  хранит тип мяса из которого изготовлен продукт

    public MeatFood(double price, String name, long barCode, String expDate, String meatType) {
        super(price, name, barCode, expDate);
        this.meatType = meatType;
    }

    public String getMeatType() {
        return meatType;
    }

    public void setMeatType(String meatType) {
        this.meatType = meatType;
    }

    // Во всех классах переопределить метод toString.
    @Override
    public String toString() {
        return super.toString() + "MeatFood{" +
                "meatType='" + meatType + '\'' +
                '}';
    }
}
