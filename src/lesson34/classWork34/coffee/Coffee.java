package lesson34.classWork34.coffee;
/*Используя enum, напишите программу для продажи 4-х видов кофе:
ESPRESSO,
AMERICANO,
CAPPUCCINO,
LATTE
Предложите пользователю кофе на выбор, по результатам выбора сообщите стоимость напитка.*/

public enum Coffee {
    ESP(1, "Espresso", 2.5), AMR(2, "Americano", 3.0), CAP(3, "Cappuccino", 4.5), LAT(4, "Latte", 5.0);


    private int number;
    private String name;
    private double price;

    Coffee(int number, String name, double price) {

        this.number = number;
        this.name = name;
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
