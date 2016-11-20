package com.lu;

public class GreenCircle implements DrawAPI {

	public void draw(int radius, int x, int y) {
		System.out.println("Drawing Circle[ color: green, radius: " + radius + ", x: " + x + ", " + y + "]");
	}

}
