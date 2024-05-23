package lesson30.homeWork30.lambda;

public class Cook {

private String order;

private Cooking cooking;

    public Cook(Cooking cooking, String order) {
        this.cooking = cooking;
        this.order = order;
    }

    @Override
    public String toString() {
        return "Cook{" +
                "cooking=" + cooking +
                ", order='" + order + '\'' +
                '}';
    }

    public void order() {
        System.out.println("The cook got the orde to cook " + this.order + ".");
        this.cooking.cooking();
    }
}
