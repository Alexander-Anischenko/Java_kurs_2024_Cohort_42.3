package lesson47.classWork47.write_read_file;

import java.io.Serializable;
import java.util.Objects;

public class Adderss implements Serializable {

    String city;
    String postCode;
    String street;
    int buildingNum;
    int apartment;

    public Adderss(String city, String postCode, String street, int buildingNum, int apartment) {
        this.city = city;
        this.postCode = postCode;
        this.street = street;
        this.buildingNum = buildingNum;
        this.apartment = apartment;
    }

    public String getCity() {
        return city;
    }

    public String getPostCode() {
        return postCode;
    }

    public String getStreet() {
        return street;
    }

    public int getBuildingNum() {
        return buildingNum;
    }

    public int getApartment() {
        return apartment;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Adderss{");
        sb.append("city='").append(city).append('\'');
        sb.append(", postCode='").append(postCode).append('\'');
        sb.append(", street='").append(street).append('\'');
        sb.append(", buildingNum=").append(buildingNum);
        sb.append(", apartment=").append(apartment);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Adderss adderss)) return false;
        return buildingNum == adderss.buildingNum && apartment == adderss.apartment && Objects.equals(postCode, adderss.postCode) && Objects.equals(street, adderss.street);
    }

    @Override
    public int hashCode() {
        return Objects.hash(postCode, street, buildingNum, apartment);
    }
}
