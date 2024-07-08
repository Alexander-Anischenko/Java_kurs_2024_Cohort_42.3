package lesson45.homeWork45.dekanat;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DekanatApp {
    public static void main(String[] args) {


        Student[] student = new Student[10];

        student[0] = new Student( 1, "Alex", "Müller", "19.12.2000", "Mathematics", 1, "Germany", "male" );
        student[1] = new Student( 2, "Anna", "Mayer", "21.11.1999", "Physics", 2, "Germany", "female" );
        student[2] = new Student( 3, "Julia", "Andreeva", "02.04.2001", "Biology", 3, "Russia", "female" );
        student[3] = new Student( 4, "Max", "Schneider", "13.11.2002", "Mathematics", 1, "Austria", "male" );
        student[4] = new Student( 5, "Yaroslav", "Petrenko", "09.12.1998", "Physics", 2, "Ukraine", "male" );
        student[5] = new Student( 6, "Olesia", "Petrenko", "04.10.2002", "Mathematics", 1, "Ukraine", "female" );
        student[6] = new Student( 7, "John", "Smith", "09.06.2003", "Economy", 4, "USA", "male" );
        student[7] = new Student( 9, "Eva", "Johnson", "07.01.2004", "Economy", 4, "USA", "female" );
        student[8] = new Student( 9, "Andrey", "Volkov", "29.11.2002", "Physics", 2, "Russia", "male" );
        student[9] = new Student( 10, "Sophie", "Wagner", "04.02.2001", "Biology", 3, "Austria", "female" );

        List<Student> studentList = new ArrayList<>();
        for (int i = 0; i < student.length; i++) {
            studentList.add(student[i]);
        }
        for (Student s : student) {
            System.out.println(s);
        }


        Map<String, List<Student>> studentByCourse = studentList.stream()
                .collect(Collectors.groupingBy(Student::getCourse));
        studentByCourse.forEach((course, s) -> {
            System.out.println(course  + "=> " + studentList);
        });
    }
}
