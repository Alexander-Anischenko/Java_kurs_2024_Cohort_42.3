package lesson24.classWork24;

public class StringExample {
    public static void main(String[] args) {
        // Create empty String
        String shoppingList = "";
        shoppingList = shoppingList + "Milk";
        shoppingList = shoppingList + ", Eggs";
        shoppingList = shoppingList + ", Bread";
        shoppingList = shoppingList + ", Chocolate";

        // Display shopping list
        System.out.println("Shopping list-> " + shoppingList);

    }
}
