package lesson16.homeWork16.task1;

import lesson14.homeWork.Pet;

// Make the Cat class a child of the Pet class
public class Cat extends Pet {

    // Making fields for a new class
    private String breedOfCat;
    private double heightOfCat;
    private double weightOfCat;

    // Making constructor for a new class
    public Cat(int id, String petType, int age, String petName, String breedOfCat, double heightOfCat, double weightOfCat) {
        super(id, petType, age, petName);
        this.breedOfCat = breedOfCat;
        this.heightOfCat = heightOfCat;
        this.weightOfCat = weightOfCat;
    }

    public String getBreedOfCat() {
        return breedOfCat;
    }

    public void setBreedOfCat(String breedOfCat) {
        this.breedOfCat = breedOfCat;
    }

    public double getHeightOfCat() {
        return heightOfCat;
    }

    public void setHeightOfCat(double heightOfCat) {
        this.heightOfCat = heightOfCat;
    }

    public double getWeightOfCat() {
        return weightOfCat;
    }

    public void setWeightOfCat(double weightOfCat) {
        this.weightOfCat = weightOfCat;
    }

    @Override
    public String toString() {
        return super.toString() + "Cat{" +
                "breedOfCat='" + breedOfCat + '\'' +
                ", heightOfCat=" + heightOfCat +
                ", weightOfCat=" + weightOfCat +
                '}';
    }

    // Method overloading
    public void makeSound() {
        System.out.println("Meow! ");
    }
}
