package lesson32.homeWork32.library.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @BeforeEach
    void setUp() {
        // Задаем массив книг и заполняем его значениями

    }
    @Test
    void testBookSort() {
        System.out.println("<===Test Book sorting===>");
        //напечатать массив, отсортировать и напечатать отсортированый
        //printArray(books);

    }

    public void printArray(Object[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

}