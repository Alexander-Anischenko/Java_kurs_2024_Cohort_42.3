package lesson14.homeWork;

public class Student {
    private int id;
    private String name;
    private String lastName;
    private int birthYear;
    private String specialization;

    public Student(int id, String name, String lastName, int birthYear, String specialization) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.birthYear = birthYear;
        this.specialization = specialization;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void displayStudent() {
        System.out.println("Student id: " + id + " , name: " + name + " , last name: " + lastName + " , year of birth: " + birthYear + " , specialization: " + specialization);
    }

    public void study() {
        System.out.println(name +" is learning...");
    }
    public void takeVacation() {
        System.out.println (name +" took a leave of absence.");
    }
    public void passTheExam() {
        System.out.println(name + " takes an exam.");
    }
}
