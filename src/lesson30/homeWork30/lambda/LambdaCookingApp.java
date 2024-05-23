package lesson30.homeWork30.lambda;

public class LambdaCookingApp {
    public static void main(String[] args) {
        Cooking cooking = () -> {
            System.out.println("The cook is cooking paella");
            System.out.println("Paella is ready! ");
        };

        Cook cook = new Cook(cooking, "paella");

        cook.order();

    }
}
