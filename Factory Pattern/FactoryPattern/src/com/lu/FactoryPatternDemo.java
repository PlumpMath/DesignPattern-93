package com.lu;

/**
 * 工厂模式
 * 
 * @author Administrator
 *
 */
public class FactoryPatternDemo {
	public static void main(String[] args) {
		ShapeFactory factory = new ShapeFactory();
		Shape circle = factory.getShape("circle");
		circle.draw();
		Shape rectangle = factory.getShape("Rectangle");
		rectangle.draw();
		Shape square = factory.getShape("square");
		square.draw();
		Shape shape = factory.getShape("ee");
		shape.draw();

	}
}
