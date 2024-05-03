import java.util.Scanner;

public class LetterInString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Intput string: ");

        String str = scanner.nextLine();
        int l = str.length();
        int count = 0;

        while (count < l) {
            System.out.println(str.charAt(count));
            count++;
        }
    }
}
