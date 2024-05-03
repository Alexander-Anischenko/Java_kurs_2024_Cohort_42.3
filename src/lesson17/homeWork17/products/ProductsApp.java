package lesson17.homeWork17.products;

/* В методе main создать массив в котором хранятся по одному объекту для каждого продукта.
Создать метод печатающий все продукты из массива, и метод возвращающий сумму цен всех продуктов.*/

import lesson17.homeWork17.products.model.Food;
import lesson17.homeWork17.products.model.MeatFood;
import lesson17.homeWork17.products.model.MilkFood;
import lesson17.homeWork17.products.model.Product;

public class ProductsApp {
    public static void main(String[] args) {
        Product[] prod = new Product[4];
        prod[0] = new Product(1.49, "Baking paper", 9414647030619l);
        prod[1] = new Food(0.69, "Ciabatta", 8008698010259l, "2024-04-06");
        prod[2] = new MeatFood(6.29, "Corn poularde", 2814953012618l, "2024-04-07", "Chicken");
        prod[3] = new MilkFood(1.29, "Weihestephan", 4008452027602l, "2024-05-28", "Long-life milk", 3.5);

        printArray(prod);
        System.out.println();

        double sumOfPrice = getTotalSum(prod);
        System.out.println("Sum of price is: " + sumOfPrice);
        System.out.println();

        /* В классе ProductsAppl создать метод печатающий в консоль все не пищевые продукты.
        В классе ProductsAppl создать метод принимающий баркод и возвращающий продукт с данным баркодом.
        В методе main вызвать новые методы. Результат их работы напечатать в консоль.*/

        System.out.println("All non-food products");
        printAllNonFoodProducts(prod);
        System.out.println();
        // Решил проверить обратное
        System.out.println("All food products");
        printAllFoodProducts(prod);
        System.out.println();

        Product product = printProductWithSelectedBarcode(prod, 2814953012618l);
        System.out.println("Product with selected barcode is " + product);
        System.out.println();

        /* MarketAppl на базе прошлого домашнего задания: реализуйте метод, который печатает только продукты, имеющие срок годности.
        Метод должен выводить на печать имя продукта, баркод и дату.*/

        System.out.println("Product with expiration date");
        printProductWithExpDate(prod);



    }

    private static void printProductWithExpDate(Product[] prod) {
        Food food = null;
        for (int i = 0; i < prod.length; i++) {
            if (prod[i] instanceof Food) {
                food = (Food) prod[i];
                System.out.println(" " + food.getName() + " " + food.getBarCode() + " " + food.getExpDate());
            }
        }
    }

    private static Product printProductWithSelectedBarcode(Product[] prod, long barCode) {
        for (int i = 0; i < prod.length; i++) {
            if (prod[i].getBarCode() == barCode) {
                return prod[i];
            }
        }
        return null;
    }


    private static void printAllNonFoodProducts(Product[] prod) {
        for (int i = 0; i < prod.length; i++) {
            if (!(prod[i] instanceof Food)) {
                System.out.println(prod[i]);
            }
        }
    }

    private static void printAllFoodProducts(Product[] prod) {
        for (int i = 0; i < prod.length; i++) {
            if (prod[i] instanceof Food) { // instance: пример, экземпляр, случай (сравнение)
                System.out.println(prod[i]);
            }
        }
    }

    private static double getTotalSum(Product[] prod) {
        double sum = 0;
        for (int i = 0; i < prod.length; i++) {
            sum += prod[i].getPrice();
        }
        return sum;
    }

    private static void printArray(Product[] prod) {
        for (int i = 0; i < prod.length; i++) {
            System.out.println(prod[i].toString());
        }
    }
}
