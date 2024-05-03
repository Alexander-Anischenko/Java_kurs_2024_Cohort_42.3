package lesson23.classWord23.sentence_test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SentenceTest {

    Sentence sentence;

    @BeforeEach  // Перед каждым тестом
    void setUp() {
        sentence = new Sentence();
    }

    @Test
    void countWords() {
        String str = "One two three four.";
        assertEquals( 4, sentence.countWords(str));
    }

    @Test
    void countSymbols() {
        String str = "One? Two. Three";
        assertEquals( 15, sentence.countSymbols(str));
    }
}