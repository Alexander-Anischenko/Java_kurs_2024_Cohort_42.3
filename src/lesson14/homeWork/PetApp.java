package lesson14.homeWork;

public class PetApp {
    public static void main(String[] args) {
        Pet cat = new Pet(1, "cat", 5, "Mursik");
        Pet dog = new Pet(2, "dog", 6, "Muchtar");
        Pet parrot = new Pet(3, "parrot", 3, "Kesha"); // Попугай

        System.out.println(cat);
        cat.sleep();
        cat.makeSound();
        cat.eat();
        cat.sleep();
        cat.play();
        cat.walk();
        cat.eat();
        cat.sleep();
        System.out.println();

        System.out.println(dog);
        dog.sleep();
        dog.walk();
        dog.makeSound();
        dog.eat();
        dog.walk();
        dog.play();
        dog.eat();
        dog.sleep();
        System.out.println();

        System.out.println(parrot);
        parrot.sleep();
        parrot.makeSound();
        parrot.eat();
        parrot.play();
        parrot.walk();
        parrot.eat();
        parrot.sleep();

    }
}
