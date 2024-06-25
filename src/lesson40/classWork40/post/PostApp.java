package lesson40.classWork40.post;
//**Задача:** Написать приложение, которое позволит понять,
// из каких мест на данную почту приходят письма.

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PostApp {
    public static void main(String[] args) {

        Set<String> postCode = new HashSet<>();

        String newPostCode;

        System.out.println("Welcome to post Qffice!");
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Input next Post Code: ");
            newPostCode = scanner.nextLine();
            if (postCode.add(newPostCode)) {
                System.out.println("Post Code added.");
            } else {
                System.out.println("Post Code already exists.");
            }
            System.out.println("Continue? y/n");
            String choice = scanner.nextLine();
            if (choice .equals("n")) {
                System.out.println("Good bye!");
                break;
            }
        } while (true);

        System.out.println("Post codes: ");
        System.out.println(postCode);


    }
}
