package com.lu;

public class ShapeFactory {
	public Shape getShape(String name) {

		if (name.equalsIgnoreCase("circle"))// 圆形
		{
			return new Circle();
		} else if (name.equalsIgnoreCase("rectangle"))// 长方形
		{
			return new Rectangle();
		} else if (name.equalsIgnoreCase("square")) // 正方形
		{
			return new Square();
		}
		return null;

	}

}
