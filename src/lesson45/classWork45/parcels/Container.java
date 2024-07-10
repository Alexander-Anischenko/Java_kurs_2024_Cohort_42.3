package lesson45.classWork45.parcels;

import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;


public class Container implements Iterable<Box>{

    private String label; //маркировка контейнера
    private List<Box> boxes; // опись контейнера

    public Container(String label, int numBoxes) {
        this.label = label;
        Random random = new Random();
        // цикл от 0 до numBox-1, создает новые коробки
        this.boxes = IntStream.range(0, numBoxes)
                .mapToObj(i -> new Box(random.nextInt(5, 11)))
                .toList();// занесли в лист
    }

    public int getTotalParcels() {
        return boxes.stream()
                .mapToInt(box -> box.parcels.size())
                .sum();
    }

    public String getLabel() {
        return label;
    }

    public List<Box> getBoxes() {
        return boxes;
    }

    //добавление коробок в список коробок контейнера
    public boolean addBox(Box box) {
        return boxes.add(box);
    }

    public double weidhtContainer() {
        return boxes.stream()
                .mapToDouble(b -> b.weightBox())
                .sum();
    }

    public int quantity() {
        return boxes.size();
    }

    public int countParcels() {
        return boxes.stream()
                .mapToInt(p -> p.quantity())
                .sum();
    }

    @Override
    public String toString() {
        return "Container label " + label  + ", parcels = " + countParcels() ;
    }

    @Override
    public Iterator<Box> iterator() {
        return boxes.iterator();
    }
}
