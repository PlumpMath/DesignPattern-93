package com.lu;

public class DecoratorPatternDemo {

	public static void main(String[] args) {
		Shape circle = new Circle();
		RedShapeDecorator redCircleDecorator = new RedShapeDecorator(circle);
		Rectangle rectangle = new Rectangle();
		RedShapeDecorator redRectangle = new RedShapeDecorator(rectangle);

		circle.draw();
		redCircleDecorator.draw();
		rectangle.draw();
		redRectangle.draw();

	}

}
