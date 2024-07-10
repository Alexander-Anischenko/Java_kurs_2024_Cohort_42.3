package lesson45.homeWork45.dekanat;

import java.util.ArrayList;
import java.util.Comparator;
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
        student[7] = new Student( 8, "Eva", "Johnson", "07.01.2004", "Economy", 4, "USA", "female" );
        student[8] = new Student( 9, "Andrey", "Volkov", "29.11.2002", "Physics", 2, "Russia", "male" );
        student[9] = new Student( 10, "Sophie", "Wagner", "04.02.2001", "Biology", 3, "Austria", "female" );

        List<Student> studentList = new ArrayList<>();
        for (int i = 0; i < student.length; i++) {
            // положили объекты student в список типа ArrayList put student objects into a list of ArrayList type
            studentList.add(student[i]);
        }

        for (Student s : student) {
            System.out.println(s);
        }
        System.out.println("<======================== List as is ========================>");
        System.out.println();
        System.out.println("<================================================>");


        //сначала делаем список по курсам
        System.out.println("<======================== List by course ========================>");
        Map<String, List<Student>> studentsByCourse = studentList.stream()
                .collect(Collectors.groupingBy(Student::getCourse));
        // потом выводим список студентов по курсам
        studentsByCourse.forEach((course, students) -> {
            System.out.println("Students on the course " + course);
            students.forEach(System.out::println);
            System.out.println("<================================================>");
        });

        System.out.println("<======================== List by group ========================>");
        // список по группам
        Map<Integer, List<Student>> studentByGroup = studentList.stream()
                .collect(Collectors.groupingBy(Student::getGroupNum));
        //вывод списка по группам
        studentByGroup.forEach((group, students)-> {
            System.out.println("Students in a group " + group);
            students.forEach(System.out::println);
            System.out.println("<================================================>");
        });


        // Сортировка списка студентов только по фамилии
        System.out.println("<======================== Sorted by lastname ========================>");
        List<Student> sortedByLastName = studentList.stream()
                .sorted(Comparator
                        .comparing(Student::getLastName))
                        .toList();

        // Вывод отсортированного списка студентов только по фамилии
        sortedByLastName.forEach(System.out::println);
        System.out.println("<================================================>");

        // Сортировка списка студентов по дате рождения
        System.out.println("<======================== Sorted by birth date ========================>");
        List<Student>  sortedByBirthDate = studentList.stream()
                .sorted(Student.birthdayComparator)
                .collect(Collectors.toList());
        sortedByBirthDate.forEach(System.out::println);
        System.out.println("<================================================>");

        // Средний возраст для всех студентов
        System.out.println("<======================== Average age for all students ========================>");
        double averageAgeAllStudents = studentList.stream()
                .mapToDouble(Student::getAge)
                .average()
                .orElse(0.0);
        System.out.println("Average age for all students: " + averageAgeAllStudents);

        // Средний возраст по курсу
        System.out.println("<======================== Average age by course ========================>");
        Map<String, Double> averageAgeByCourse = studentList.stream()
                // собираем мап, где ключ представлен курсом студентов, а значение средний возрастом всех студентов этого курса
                .collect(Collectors.groupingBy(Student::getCourse, Collectors.averagingDouble(Student::getAge)));
        //вывод
        System.out.println("Average age by course " + averageAgeByCourse);
        System.out.println("<================================================>");

        // Сортировка списка студентов по фамилии и возрасту
        System.out.println("<======================== Sorting the list of students by last name and age ========================>");
        List<Student> sortedByLastNameAndAge = studentList.stream()
                .sorted(Comparator.comparing(Student::getLastName)
                        .thenComparing(Student::getAge))
                .toList();
        //Вывод списка
        sortedByLastNameAndAge.forEach(System.out::println);
        System.out.println("<================================================>");

        // Сортировка студентов по странам
        System.out.println("<======================== Sorting students by country ========================>");
        List<Student> sortedByCountry = studentList.stream()
                .sorted(Comparator.comparing(Student::getCountry))
                .toList();
        sortedByCountry.forEach(System.out::println);
        System.out.println("<================================================>");

        // Сколько студентов мужчин и женщин
        System.out.println("<======================== How many male and female students ========================>");
        countGender(studentList);
    }

    private static void countGender(List<Student> students) {
        long maleCount = students.stream()
                .filter(studentList -> studentList.getGender().equalsIgnoreCase("male"))
                .count();
        long femaleCountn = students.stream()
                .filter(student ->student.getGender().equalsIgnoreCase("female"))
                .count();
        System.out.println("Number of male: " + maleCount);
        System.out.println("Number of female: " + femaleCountn);

    }
}
