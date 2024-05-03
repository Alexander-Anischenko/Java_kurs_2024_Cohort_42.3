package lesson15.homeWork15;

/*Создать класс Cube, описывающий куб cо стороной a. Реализовать в нем методы определения периметра p (сумма длин всех ребер),
площади s (сумма площадей всех граней) и объема v. Создать приложение CubeAppl, в котором создать несколько экземпляров класса Cube.
Для каждого экземпляра вызвать методы класса Cube и рассчитать p, s и v.*/

public class Cube {
    private double a;

    public Cube(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "Cube{" +
                "a=" + a +
                '}';
    }

    public double calculatePerimeter() {
        double p = 12 * a;
        return p;
    }
    public double calculateArea() {
        double s = 6 * (a * a);
        return s;
    }
    public double calculateVolume() {
        double v = a * a * a;
        return v;
    }

}
