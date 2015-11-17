package com.lu;

public class RedShapeDecorator extends ShapeDecorator {

	public RedShapeDecorator(Shape decoratorShape) {
		super(decoratorShape);
	}

	public void draw() {
		decoratorShape.draw();
		setRedBorder();
	}

	public void setRedBorder() {
		System.out.println("border red");
	}

}
