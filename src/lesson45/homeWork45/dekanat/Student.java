package lesson45.homeWork45.dekanat;

import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class Student implements Comparable<Student>{

    //fields
    private int id;
    private String firstName;
    private String lastName;
    private String birtDay;
    private String course;
    private int groupNum;
    private String country;
    private String gender;
    //private int[] marks;

    public Student(int id, String firstName, String lastName, String birtDay, String course, int groupNum, String country, String gender) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birtDay = birtDay;
        this.course = course;
        this.groupNum = groupNum;
        this.country = country;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getBirtDay() {
        return birtDay;
    }

    public String getCourse() {
        return course;
    }

    public int getGroupNum() {
        return groupNum;
    }

    public String getCountry() {
        return country;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Student: " +
                "id=" + id +
                ", firstName= '" + firstName + '\'' +
                ", lastName= '" + lastName + '\'' +
                ", birtDay= " + birtDay +
                ", course= '" + course + '\'' +
                ", groupNum= " + groupNum +
                ", country= '" + country + '\'' +
                ", gender= " + gender +
                ' ';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return id == student.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(id, o.id);
    }

    // сравнивает дни рождения в типе LocalDate compares birthdays in the LocalDate type
    public static Comparator<Student> birthdayComparator = (s1, s2) -> {
        // используем DateTimeFormatter, чтобы форматировать строку в европейском формате use DateTimeFormatter to format the string in European format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("[dd.MM.yyyy][dd/MM/yyy][dd-MM-yyy]");
        // делаем 2 объекта LocalDate с помощью метода parse, где в аргументах используем метод getBirtDay, который возвращает строку birtDay и formatter, возвращающий строку в нужном формате
        // make 2 LocalDate objects using the parse method, where in arguments we use the getBirtDay method,
        // which returns the string birtDay and formatter, returning the string in the required format
        LocalDate birtDate1 = LocalDate.parse(s1.getBirtDay(), formatter);
        LocalDate birtDate2 = LocalDate.parse(s2.getBirtDay(), formatter);
        // сравниваем 2 объекта
        return birtDate1.compareTo(birtDate2);
    };

    public int getAge() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("[dd.MM.yyyy][dd/MM/yyy][dd-MM-yyy]");
        // переносим форматированную строку даты рождения в объект типа LocalDate с помощью метода parse
        // transfer the formatted string of the date of birth into an object of type LocalDate using the parse method
        LocalDate birtDate = LocalDate.parse(birtDay, formatter);
        // создаем объект типа LocalDate, с нынешней датой, с помощью метода now
        LocalDate currentDate = LocalDate.now();
        // вычисление возраста в годах age calculation
        //метод возвращает переменную типа long
        long years = ChronoUnit.YEARS.between(birtDate, currentDate);
        // long приводится к типу int, потому-что (к сожалению) тип long слишком велик для обозначения возраста человека
        // long is converted to int type, because (unfortunately) long type is too large to represent a person's age.
        return (int) years;
    }
}
