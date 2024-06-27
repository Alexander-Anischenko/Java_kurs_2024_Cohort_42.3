package lesson41.homeWork41.cars.dao;

import lesson41.homeWork41.cars.model.Car;

public class GarageImpl implements Garage{

    //fields
    private Car[] cars;
    private int size;

    // constructor гараж шмеет вместимость(capacity)
    public GarageImpl(int capacity) {
        this.cars = new Car[capacity];
    }

    @Override
    public boolean addCar(Car car) {
        //если car не существует || разиер массива равен его длинне|| машина с таким RegNumber уже существует
        if (car == null || size == cars.length || findCarByRegNumber(car.getRegNumber()) != null) {
            //д обавление невозможно
            return false;
        }
        // добавляем машину в массив cars и увеличиваем размер масива на 1
        cars[size++] = car;
        // машина успешно добавлена
        return true;
    }

    @Override
    public Car removeCar(String regNumber) {
        // используем цикл fori, чтобы оббежать весь массив
        for (int i = 0; i < size; i++) {
            // если regNumber равен существующему запоминаем индекс объекта в массиве
            if (cars[i].getRegNumber() == regNumber) {
                // присваиваем соответствующему индексу cars[i] значение жертвы
                Car victim = cars[i];
                // удаляем этот индекс и переписываем массив заменяя текущий элемент последним элементом, уменьшая его значение на 1
                cars[i] = cars[--size];
                // предылущий последний элемент массива удаляем
                cars[size] = null;
                // возвращаем удаленный объект
                return victim;
            }
        }
        //если regNumber не найден, возвращаем null
        return null;
    }

    @Override
    public Car findCarByRegNumber(String regNumber) {
        // используем цикл fori, чтобы оббежать весь массив
        for (int i = 0; i < size; i++) {
            // если regNumber равен существующему запоминаем индекс объекта в массиве
            if (cars[i].getRegNumber() == regNumber) {
                // возвращаем совпавший по индексу объект
                return cars[i];
            }
        }
        // если regNumber не найден, возвращаем null
        return null;
    }

    @Override
    public Car[] findCarByModel(String model) {
        // устанавливаем счетчик на 0
        int count = 0;
        // используем цикл fori, чтобы оббежать весь массив
        for (int i = 0; i < size; i++) {
            // если model равен существующему запоминаем индекс объекта в массиве
            if (cars[i].getModel() == model) {
                // увеличиваем значение счетчика на 1 при каждом совпадении
                count++;
            }
        }
        //создаем новый массив res машин с длинной счетчика
        Car[] res = new Car[count];
        // используем цикл fori, чтобы оббежать весь массив, используем целочисленную j, для копирования индексов массива cars
        for (int i = 0, j = 0; i < res.length; i++) {
            // если model равен существующему запоминаем индекс объекта в массиве
            if (cars[i].getModel() == model) {
                // копируем объекты из массива cars в массив res по индексам
                res[j] = cars[i];
            }
        }
        // возвращаем массив res
        return res;
    }

    @Override
    public Car[] findCarByCompany(String company) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (cars[i].getCompany() == company) {
                count++;
            }
        }
        Car[] res = new Car[count];
        for (int i = 0, j = 0; i < res.length; i++) {
            if (cars[i].getCompany() == company) {
                res[j] = cars[i];
            }
        }
        return res;
    }

    @Override
    public Car[] findCarByEngine(double min, double max) {
        // устанавливаем счетчик на 0
        int count = 0;
        // используем цикл fori, чтобы оббежать весь массив
        for (int i = 0; i < size; i++) {
            // если значение Engine меньше или равно и больше или равно выставленным значениям запоминаем индекс объекта в массиве
           if (cars[i].getEngine() >= min && cars[i].getEngine() <= max) {
               // увеличиваем значение счетчика на 1 при каждом совпадении
               count++;
           }
        }
        //создаем новый массив res машин с длинной счетчика
        Car[] res = new Car[count];
        // используем цикл fori, чтобы оббежать весь массив, используем целочисленную j, для копирования индексов массива cars
        for (int i = 0, j = 0; i < size; i++) {
            // если значение Engine меньше или равно и больше или равно выставленным значениям запоминаем индекс объекта в массиве
            if (cars[i].getEngine() >= min && cars[i].getEngine() <= max) {
                // копируем объекты из массива cars в массив res по индексам и увеличиваем его на 1 значение при каждом совпадении
                res[j++] = cars[i];
            }
        }
        // возвращаем массив res
        return res;
    }

    @Override
    public Car[] findCarByColor(String color) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (cars[i].getColor() == color) {
                count++;
            }
        }
        Car[] res = new Car[count];
        for (int i = 0, j = 0; i < res.length; i++) {
            if (cars[i].getColor() == color) {
                res[j] = cars[i];
            }
        }
        return res;
    }
}
