package lesson43.classWork43.map_introduction;

import java.util.HashMap;
import java.util.Map;

public class WordsFrequencyApp {
    public static void main(String[] args) {

        String[] words = {"abc", "ab", "limit", "ab", "a", "ab", "limit"};

        printWordsFrequency(words);

    }

    private static void printWordsFrequency(String[] words) {
        Map<String, Integer> resMap = new HashMap<>();
        for (String word : words) {
            if (! resMap.containsKey(word)) { // если такого слова ещё не было
                 resMap.put(word, 1); // кладем его при каждом совпадении в числе 1
            } else {
                resMap.put(word, resMap.get(word) + 1);
            }
        }
        System.out.println(resMap);
    }

}
