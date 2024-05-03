package lesson21.classWork21.arguments;

public class ArgsAppExample {
    public static void main(String[] args) {

        // main - это метод типа void
        // в скобках - это аргументы метода
        // String[] - массив строк, его зовут args

        String str1 = args[0];
        int num1 = Integer.parseInt(str1);

        String str2 = args[1];
        int num2 =Integer.parseInt(str2);
        System.out.println(str1 + "*" + str2 +"=" + num1 * num2);

    }
}
