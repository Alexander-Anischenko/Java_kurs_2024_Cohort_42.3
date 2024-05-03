package lesson14.homeWork;

public class StudentApp {
    public static void main(String[] args) {
        Student s1 = new Student(01, "Bob", "Jonson", 2002, "Economy");
        Student s2 = new Student(02, "Iwan", "Iwanov", 2003, "Informatics");
        Student s3 = new Student(03, "Jamila", "Ibrahim", 2004, "Medicine");

        s1.displayStudent();
        s1.study();
        s1.takeVacation();
        s1.passTheExam();
        System.out.println();

        s2.displayStudent();
        s2.study();
        s2.takeVacation();
        s2.passTheExam();
        System.out.println();

        s3.displayStudent();
        s3.study();
        s3.takeVacation();
        s3.passTheExam();
    }
}
