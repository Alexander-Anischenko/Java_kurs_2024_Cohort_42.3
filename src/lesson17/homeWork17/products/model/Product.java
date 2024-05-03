package lesson17.homeWork17.products.model;

/* Создать класс Product, с полями:

private double price
private String name
private long barCode;*/

public class Product {
    private double price;
    private String name;
    private long barCode;

    public Product(double price, String name, long barCode) {
        this.price = price;
        this.name = name;
        this.barCode = barCode;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBarCode() {
        return barCode;
    }

    public void setBarCode(long barCode) {
        this.barCode = barCode;
    }

    //Во всех классах переопределить метод toString.
    @Override
    public String toString() {
        return "Product{" +
                "price=" + price +
                ", name='" + name + '\'' +
                ", barCode=" + barCode +
                '}';
    }

    // Задача 2. В Задаче 1 переопределить метод equals для сравнения объектов.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        return barCode == product.barCode;
    }

    @Override
    public int hashCode() {
        return (int) (barCode ^ (barCode >>> 32));
    }
}
