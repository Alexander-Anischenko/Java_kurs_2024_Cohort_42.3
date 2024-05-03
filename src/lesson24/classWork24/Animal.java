package lesson24.classWork24;

public abstract class Animal {
    abstract void makeSound();

    void breathe() {
        System.out.println("Animal is breathing");
    }
}

class Cow extends Animal {
    @Override
    void makeSound() {
        System.out.println("muuuuuu");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("woof");
    }

    void swim() {
        System.out.println("Dog is swimming");
    }
}


class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("meow");
    }
}


abstract class AnimalInSky extends Animal {
    void fly() {
        System.out.println("Animal is skying");
    }
}


class Bird extends AnimalInSky {
    @Override
    void makeSound() {
        System.out.println("chirik-chirik");
    }
}


class AbstractExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();
        Bird bird = new Bird();

        dog.makeSound();
        cat.makeSound();
        cow.makeSound();
        bird.makeSound();
    }
}

class AbstractExample2 {
    public static void main(String[] args) {
        Animal[] animals = {new Dog(), new Cat(), new Cow(), new Bird()};

        for (Animal animal: animals) {
            animal.makeSound();
        }
    }
}
