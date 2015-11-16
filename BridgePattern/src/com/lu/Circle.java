package com.lu;

public class Circle extends Shape {
	private int radius, x, y;

	public Circle(int radius, int x, int y, DrawAPI api) {
		super(api);
		this.radius = radius;
		this.x = x;
		this.y = y;
	}

	@Override
	public void draw() {
		drawAPI.draw(radius, x, y);
	}

}
