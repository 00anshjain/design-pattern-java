package com.designpattern.adapterdesignpattern;

public class GroceryItem implements Grocery {
    private String name;
    private String price;
    private String storeName;
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getPrice() {
        return this.price;
    }

    @Override
    public String getStoreName() {
        return this.storeName;
    }
}
