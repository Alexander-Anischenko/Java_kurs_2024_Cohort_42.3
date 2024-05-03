package lesson24.classWork24;

public class UserExample {
    public static void main(String[] args) {
        User user1 = new User(100, "Karl");
        User user2 = new User(100, "Karl");
        User user3 = new User(101, "Karl");

        System.out.println("user1 == user2-> " + user1.equals(user2));
        System.out.println("user1 == user3-> " + user1.equals(user3));
        System.out.println("--------------------------------------------------");

        System.out.println("hash(" + user1 + ") = " + user1.hashCode());
        System.out.println("hash(" + user2 + ") = " + user2.hashCode());
        System.out.println("hash(" + user3 + ") = " + user3.hashCode());
    }
}
