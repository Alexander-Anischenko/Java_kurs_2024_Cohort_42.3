package lesson30.classWork30;

public class AnonymusExampleApp {
    public static void main(String[] args) {
        //Создание анонимного класса
        //1. нельзя будет создать второй объект с тем же поведением
        //2. Вы получите объект с типом интерфейса
        Greeting myObject = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hello from anonymous class! ");
            }
            @Override
            public void sayGoodBye() {
                System.out.println("Goo bye from anonymous class! ");
            }
        };

        myObject.sayHello();
        myObject.sayGoodBye();
    }
}
