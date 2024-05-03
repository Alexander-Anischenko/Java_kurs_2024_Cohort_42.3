package lesson20.homeWork20.products.model;

import java.math.BigInteger;

public class Computer {

    private static final long BARCODE_LENGTH = 20;

    private String brand;
    private String cpu;
    private int ram;
    private BigInteger serialNumber;

    public Computer(String brand, String cpu, int ram, BigInteger serialNumber) {
        this.brand = brand;
        this.cpu = cpu;
        this.ram = ram;
        //this.serialNumber = BigInteger.valueOf(checkSerialNumber(serialNumber));
        this.serialNumber = checkSerialNumber(serialNumber);

    }

    private BigInteger checkSerialNumber(BigInteger serialNumber) {
        //int a = serialNumber.toString().length();
        if (countDigit(serialNumber) == BARCODE_LENGTH) {
            return serialNumber;
        }
        return BigInteger.valueOf(-1);
    }

    private int countDigit(BigInteger serialNumber) {
        int count = 0;
        do {
            count++;
            serialNumber = serialNumber.divide(BigInteger.TEN);
        } while (serialNumber.compareTo(BigInteger.ZERO) > 0);

        return count;
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

    public BigInteger getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(BigInteger serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Computer computer)) return false;

        return ram == computer.ram && brand.equals(computer.brand) && cpu.equals(computer.cpu) && serialNumber.equals(computer.serialNumber);
    }

    @Override
    public int hashCode() {
        int result = brand.hashCode();
        result = 31 * result + cpu.hashCode();
        result = 31 * result + ram;
        result = 31 * result + serialNumber.hashCode();
        return result;
    }
}
