package lesson42.classWork42.cars.dao;

import lesson42.classWork42.cars.model.Car;

import java.util.*;

public class GarageHashSetImpl implements Garage {

    Comparator<Car> carComparator = new Comparator<Car>() {
        @Override
        public int compare(Car o1, Car o2) {
            return o1.getRegNumber().compareTo(o2.getRegNumber());
        }
    };

    //fields

    private Set<Car> cars;

    private int capacity;

    // constructor гараж шмеет вместимость(capacity)
    public GarageHashSetImpl(int capacity) {
        this.cars = new HashSet<>();
        this.capacity = capacity;
    }


    // O(1)
    @Override
    public boolean addCar(Car car) {
        //если car не существует || разиер массива равен его длинне|| машина с таким RegNumber уже существует
        if (car == null || cars.size() == capacity) {
            //добавление невозможно
            return false;
        }

        // добавляем машину в массив cars и увеличиваем размер масива на 1
        if (cars.add(car)) {
            // машина успешно добавлена
            return true;
        } else {
            return false;
        }
    }

    //O(1)
    @Override
    public Car removeCar(String regNumber) {
        // find dy regNumber
        Car car = findCarByRegNumber(regNumber);
        // remove
        cars.remove(car);
        return car;
    }

    //o(1)
    @Override
    public Car findCarByRegNumber(String regNumber) {
        for (Car car : cars) {
            if (car.getRegNumber().equals(regNumber)) {
                return car;
            }
        }
        // если regNumber не найден, возвращаем null
        return null;
    }

    //O(n)
    @Override
    public Car[] findCarByModel(String model) {
        List<Car> tempList = new ArrayList<>();
        for (Car car : cars) {
            if (car.getModel().equals(model)) {
                tempList.add(car);
            }
        }

        tempList.sort(carComparator);
        //Collections.sort(tempList);
        // одно и то-же только компактней
        return tempList.toArray(Car[]::new);
        //Оба подхода имеют одинаковую временную сложность O(n), так как оба требуют одного и того же количества операций по созданию и копированию элементов.
        //
        //Однако, в некоторых случаях использование toArray(Car[]::new) может быть немного более производительным благодаря оптимизациям внутри библиотеки Java,
        // которые могут использовать специализированные механизмы для копирования массивов.
        //
        //Кроме того, использование toArray(Car[]::new) делает код более читаемым и компактным, что облегчает его поддержку и снижает вероятность ошибок,
        // хотя это и не связано напрямую с производительностью.
//        Car[] res = new Car[tempList.size()];
//        for (int i = 0; i < tempList.size(); i++) {
//            res[i] = tempList.get(i);
//        }
//        // возвращаем массив res
//        return res;

    }

    //O(n)
    @Override
    public Car[] findCarByCompany(String company) {
        List<Car> tempList = new ArrayList<>();
        for (Car car : cars) {
            if (car.getCompany().equals(company)) {
                tempList.add(car);
            }
        }

        tempList.sort(carComparator);
        //Collections.sort(tempList);
        return tempList.toArray(Car[]::new);
//        Car[] res = new Car[tempList.size()];
//        for (int i = 0; i < tempList.size(); i++) {
//            res[i] = tempList.get(i);
//        }
//        // возвращаем массив res
//        return res;
    }

    //O(n)
    @Override
    public Car[] findCarByEngine(double min, double max) {
        List<Car> tempList = new ArrayList<>();
        for (Car car : cars) {
            if (car.getEngine() >= min && car.getEngine() <= max) {
                tempList.add(car);
            }
        }
        Collections.sort(tempList);
        return tempList.toArray(Car[]::new);
    }

    //O(n)
    @Override
    public Car[] findCarByColor(String color) {
        List<Car> tempList = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals(color)) {
                tempList.add(car);
            }
        }
        tempList.sort(carComparator);
        // возвращаем массив res
        return tempList.toArray(Car[]::new);
    }

    @Override
    public int quantity() {
        return cars.size();
    }
}
