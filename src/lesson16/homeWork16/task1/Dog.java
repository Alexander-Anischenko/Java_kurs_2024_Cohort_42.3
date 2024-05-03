package lesson16.homeWork16.task1;

import lesson14.homeWork.Pet;

// Make the Dog class a child of the Pet class
public class Dog extends Pet {

    // Making fields for a new class
    private String breedOfDog;
    private double heightOfDog;
    private double weightOfDog;

    // Making constructor for a new class
    public Dog(int id, String petType, int age, String petName, String breedOfDog, double heightOfDog, double weightOfDog) {
        super(id, petType, age, petName);
        this.breedOfDog = breedOfDog;
        this.heightOfDog = heightOfDog;
        this.weightOfDog = weightOfDog;
    }

    public String getBreedOfDog() {
        return breedOfDog;
    }

    public void setBreedOfDog(String breedOfDog) {
        this.breedOfDog = breedOfDog;
    }

    public double getHeightOfDog() {
        return heightOfDog;
    }

    public void setHeightOfDog(double heightOfDog) {
        this.heightOfDog = heightOfDog;
    }

    public double getWeightOfDog() {
        return weightOfDog;
    }

    public void setWeightOfDog(double weightOfDog) {
        this.weightOfDog = weightOfDog;
    }

    @Override
    public String toString() {
        return super.toString() +  "Dog{" +
                "breedOfDog='" + breedOfDog + '\'' +
                ", heightOfDog=" + heightOfDog +
                ", weightOfDog=" + weightOfDog +
                '}';
    }

    // Method overloading
    public void makeSound() {
        System.out.println("Woof-woof! ");
    }
}
