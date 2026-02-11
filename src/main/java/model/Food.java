package model;

import model.constants.Discount;

public abstract class Food implements Discountable {
    protected int amount;
    protected double price;
    protected boolean isVegetarian;

    public double getPrice() {
        return price;
    }

    public int getAmount() {
        return amount;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

    @Override
    public double getDiscount() {
        return Discount.NO_DISCOUNT;
    }

}
