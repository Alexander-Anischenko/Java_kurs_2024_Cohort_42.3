package lesson28.classWork28.interfaces;

public class AbstractExample1 {

    abstract class Animal{
        abstract void makeSound();
    }
    class Cat extends Animal{
        @Override
        void makeSound(){
            System.out.println("meow");
        }
    }
}
