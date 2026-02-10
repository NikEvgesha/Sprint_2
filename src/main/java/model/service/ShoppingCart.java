package model.service;

import model.Food;

import java.util.Arrays;

public class ShoppingCart {
    private Food[] food;

    public ShoppingCart(Food[] food) {
        this.food = food;
    }

    public double getTotalPrice() {
        double sum = 0;
        for (Food value : food) {
            sum += value.getAmount() * value.getPrice();
        }
        return sum;
    }

    public double getTotalPricewithDiscount() {
        double sum = 0;
        for (Food value : food) {
            double priceWithDiscount = value.getPrice() - value.getPrice() * (0.01 * value.getDiscount());
            sum += value.getAmount() * priceWithDiscount;
        }
        return sum;
    }

    public double getTotalPriceVegetarian() {
        double sum = 0;
        for (Food value : food) {
            if (value.isVegetarian())
                sum += value.getAmount() * value.getPrice();
        }
        return sum;
    }
}
