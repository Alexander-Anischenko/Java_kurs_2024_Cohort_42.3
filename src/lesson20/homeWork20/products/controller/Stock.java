package lesson20.homeWork20.products.controller;

import lesson20.homeWork20.products.model.Computer;

import java.math.BigInteger;
import java.util.Objects;

public class Stock {

    // fields
    // array computers
    private Computer[] computers;

    // number of computers
    private int size;

    public Stock(int capacity) {
        this.computers = new Computer[capacity];
        this.size = 0;
    }

    //methods

    // addComputer
    public boolean addComputer(Computer computer) {
        if (computer == null || size == computers.length || findComputer(computer.getSerialNumber()) != null) {
            return false;
        }
        computers[size] = computer;
        size++;
        return true;
    }

    // findComputer
    public Computer findComputer(BigInteger serialNumber) {
        for (int i = 0; i < size; i++) {
            if (computers[i].getSerialNumber().equals(serialNumber)) {
                return computers[i];
            }
        }
        return null;
    }

    // removeComputer
    public Computer removeComputer(BigInteger serialNumber) {
        Computer victim = null; // жертва: тот компьютер, который нужно списать
        for (int i = 0; i < size; i++) {
            if (Objects.equals(computers[i].getSerialNumber(), serialNumber)) {
                victim = computers[i];
                computers[i] = computers[size - 1];
                computers[size - 1] = null;
                size--;
                break;
            }
        }
        return victim;
    }
    // printComputers
    public void printComputers() {
        for (int i = 0; i < size; i++) {
            System.out.println(computers[i]);
        }
        System.out.println("=================================================");
    }


    // получение количества компьютеров в библиотеке
    public int getSize() {
        return size;
    }
}
