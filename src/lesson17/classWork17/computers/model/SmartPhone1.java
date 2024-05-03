package lesson17.classWork17.computers.model;

public class SmartPhone1 extends Laptop1{

    private String OperationSystem;
    private boolean isSimCard;

    public SmartPhone1(String cpu, int ram, int ssd, String brand, double price, double displaySize, double weight, int batteryCapacity, String operationSystem, boolean isSimCard) {
        super(cpu, ram, ssd, brand, price, displaySize, weight, batteryCapacity);
        OperationSystem = operationSystem;
        this.isSimCard = isSimCard;
    }

    public String getOperationSystem() {
        return OperationSystem;
    }

    public void setOperationSystem(String operationSystem) {
        OperationSystem = operationSystem;
    }

    public boolean isSimCard() {
        return isSimCard;
    }

    public void setSimCard(boolean simCard) {
        isSimCard = simCard;
    }

    @Override
    public String toString() {
        return super.toString() + "SmartPhone{" +
                "OperationSystem='" + OperationSystem + '\'' +
                ", isSimCard=" + isSimCard +
                '}';
    }
}
