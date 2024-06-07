package lesson34.classWork34.month;

public enum Month {
    JAN(1, "January", 31), FEB(2, "February", 29), MAR(3, "March", 31), APR(4, "April", 30),
    MAY(5, "May", 31), JUN(6, "June", 30), JUL(7,"July", 31), AUG(8, "August", 31),
    SEP(9, "September", 30), OCT(10, "October", 31), NOV(11, "November", 30), DEC(12, "December", 31);

    //fields
    private int number;
    private String name;
    private int days;

    Month(int number, String name, int days) {
        this.number = number;
        this.name = name;
        this.days = days;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public int getDays() {
        return days;
    }
    //Задайте emun Month, определите месяца, их наименования и количество в них дней.
    //Реализуйте метод, позволяющий прибавлять месяца к выбранному, получая правильный месяц.
    //Пример: AUG + 6 month = FEB

    public Month plusMonth(int quantity) {
        int index = ordinal(); //current mh
        index = index + quantity; //increment month
        Month[] month = values();
        int res = index % month.length;
        return month[res]; // return Month with index res
    }

    @Override
    public String toString() {
        return "Month{" +
                "number= " + number +
                ", name= '" + name + '\'' +
                ", days= " + days +
                '}';
    }
}
