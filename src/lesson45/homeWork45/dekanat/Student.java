package lesson45.homeWork45.dekanat;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

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


//    public static Map<String, List<Student>> makeListByCourse(List<Student> student ){
//        return  student.stream()
//                .collect(Collectors.groupingBy(Student::getCourse));
//    }
}
