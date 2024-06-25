package lesson40.homeWork40;

import java.util.HashSet;
import java.util.Set;

public class SentenceDostoevsky {
    public static void main(String[] args) {

        String sentenceDostoevsky = "Он был человек, безусловно, больной, потому что в мире, видимо, есть две категории людей, - одни, способные видеть божество, и другие, не способные видеть божество, - и первая категория, хотя и содержит в себе много людей с мятежным духом, всё-таки живёт в богословском веке, тогда как вторая категория, к которой принадлежал Иван Фёдорович, неизбежно и вполне сознательно вступает в тьму, ибо человек, который хотя бы только один раз, даже всего на одну минуту, видит Бога, уже не может отказаться от этого видения и опять стать обыкновенным человеком.";

        // How many unique words does it have?
        // создаем массив из строк предложния Достоевского, разделяя его с помощью метода split , использующего пробелы, как место разделения
        String[] words = sentenceDostoevsky.split(" ");

        // количество индексов в массиве words, используем метод length, возвращающий цифровое значение
        int l = words.length;
        System.out.println("Number of words in  sentence= " + l); // выводим количество слов в предложении

        // создаем  uniqueWordsSet как строчный объект класса HashSet
        Set<String> uniqueWordsSet = new HashSet<>();

        // переводим при помощи цикла foreach строчный массив words в множество HashSet, попутно избавляясь от дубликатов, потому-что HashSet содержит только уникальные значения
        for (String str : words) {
            uniqueWordsSet.add(str);
        }

        //печатаем множество uniqueWordsSet
        System.out.println(uniqueWordsSet);
        // печатаем количество уникальных слов в множестве, используя метод size()
        System.out.println("Quantity of unique words in sentence: " + uniqueWordsSet.size());

        // How many unique characters does it have?
        String[] characters = sentenceDostoevsky.split("");

        // повторяем
        int q = characters.length;
        // количество символов
        System.out.println("Number of characters in  sentence= " + q);

        Set<String> uniqueCharactersSet = new HashSet<>();

        for (String c : characters) {
            uniqueCharactersSet.add(c);
        }

        // печатаем множество uniqueCharactersSet
        System.out.println(uniqueCharactersSet);
        // печатаем количество уникальных слов в множестве, используя метод size()
        System.out.println("Quantity of unique characters in sentence: " + uniqueCharactersSet.size());
    }
}
