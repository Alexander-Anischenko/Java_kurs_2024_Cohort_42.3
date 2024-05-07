package lesson28.classWork28.interfaces.figures;

public interface Drawable {
    void draw();

    default void resize() {
        System.out.println("resizing of smth");
    }
}
