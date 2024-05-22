package lesson30.classWork30.lambda_button;

public class App {
    public static void main(String[] args) {

        Action action = () -> {
                System.out.println("Мир делается лучше, подождите немного.....");
                System.out.println("Мир стал лучше.");
        };

        Button button = new Button(action, "Сделать мир лучше");
        button.clic();
    }
}
