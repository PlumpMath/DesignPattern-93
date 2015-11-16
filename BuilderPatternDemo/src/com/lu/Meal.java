package com.lu;

import java.util.ArrayList;
import java.util.List;

public class Meal {
	private List<Item> mealItems = new ArrayList<Item>();

	public void addItem(Item item) {
		mealItems.add(item);
	}

	public float getPrice() {
		float price = 0f;
		for (Item item : mealItems) {
			price += item.price();
		}
		return price;
	}

	public void showItems() {
		for (Item item : mealItems) {
			System.out.println("name:" + item.name());
			System.out.println("price:" + item.price());
			System.out.println("packing:" + item.packing().pack());
		}
	}

}
