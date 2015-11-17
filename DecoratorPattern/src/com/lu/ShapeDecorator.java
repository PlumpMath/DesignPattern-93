package com.lu;

public abstract class ShapeDecorator implements Shape {
	Shape decoratorShape;
	public ShapeDecorator(Shape decoratorShape) {
		this.decoratorShape=decoratorShape;
	}
	public void draw(){
		decoratorShape.draw();
	}

}
