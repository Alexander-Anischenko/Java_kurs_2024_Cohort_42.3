package lesson36.homeWork36.shop.dao;

import lesson36.homeWork36.shop.model.Computer;

import java.math.BigInteger;

public interface Shop {

    boolean createComputer(Computer computer);
    Computer findComputer(BigInteger serialNumber);
    Computer updateComputer(String cpu, int ram, int ssd);
    Computer removeComputer(BigInteger serialNumber);
    Computer saleBlackFriday(double sale);
    void printComputer();
    int quantity();
}
