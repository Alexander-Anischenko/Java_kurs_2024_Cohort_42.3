package lesson21.homeWork21;

public class HomeWork21ArgsApp {
    public static void main(String[] args) {
        if(args.length == 0) {
            System.out.println("All MIN and MAX");
            System.out.println("byte MIN: " + Byte.MIN_VALUE);
            System.out.println("byte MAX: " + Byte.MAX_VALUE);
            System.out.println("short MIN: " + Short.MIN_VALUE);
            System.out.println("short MAX: " + Short.MAX_VALUE);
            System.out.println("char MIN: " + Character.MIN_VALUE);
            System.out.println("char MAX: " + Character.MAX_VALUE);
            System.out.println("int MIN: " + Integer.MIN_VALUE);
            System.out.println("int MAX: " + Integer.MAX_VALUE);
            System.out.println("long MIN: " + Long.MIN_VALUE);
            System.out.println("long MAX: " + Long.MAX_VALUE);
            System.out.println("float MIN: " + Float.MIN_VALUE);
            System.out.println("float MAX: " + Float.MAX_VALUE);
            System.out.println("double MIN: " + Double.MIN_VALUE);
            System.out.println("double MAX: " + Double.MAX_VALUE);
        }
        for (int i = 0; i < args.length; i++) {
            switch (args[i]) {
                case "byte" -> {
                    System.out.println("byte MIN: " + Byte.MIN_VALUE);
                    System.out.println("byte MAX: " + Byte.MAX_VALUE);
                }
                case "short" -> {
                    System.out.println("short MIN: " + Short.MIN_VALUE);
                    System.out.println("short MAX: " + Short.MAX_VALUE);
                }
                case "char" -> {
                    System.out.println("char MIN: " + Character.MIN_VALUE);
                    System.out.println("char MAX: " + Character.MAX_VALUE);
                }
                case "int" -> {
                    System.out.println("int MIN: " + Integer.MIN_VALUE);
                    System.out.println("int MAX: " + Integer.MAX_VALUE);
                }
                case "long" -> {
                    System.out.println("long MIN: " + Long.MIN_VALUE);
                    System.out.println("long MAX: " + Long.MAX_VALUE);
                }
                case "float" -> {
                    System.out.println("float MIN: " + Float.MIN_VALUE);
                    System.out.println("float MAX: " + Float.MAX_VALUE);
                }
                case "double" -> {
                    System.out.println("double MIN: " + Double.MIN_VALUE);
                    System.out.println("double MAX: " + Double.MAX_VALUE);
                }
                default -> {
                    System.out.println(args[i] + " XXX incorrect type");
                }
            }
        }
    }
}
