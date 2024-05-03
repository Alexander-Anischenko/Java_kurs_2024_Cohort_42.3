package lesson17.homeWork17.products.model;

/*Создать класс MilkFood расширяющий класс Food с полями private String milkType, private double fat,
которые хранят тип молока и жирность продукта соответственно*/

public class MilkFood extends Food{

    private String milkType;
    private double fat;

    public MilkFood(double price, String name, long barCode, String expDate, String milkType, double fat) {
        super(price, name, barCode, expDate);
        this.milkType = milkType;
        this.fat = fat;
    }

    public String getMilkType() {
        return milkType;
    }

    public void setMilkType(String milkType) {
        this.milkType = milkType;
    }

    public double getFat() {
        return fat;
    }

    public void setFat(double fat) {
        this.fat = fat;
    }

    // Во всех классах переопределить метод toString.
    @Override
    public String toString() {
        return super.toString() + "MilkFood{" +
                "milkType='" + milkType + '\'' +
                ", fat=" + fat +
                '}';
    }
}
