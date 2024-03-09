package com.designpattern.adapterdesignpattern;

import java.util.ArrayList;
import java.util.List;

public class SwiggyCart {
    List<Item> cart = new ArrayList<>();

    public void addItem(Item item) {
        cart.add(item);
    }
}
