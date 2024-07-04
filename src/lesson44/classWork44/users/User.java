package lesson44.classWork44.users;

import java.util.Objects;

public class User {

    private String login;
    private int age;

    public User(String login, int age) {
        this.login = login;
        this.age = age;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User user)) return false;
        return age == user.age && Objects.equals(login, user.login);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, age);
    }

    @Override
    public String toString() {
        return "User: " +
                "login='" + login + '\'' +
                ", age=" + age;
    }
}
