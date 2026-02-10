package sprint_2;

import model.Apple;
import model.Food;
import model.Meat;
import model.constants.Colour;
import model.service.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        Food[] food = {
                new Meat(5, 100),
                new Apple(10, 50, Colour.GREEN),
                new Apple(8, 60, Colour.RED)
        };

        ShoppingCart cart = new ShoppingCart(food);

        System.out.println("Общая сумма товаров без скидки: " + cart.getTotalPrice());
        System.out.println("Общая сумма товаров со скидкой: " + cart.getTotalPricewithDiscount());
        System.out.println("Общая сумма вегетерианских продуктов без скидки: " + cart.getTotalPriceVegetarian());
    }
}