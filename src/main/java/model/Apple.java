package model;

import model.constants.Discount;

public class Apple extends Food{
    private final String colour;

    public Apple(int amount, double price, String colour) {
        this.amount = amount;
        this.price = price;
        this.colour = colour;
        this.isVegetarian = true;
    }

    @Override
    public double getDiscount() {
        return colour.equals("red") ? Discount.DISCOUNT_60 : Discount.DISCOUNT_0;
    }
}
