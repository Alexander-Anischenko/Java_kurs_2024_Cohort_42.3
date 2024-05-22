package lesson30.classWork30.calcuiator;

public class CalculatorApp {
    public static void main(String[] args) {
        Calculator plus = new Calculator() {
            @Override
            public int operate(int a, int b) {
                return a + b;
            }
        };


        Calculator minus = new Calculator() {
            @Override
            public int operate(int a, int b) {
                return a - b;
            }
        };
        int resultSum = plus.operate(5, 6);
        System.out.println("sum: " + resultSum);

        int resultDiff = minus.operate(2, 9);
        System.out.println("difference: " + resultDiff);
    }
}
