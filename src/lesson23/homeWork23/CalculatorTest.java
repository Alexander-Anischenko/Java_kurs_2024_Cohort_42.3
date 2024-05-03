package lesson23.homeWork23;
// Создать CalculatorTest, покрыть все методы тестами.

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void divisionWithIntegerPart() {

        assertEquals(1, Calculator.divisionWithIntegerPart(7, 4));
    }

    @Test
    void divisionWithRemainder() {
        assertEquals(1 , Calculator.divisionWithIntegerPart(8, 6));
    }

    @Test
    void subtraction() {
        assertEquals(2, Calculator.subtraction(9, 7));
    }

    @Test
    void multiplication() {
        assertEquals(88, Calculator.multiplication(11, 8));
    }

    @Test
    void addition() {
        assertEquals(28, Calculator.addition(22, 6));
    }
}