package lesson22.homeWork22;

// Дано предложение Л.Н. Толстого

public class Task3_Tolstoy {
    public static void main(String[] args) {

        String string = "В 1800-х годах, в те времена, когда не было еще ни железных, ни шоссейных дорог, ни газового, ни стеаринового света, ни пружинных низких диванов, ни мебели без лаку, ни разочарованных юношей со стеклышками, ни либеральных философов-женщин, ни милых дам-камелий, которых так много развелось в наше время, – в те наивные времена, когда из Москвы, выезжая в Петербург в повозке или карете, брали с собой целую кухню домашнего приготовления, ехали восемь суток по мягкой, пыльной или грязной дороге и верили в пожарские котлеты, в валдайские колокольчики и бублики, – когда в длинные осенние вечера нагорали сальные свечи, освещая семейные кружки из двадцати и тридцати человек, на балах в канделябры вставлялись восковые и спермацетовые свечи, когда мебель ставили симметрично, когда наши отцы были еще молоды не одним отсутствием морщин и седых волос, а стрелялись за женщин и из другого угла комнаты бросались поднимать нечаянно и не нечаянно уроненные платочки, наши матери носили коротенькие талии и огромные рукава и решали семейные дела выниманием билетиков, когда прелестные дамы-камелии прятались от дневного света, – в наивные времена масонских лож, мартинистов, тугендбунда, во времена Милорадовичей, Давыдовых, Пушкиных, – в губернском городе К. был съезд помещиков, и кончались дворянские выборы.";

        int numberOfWords = counterOfWords(string);
        System.out.println("Number of words-> " + numberOfWords);

        int numberOfLetters = counterOfLetters(string);
        System.out.println("Number of letters-> " + numberOfLetters);

    }

    //  Подсчитайте, сколько букв (не символов!) в этом предложении.
    private static int counterOfLetters(String string) {
        String letterCount = string.replaceAll("[^А-Яа-я]", "");
        int numberOfLetters = letterCount.length();
        return numberOfLetters;
    }

    //Напишите метод, который отвечает на вопрос сколько слов в этом предложении.
    private static int counterOfWords(String string) {
        int wordCount = 0;
        wordCount = string.trim().isEmpty() ? 0 : string.trim().split("\\s+").length;

        return wordCount;
    }
}