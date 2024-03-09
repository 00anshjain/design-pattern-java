package com.designpattern.adapterdesignpattern;

public class FoodItem implements Item{
    private String itemName;
    private String price;
    private String restaurantName;
    @Override
    public String getItemName() {
        return this.itemName;
    }

    @Override
    public String getPrice() {
        return this.price;
    }

    @Override
    public String getRestaurantName() {
        return this.restaurantName;
    }
}
