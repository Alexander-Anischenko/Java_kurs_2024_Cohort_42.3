package lesson37.homeWork37.archive.model;
//      - добавить документ (запрос id документа, id папки, названия документа, url, присвоение текущей даты и времени)
//        - показать список всех документов в архиве
//        - узнать количество хранимых документов в архиве
//        - выход

public enum Menu {
    ADD(1, "Add document"), LIST(2, "List ofvdocuments"), QUANTITY(3, "Quantity"), EXIT(4, "Exit");

    // fields
    private int menuItem;
    private String action;

    // constructor
    Menu(int menuItem, String action) {
        this.menuItem = menuItem;
        this.action = action;
    }

    public static void printMenu() {
        Menu[] menu = Menu.values(); // put enum items into array поместить элементы перечисления в массив
        for (int i = 0; i < menu.length; i++) {
            System.out.println((menu[i].menuItem) + " - " + menu[i].action + " | ");
        }
        System.out.println(); // new line
    }
}
