package consultation11;

import lesson23.classWord23.sentence_test.Sentence;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
// Разработать тесты для методов



public class SentenceTest {
    private Sentence sentence;

    @BeforeEach
    public void setUp() {
        this.sentence = new Sentence();
    }
    @Test
    public void testCountWords() {
        int countAnimalImSentence =sentence.countWords("cat dog lkpjk lkhg");
        Assertions.assertEquals(4, countAnimalImSentence);
    }
    @Test
    public void testCountSymbols() {
        int countAnimalSymbols = sentence.countSymbols("cat dog lkpjk lkhg");
        Assertions.assertEquals(18
                , countAnimalSymbols);

    }
}
