package com.lu;

public class BuilderPatternDemo {

	public static void main(String[] args) {

		MealBuilder builder = new MealBuilder();
		Meal vegMeal = builder.prepareVegMeal();

		System.out.println("VegMeal");
		vegMeal.showItems();
		System.out.println("total Price---" + vegMeal.getPrice());
		Meal noVegMeal = builder.prepareNoVegMeal();
		System.out.println("\nnoVegMeal");
		noVegMeal.showItems();
		System.out.println("total Price---" + noVegMeal.getPrice());
	}
}
