package lesson24.classWork24;

public class StringBuilderExample2 {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();
        str.append("a"); // append - добавить
        System.out.println(str.toString());
        str.append(" cat");
        System.out.println(str.toString());
        str.insert(0, "I have "); // insert вставить(место в строке, начиная с нуля, "нужную часть строки")
        System.out.println(str.toString());
        str.delete(7,9); //удаление, от одного, до другого индекса, указанного в методе
        System.out.println(str.toString());
        int i =str.indexOf("cat"); // импользуется для поиска индекса первого вхождения указанной подстроки, при отсутствии -1
        str.delete(i, i + 3);
        System.out.println(str.toString());
        int haveIndex = str.indexOf("have");
        str.replace(haveIndex, haveIndex + 4, "had"); // замена указанного в индексах на другую строку "had"
        System.out.println(str.toString());
        str.append("headache");
        System.out.println(str.toString());
        System.out.println(str.reverse().toString()); // переворачивает строку задом наперед

    }
}
