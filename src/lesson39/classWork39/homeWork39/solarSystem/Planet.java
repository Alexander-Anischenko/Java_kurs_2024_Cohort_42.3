package lesson39.classWork39.homeWork39.solarSystem;
/*  Enter the planets of the solar system into a list containing:

Name;
distance to the Sun;
mass;
number of satellites.*/

import java.util.Objects;

public class Planet implements Comparable<Planet>{

    // fields
    private String name; //of planet
    private double distanceToSon; //million km
    private long massQuadTon; // quadrillion tonnes
    private int satNumber;

    //constr.
    public Planet(String name, double distanceToSon, long massQuadTon, int satNumber) {
        this.name = name;
        this.distanceToSon = distanceToSon;
        this.massQuadTon = massQuadTon;
        this.satNumber = satNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDistanceToSon() {
        return distanceToSon;
    }

    public void setDistanceToSon(double distanceToSon) {
        this.distanceToSon = distanceToSon;
    }

    public long getMassQuadTon() {
        return massQuadTon;
    }

    public void setMassQuadTon(long massQuadTon) {
        this.massQuadTon = massQuadTon;
    }

    public int getSatNumber() {
        return satNumber;
    }

    public void setSatNumber(int satNumber) {
        this.satNumber = satNumber;
    }

    @Override
    public String toString() {
        return "Planet{" +
                "name= '" + name + '\'' +
                ", distanceToSon million km= " + distanceToSon +
                ", massQuadTon= " + massQuadTon +
                ", satNumber= " + satNumber +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Planet planet)) return false;
        return Double.compare(distanceToSon, planet.distanceToSon) == 0 && Objects.equals(name, planet.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, distanceToSon);
    }

    @Override
    public int compareTo(Planet o) {
        int res = Double.compare(this.distanceToSon, o.distanceToSon);
        return res;
    }
}
