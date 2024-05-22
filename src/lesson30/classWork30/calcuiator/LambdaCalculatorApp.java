package lesson30.classWork30.calcuiator;

public class LambdaCalculatorApp {
    public static void main(String[] args) {

        Calculator plus = (a, b) -> a + b; // Лямбда выражение (синтаксический сахар, то-же, что и plus в CalculatorApp

        Calculator minus = (a, b) -> a - b; // Лямбда выражение (синтаксический сахар, то-же, что и minus в CalculatorApp

        int resultSum = plus.operate(5, 6);
        System.out.println("sum: " + resultSum);

        int resultDiff = minus.operate(2, 9);
        System.out.println("difference: " + resultDiff);

    }
}
