package lesson16.homeWork16.task1;

/* Создайте дочерние от класса Pet классы Cat и Dog c дополнительными полями: порода, рост, вес.
Создайте метод voice, который выдает "Мяу!" для класса Cat и и "Гав-гав!" для класса Dog.
Создайте HouseAppl, в котором есть метод main. Поселите в доме 2 собаки и 3 кошки. Смоделируйте жизнь в этом доме в течение дня.*/

import lesson14.homeWork.Pet;

public class HouseApp {
    public static void main(String[] args) {

        // Make an array of 5 animals, of which 3 are cats and 2 are dogs
        Pet[] pet = new Pet[5];
        pet[0] = new Cat(01,"Cat", 4, "Murzik", "Yard cat", 24, 4.5);
        pet[1] = new Cat(02,"Cat", 7, "Simka", "Siamese cat", 23, 5.2);
        pet[2] = new Cat(03,"Cat", 3, "Tigrusha", "Maine Coon cat", 43, 6.4);
        pet[3] = new Dog(04, "Dog", 5, "Shastik", "Poodle", 45, 20);
        pet[4] = new Dog(05, "Dog", 8, "Ralf", "German Shepherd", 62, 35);

        // What do pets do in the house?
        System.out.println(pet[0]);
        pet[0].eat();
        System.out.println();

        System.out.println(pet[1]);
        pet[1].makeSound();
        System.out.println();

        System.out.println(pet[3]);
        pet[3].makeSound();
        System.out.println();

        System.out.println(pet[2]);
        pet[2].play();
        System.out.println();

        System.out.println(pet[4]);
        pet[4].walk();
    }
}
