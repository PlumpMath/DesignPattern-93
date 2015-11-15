package com.lu;

public class ShapeFactory extends AbstractFactory {

	@Override
	Color getColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	Shape getShape(String shape) {
		if (shape.equalsIgnoreCase("circle"))// 圆形
		{
			return new Circle();
		} else if (shape.equalsIgnoreCase("rectangle"))// 长方形
		{
			return new Rectangle();
		} else if (shape.equalsIgnoreCase("square")) // 正方形
		{
			return new Square();
		}
		return null;
	}

}
