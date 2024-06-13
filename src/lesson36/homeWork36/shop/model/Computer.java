package lesson36.homeWork36.shop.model;

import java.math.BigInteger;
import java.util.Objects;

public abstract class Computer implements Comparable<Computer>{

    // final
    private static final long BARCODE_LENGTH = 20;

    // fields
    private String brand;
    private String cpu;
    private int ram;
    private int ssd;
    private BigInteger serialNumber;
    private double sale;

    public Computer(String brand, String cpu, int ram, int ssd, BigInteger serialNumber, double sale) {
        this.brand = brand;
        this.cpu = cpu;
        this.ram = ram;
        this.ssd = ssd;
        this.serialNumber = checkSerialNumber(serialNumber);
        this.sale = sale;
    }

    public BigInteger getSerialNumber() {
        return serialNumber;
    }

    public double getSale() {
        return sale;
    }

    public void setSale(double sale) {
        this.sale = sale;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getSsd() {
        return ssd;
    }

    public void setSsd(int ssd) {
        this.ssd = ssd;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "brand='" + brand + '\'' +
                ", cpu='" + cpu + '\'' +
                ", ram=" + ram +
                ", ssd=" + ssd +
                ", serialNumber=" + serialNumber +
                ", sale=" + sale +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Computer computer)) return false;
        return ram == computer.ram && ssd == computer.ssd && Double.compare(sale, computer.sale) == 0 && Objects.equals(brand, computer.brand) && Objects.equals(cpu, computer.cpu) && Objects.equals(serialNumber, computer.serialNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, cpu, ram, ssd, serialNumber, sale);
    }

    public abstract BigInteger checkSerialNumber(BigInteger serialNumber);
}
