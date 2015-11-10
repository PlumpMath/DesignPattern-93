package com.lu;

public class FactoryProducer {
	public static AbstractFactory getAbstractFactory(String choice) {
		if (choice.equalsIgnoreCase("shape")) {
			return new ShapeFactory();
		}

		else if (choice.equalsIgnoreCase("color")) {
			return new ColorFactory();
		}
		return null;
	}

}
