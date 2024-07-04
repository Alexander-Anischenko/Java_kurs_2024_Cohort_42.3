package lesson44.classWork44.users;
//  Ваша задача - создать список пользователей
//  выполнить фильтрацию с помощью лямбда-выражений и вывести результат на экран.
//  Найти всех пользователей старше 18 лет.
//  Найти всех пользователей младше 30 лет с именем, начинающимся на букву "A".`

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class UserApp {
    public static void main(String[] args) {
        List<User> userList = Arrays.asList(
                new User("Alice", 25),
                new User("Bob", 15),
                new User("Alex", 22),
                new User("Victoria", 19),
                new User("Paul", 60),
                new User("Yulia", 18),
                new User("Lina", 30)
        );
        
        for (User user : userList) {
            System.out.println(user);
        }

        System.out.println("<====================================>");

        List<User> usersGrater18Age = findUserByPredicate(userList, user -> user.getAge() > 18);
        for (User user : usersGrater18Age) {
            System.out.println(user);
        }

        List<User> usersYounger30StartsA = findUserByPredicate(userList, user -> user.getAge() < 30 && user.getLogin().charAt(0) == 'A');
        System.out.println("<====================================>");
        for (User user : usersYounger30StartsA) {
            System.out.println(user);
        }

    }

    private static List<User> findUserByPredicate(List<User> userList, Predicate<User> predicate) {
        List<User> resList = new ArrayList<>();
        for (User user : userList) {
            if (predicate.test(user)) {
                resList.add(user);
            }
        }
        return resList;
    }
}
