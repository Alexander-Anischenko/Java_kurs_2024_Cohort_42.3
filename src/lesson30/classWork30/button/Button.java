package lesson30.classWork30.button;

public class Button {

    private String title;

    private Action action;

    public Button(Action action, String title) {
        this.action = action;
        this.title = title;
    }

    @Override
    public String toString() {
        return "Button{" +
                "action=" + action +
                ", title='" + title + '\'' +
                '}';
    }

    public void clic() {
        System.out.println("Нажали кнопку " + this.title);
        this.action.perform();
    }
}
