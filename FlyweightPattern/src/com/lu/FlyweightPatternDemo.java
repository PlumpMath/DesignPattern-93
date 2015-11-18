package com.lu;

public class FlyweightPatternDemo {

	public static final String colors[] = { "white", "red", "black", "blue", "green" };

	public static void main(String[] args) {
		for (int i = 0; i < colors.length; i++) {
			Circle circle = (Circle) ShapeFactory.getCircle(colors[i]);
			circle.setRadius(getRandomRadius());
			circle.setX(getRandomX());
			circle.setY(getRandomY());

		}

	}

	private static int getRandomX() {
		return (int) (Math.random() * 100);

	}

	private static int getRandomY() {
		return (int) (Math.random() * 100);

	}

	private static int getRandomRadius() {
		return (int) (Math.random() * colors.length);

	}
}
