package lesson30.homeWork30.anonym;

public class CookingApp {
    public static void main(String[] args) {
        Cooking cooking = new Cooking() {
            @Override
            public void cooking() {
                System.out.println("The cook is cooking paella. ");
                System.out.println("Paella is ready! ");
            }
        };

        Cook cook = new Cook(cooking, "paella");

        cook.order();

    }
}
