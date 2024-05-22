package lesson30.classWork30;

public class FirstTimeInSchoolApp {
    public static void main(String[] args) {
        System.out.println(
                "Мальчик Петя пришел на урок впервые. " +
                        "Занятие началось и учитель поприветствовал класс"
        );
        System.out.println("И тут он говорит: ");
        Greeting speech = new Greeting() {

            @Override
            public void sayHello() {
                System.out.println("Здорова мужики!");
            }

            @Override
            public void sayGoodBye() {
                System.out.println("Досвидос! ");
            }
        };
        speech.sayHello();
        speech.sayGoodBye();

        System.out.println("История этим и кончилась.");
    }
}
