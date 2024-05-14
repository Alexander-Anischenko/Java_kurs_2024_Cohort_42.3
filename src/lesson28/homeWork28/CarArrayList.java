package lesson28.homeWork28;

public class CarArrayList implements ArrayList{

    private static final int INIT_ARRAY_SIZE = 3;
    private static final double SIZE_INCREMENT = 1.5;
    private Car[] data;
    private int count;

    public CarArrayList() {
        this.data = new Car[INIT_ARRAY_SIZE];
        this.count = 0;
    }

    @Override
    public void add(Car value) {
        if (this.count == this.data.length) {
            Car[] neuData = new Car[(int) (this.data.length * SIZE_INCREMENT)];
            for (int i = 0; i < this.data.length; i++) {
                neuData[i] = data[i];

            }
            data = neuData;
        }
        data[this.count] = value;
        this.count++;
    }

    @Override
    public Car get(int index) {
        if (index >= this.count) {
            return  this.data[-1];
        }
        return this.data[index];
    }

    @Override
    public Car remove(int index) {
        Car value = this.get(index);

        for (int i = index + 1; i < this.count; i++) {
            this.data[i - 1] = this.data[i];
        }
        this.count -= 1;

        return  value;
    }
}
