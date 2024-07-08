package lesson45.classWork45.parcels;

import java.util.Iterator;
import java.util.Objects;

public class Parcel {
    private double weigt;

    public Parcel(double weigt) {
        this.weigt = weigt;
    }

    public double getWeigt() {
        return weigt;
    }

    public void setWeigt(double weigt) {
        this.weigt = weigt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Parcel parcel)) return false;
        return Double.compare(weigt, parcel.weigt) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(weigt);
    }

    @Override
    public String toString() {
        return "Parcel" +
                "weigt=" + weigt +
                ' ';
    }

}
