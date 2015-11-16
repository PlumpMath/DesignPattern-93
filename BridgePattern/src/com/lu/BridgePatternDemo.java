package com.lu;

public class BridgePatternDemo {
	public static void main(String[] args) {
		Shape shape1 = new Circle(1, 2, 3, new RedCircle());
		Shape shape2 = new Circle(2, 2, 3, new GreenCircle());
		shape1.draw();
		shape2.draw();
	}
}
