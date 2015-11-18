package com.lu;

import java.io.BufferedWriter;
import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {
	private static final HashMap<String, Shape> MAP=new HashMap<String,Shape>();
	 public static Shape getCircle(String color) {
		 
		 Circle circle=(Circle) MAP.get(color);
		 if(circle==null)
		 {
			 circle=new Circle(color);
			 MAP.put(color, circle);
			 System.out.println("create circle of color "+color);
		 }
		 
		 
		return circle;
		
	}
	
	
}
