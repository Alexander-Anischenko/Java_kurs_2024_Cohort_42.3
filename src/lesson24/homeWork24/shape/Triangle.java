package lesson24.homeWork24.shape;

public class Triangle extends Shape{

    private double side;

    public Triangle(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return (Math.sqrt(3) / 4) * Math.pow(side, 2);
    }

    @Override
    public double getPerimeter() {
        return side * 3;
    }
}
