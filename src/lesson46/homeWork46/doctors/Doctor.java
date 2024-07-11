package lesson46.homeWork46.doctors;

import java.util.Arrays;

public class Doctor {

    //fields
    private String name;
    private String[] specialties;

    public Doctor(String name, String... specialties) {
        this.name = name;
        this.specialties = specialties;
    }

    public String getName() {
        return name;
    }

    public String[] getSpecialties() {
        return specialties;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Doctor: ");
        sb.append("name='").append(name).append('\'');
        sb.append(", specialties=").append(specialties == null ? "null" : Arrays.asList(specialties).toString());
        sb.append(' ');
        return sb.toString();
    }
}
