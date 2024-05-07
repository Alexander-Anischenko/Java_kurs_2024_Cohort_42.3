package lesson28.classWork28;

import java.util.Arrays;

public class IntArrayList {

    private static final int INIT_ARRAY_SIZE = 5;
    private int[] data;
    private int count;

    public IntArrayList() {
        this.data = new int[IntArrayList.INIT_ARRAY_SIZE];
        this.count = 0;
    }

    public void add(int value) {
        int index = this.count;
        if (index >= this.data.length) {
            increaseArray();
        }

        this.data[index] = value;
        this.count += 1;

    }

    public int getCount() {
        return count;
    }

    private void increaseArray() {
        double siceOfNeuArray = this.data.length * 1.5;
        int[] newArray = new int[(int) siceOfNeuArray];

        for (int i = 0; i < this.data.length; i++) {
            newArray[i] = this.data[i];
        }
        this.data = newArray;
    }
    public int get(int index) {
        if (index >= this.count) {
            // тригерим ошибку
            return  this.data[-1];

        }
        return this.data[index];
    }
    public int remove(int index) {
        int value = this.get(index);

        for (int i = index + 1; i < this.count; i++) {
            this.data[i - 1] = this.data[i];
        }
        this.count -= 1;

        return  value;
    }
    @Override
    public String toString() {
        return "IntArrayList{data=" + Arrays.toString(this.data) + ", count=" + this.count +"}";
    }
}
