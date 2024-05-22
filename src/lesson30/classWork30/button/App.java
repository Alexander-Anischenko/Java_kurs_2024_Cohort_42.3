package lesson30.classWork30.button;

public class App {
    public static void main(String[] args) {

        Action action = new Action() {
            @Override
            public void perform() {
                System.out.println("Мир делается лучше, подождите немного.....");
                System.out.println("Мир стал лучше.");
            }
        };

        Button button = new Button(action, "Сделать мир лучше");
        button.clic();
    }
}
