package lesson42.classWork42.cars.dao;

import lesson42.classWork42.cars.model.Car;

import java.util.ArrayList;
import java.util.List;

public class GarageArrayListImpl implements Garage {

    //fields
    //private Car[] cars;
    private List<Car> cars;
    //private int size;
    private int capacity;

    // constructor гараж шмеет вместимость(capacity)
    public GarageArrayListImpl(int capacity) {
        this.cars = new ArrayList<>(capacity);
        this.capacity = capacity;
    }


    // O(1), O(n)
    @Override
    public boolean addCar(Car car) {
        //если car не существует || разиер массива равен его длинне|| машина с таким RegNumber уже существует
        if (car == null || cars.size() == capacity|| cars.contains(car)) {
            //добавление невозможно
            return false;
        }
        // добавляем машину в массив cars и увеличиваем размер масива на 1
        cars.add(car);
        // машина успешно добавлена
        return true;
    }

    //O(1), O(n)
    @Override
    public Car removeCar(String regNumber) {
        // find dy regNumber
        Car car = findCarByRegNumber(regNumber);
        // remove
        cars.remove(car);
        return car;

//        // используем цикл fori, чтобы оббежать весь массив
//        for (int i = 0; i < size; i++) {
//            // если regNumber равен существующему запоминаем индекс объекта в массиве
//            if (cars[i].getRegNumber().equals(regNumber)) {
//                // присваиваем соответствующему индексу cars[i] значение жертвы
//                Car victim = cars[i];
//                // удаляем этот индекс и переписываем массив заменяя текущий элемент последним элементом, уменьшая его значение на 1
//                cars[i] = cars[--size];
//                // предылущий последний элемент массива удаляем
//                cars[size] = null;
//                // возвращаем удаленный объект
//                return victim;
//            }
//        }
//        //если regNumber не найден, возвращаем null
//        return null;
    }

    //o(n)
    @Override
    public Car findCarByRegNumber(String regNumber) {
        for (Car car : cars) {
            if (car.getRegNumber().equals(regNumber)) {
                return car;
            }
        }
//        // используем цикл fori, чтобы оббежать весь массив
//        for (int i = 0; i < size; i++) {
//            // если regNumber равен существующему запоминаем индекс объекта в массиве
//            if (cars[i].getRegNumber().equals(regNumber)) {
//                // возвращаем совпавший по индексу объект
//                return cars[i];
//            }
//        }
        // если regNumber не найден, возвращаем null
        return null;
    }

    //O(n)
    @Override
    public Car[] findCarByModel(String model) {
        // устанавливаем счетчик на 0
        int count = 0;
        // используем цикл fori, чтобы оббежать весь массив
        for (int i = 0; i < cars.size(); i++) {
            // если model равен существующему запоминаем индекс объекта в массиве
            if (cars.get(i).getModel().equals(model)) {
                // увеличиваем значение счетчика на 1 при каждом совпадении
                count++;
            }
        }
        //создаем новый массив res машин с длинной счетчика
        Car[] res = new Car[count];
        // используем цикл fori, чтобы оббежать весь массив, используем целочисленную j, для копирования индексов массива cars
        for (int i = 0, j = 0; i < cars.size(); i++) {
            // если model равен существующему запоминаем индекс объекта в массиве
            if (cars.get(i).getModel().equals(model)) {
                // копируем объекты из массива cars в массив res по индексам увеличивая его
                res[j++] = cars.get(i);

            }
        }
        // возвращаем массив res
        return res;
    }

    //O(n)
    @Override
    public Car[] findCarByCompany(String company) {
        int count = 0;
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).getCompany().equals(company)) {
                count++;
            }
        }
        Car[] res = new Car[count];
        for (int i = 0, j = 0; i < cars.size(); i++) {
            if (cars.get(i).getCompany().equals(company)) {
                res[j++] = cars.get(i);
            }
        }
        return res;
    }

    //O(n)
    @Override
    public Car[] findCarByEngine(double min, double max) {
        // устанавливаем счетчик на 0
        int count = 0;
        // используем цикл fori, чтобы оббежать весь массив
        for (int i = 0; i < cars.size(); i++) {
            // если значение Engine меньше или равно и больше или равно выставленным значениям запоминаем индекс объекта в массиве
           if (cars.get(i).getEngine() >= min && cars.get(i).getEngine() <= max) {
               // увеличиваем значение счетчика на 1 при каждом совпадении
               count++;
           }
        }
        //создаем новый массив res машин с длинной счетчика
        Car[] res = new Car[count];
        // используем цикл fori, чтобы оббежать весь массив, используем целочисленную j, для копирования индексов массива cars
        for (int i = 0, j = 0; i < cars.size(); i++) {
            // если значение Engine меньше или равно и больше или равно выставленным значениям запоминаем индекс объекта в массиве
            if (cars.get(i).getEngine() >= min && cars.get(i).getEngine() <= max) {
                // копируем объекты из массива cars в массив res по индексам и увеличиваем его на 1 значение при каждом совпадении
                res[j++] = cars.get(i);
            }
        }
        // возвращаем массив res
        return res;
    }

    //O(n)
    @Override
    public Car[] findCarByColor(String color) {
        int count = 0;
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).getColor().equals(color)) {
                count++;
            }
        }
        Car[] res = new Car[count];
        for (int i = 0, j = 0; i < cars.size(); i++) {
            if (cars.get(i).getColor().equals(color)) {
                res[j++] = cars.get(i);
            }
        }
        return res;
    }

    @Override
    public int quantity() {
        return cars.size();
    }
}
