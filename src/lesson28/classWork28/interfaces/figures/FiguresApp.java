package lesson28.classWork28.interfaces.figures;

public class FiguresApp {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle();
        Circle circle3 = new Circle();
        Circle circle4 = new Circle();

        Square square1 = new Square();
        Square square2 = new Square();
        Square square3 = new Square();
        Square square4 = new Square();
        Drawable[] drawables = {circle1, circle2, circle3, circle4, square1, square2, square3, square4};
        for (Drawable drawable: drawables) {
            drawable.draw();
        }
    }
}
