package lesson34.classWork34.seasons;

public enum Season {

    WINTER(1, "Winter"), SPRING(2, "Spring"), SUMMER(3,"Summer"), AUTUMN(4, "Autumn");

    //fields
    private int number;
    private String name;
    //constructor

    Season(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

}
