package lesson24.homeWork24.shapeApp;

import lesson24.homeWork24.shape.Shape;
import lesson24.homeWork24.shape.Square;
import lesson24.homeWork24.shape.Triangle;

public class ShapeApp {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Square("red", 3),
                new Square("white", 11),
                new Triangle("green", 6),
                new Triangle("blue", 20)};

        for (int i = 0; i < shapes.length; i++) {
            shapes[i].printInfo();
            System.out.println("------------------------------------");
        }
    }
}
