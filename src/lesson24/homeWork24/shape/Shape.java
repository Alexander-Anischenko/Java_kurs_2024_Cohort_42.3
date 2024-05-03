package lesson24.homeWork24.shape;
// создайте иерархию классов для представления различных
// 5 геометрических фигур, используя абстрактные классы и методы.

public abstract class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    // абстрактный метод для получения площади
    public abstract double getArea();

    // абстрактный метод для получения периметра
    public abstract double getPerimeter();

    // общий метод для вывода информации о фигуре
    public void printInfo() {
        System.out.println("Color-> " + color);
        System.out.println("Area-> " + getArea());
        System.out.println("Perimeter-> " + getPerimeter());
    }
}
