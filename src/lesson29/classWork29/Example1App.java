package lesson29.classWork29;

public class Example1App {
    public static void main(String[] args) {

        //создаем объект типаStaticNestedClass
        OuterClass.StaticNestedClass staticNestedClassObject;
        staticNestedClassObject = new OuterClass.StaticNestedClass();

        //Вызываем его метод display
        staticNestedClassObject.display();
        System.out.println("=========================================");

        OuterClass outerClassObject = new OuterClass();
        OuterClass.InnerClass innerClassObject = outerClassObject.new InnerClass();
        innerClassObject.display();



    }
}
