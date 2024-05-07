package lesson28.classWork28.interfaces;

public interface MakeSound {
    void makeSound();
}

interface Walk {
    void walk();
}
class Cat2 implements MakeSound, Walk{
    @Override
    public void makeSound() {
        System.out.println("meow");
    }

    @Override
    public void walk() {
        System.out.println("cat is walking");
    }
}
