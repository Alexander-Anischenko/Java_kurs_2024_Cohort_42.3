package lesson14.homeWork;

/*Задача 1. Создать класс Pet (Домашнее животное) с приватными полями: id, вид, возраст, кличка

Стандартные методы: конструктор на все поля; геттеры и сеттеры на все поля; метод toString.

Дополнительные методы: спать, есть, делать звук, играть, гулять
В классе PetAppl создать несколько экземпляров домашних животных. Отобразить прожитый день.*/

public class Pet {
    private int id;
    private String petType;
    private int age;
    private String petName;

    public Pet(int id, String petType, int age, String petName) {
        this.id = id;
        this.petType = petType;
        this.age = age;
        this.petName = petName;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPetType() {
        return petType;
    }

    public void setPetType(String petType) {
        this.petType = petType;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "id=" + id +
                ", petType='" + petType + '\'' +
                ", age=" + age +
                ", petName='" + petName + '\'' +
                '}';
    }

    public void sleep() {
        System.out.println("Pet is sleeping. ");
    }
    public void eat() {
        System.out.println("Pet is eating. ");
    }
    public void makeSound() {
        System.out.println("Pet makes a sound. ");
    }
    public void play() {
        System.out.println("Pet playing. ");
    }
    public void walk() {
        System.out.println("Pet makes is walking. ");
    }

}
