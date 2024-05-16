package lesson29.classWork29;

public class OuterClass {
    private static String staticField = "Static field";
    private String field = "Nonstatic field";
    private StaticNestedClass staticNestedClassObject;

    // Статический вложенный класс
    static class StaticNestedClass {

        private static String nestedStaticField = "вложенное статическое поле";
        private  String nestedField = "вложенное  поле";


        void display() {
            // Обращение к статическому полю внешнего класса
            System.out.println(staticField);
            // Обращение к нестатическому полю внего класса
           // System.out.println(field); // Ошибка

            // Обращение к полям самого StaticNestedClass
            // происходит обычном образом
            System.out.println(nestedStaticField);
            System.out.println(nestedField);

            System.out.println(OuterClass.InnerClass.innerStaticField);
        }
    }

    class InnerClass {



        private  String innerField = "внутреннее  поле";
        private static String innerStaticField = "Inner static field";

        void  display() {

            // Обращение к статическому полю внешнего класса
            System.out.println(staticField);

            // Обращение к нестатическому полю внего класса
            System.out.println(field);

            //обращение к нестатическому полю экземпляра класса InnerClass в полной форме
            System.out.println(this.innerField);

            //обращение к статическому полю внешнего класса в полной форме
            System.out.println(OuterClass.staticField);

            //обращение к нестатическому полю внешнего класса в полной форме
            System.out.println(OuterClass.this.field);

            System.out.println(OuterClass.StaticNestedClass.nestedStaticField);

            System.out.println(OuterClass.this.staticNestedClassObject.nestedField);
        }
    }
}
