package lesson35.homeWork33_34.city_comparable;

import java.util.Objects;

public class City implements Comparable<City>{
    //fields
    private String name;
    private int population;
    private String country;
    private double index;

    //constructor

    public City(String name, int population, String country, double index) {
        this.name = name;
        this.population = population;
        this.country = country;
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getIndex() {
        return index;
    }

    public void setIndex(double index) {
        this.index = index;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", population=" + population +
                ", country='" + country + '\'' +
                ", index=" + index +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof City city)) return false;
        //return Objects.equals(name, city.name) && Objects.equals(country, city.country);
        return this.name.equals(((City) o).name) && this.country.equals(((City) o).country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, country);
    }

    @Override
    public int compareTo(City o) {

        int res = this.name.compareTo(o.name); //compare by name
        if (res != 0) {//если res не равен 0
            return res;// то он нас устраивает и по нему будет происходить сортировка
        } else {
            res = this.population - o.population;// сортировка по population
        }
        return res;
    }
}
