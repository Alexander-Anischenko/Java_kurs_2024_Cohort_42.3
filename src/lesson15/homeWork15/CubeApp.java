package lesson15.homeWork15;

public class CubeApp {
    public static void main(String[] args) {

        Cube cube1 = new Cube(3);
        Cube cube2 = new Cube(6.2);
        Cube cube3 = new Cube(78);


        System.out.println(cube1);
        System.out.println("Perimetr = " + cube1.calculatePerimeter());
        System.out.println("Area = " + cube1.calculateArea());
        System.out.println("Volume = " + cube1.calculateVolume());
        System.out.println();

        System.out.println(cube2);
        System.out.println("Perimetr = " + cube2.calculatePerimeter());
        System.out.println("Area = " + cube2.calculateArea());
        System.out.println("Volume = " + cube2.calculateVolume());
        System.out.println();

        System.out.println(cube3);
        System.out.println("Perimetr = " + cube3.calculatePerimeter());
        System.out.println("Area = " + cube3.calculateArea());
        System.out.println("Volume = " + cube3.calculateVolume());
    }
}
