package com.designpattern.adapterdesignpattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AdapterDesignPatternApplication {

	public static void main(String[] args) {

		SwiggyCart cart = new SwiggyCart();
		cart.addItem(new FoodItem());
		cart.addItem(new FoodItem());
		cart.addItem(new GroceryItemAdapter(new GroceryItem()));

		SpringApplication.run(AdapterDesignPatternApplication.class, args);
	}

}
