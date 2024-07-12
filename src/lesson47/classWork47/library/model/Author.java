package lesson47.classWork47.library.model;

import java.time.LocalDate;
import java.util.Objects;

public class Author {

    final String name;
    final String lastName;
    final LocalDate birthDay;
    String country;
    double rating;

    public Author(String name, String lastName, LocalDate birthDay, String country, double rating) {
        this.name = name;
        this.lastName = lastName;
        this.birthDay = birthDay;
        this.country = country;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Author author)) return false;
        return Objects.equals(name, author.name) && Objects.equals(lastName, author.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Author{");
        sb.append("name='").append(name).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", birthDay=").append(birthDay);
        sb.append(", country='").append(country).append('\'');
        sb.append(", rating=").append(rating);
        sb.append('}');
        return sb.toString();
    }

    public String displayAuthor(){
        return "Name= " + name + ", lastName= " + lastName + ", birthDay= " + birthDay;
    }

}
