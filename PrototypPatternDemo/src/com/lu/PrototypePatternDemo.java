package com.lu;

public class PrototypePatternDemo {
	public static void main(String[] args) {
		ShapeCache.loadCache();
		Shape shape1 = ShapeCache.getShape("1");
		System.out.println("shape1:" + shape1.getType());
		Shape shape2 = ShapeCache.getShape("2");
		System.out.println("shape2:" + shape2.getType());
		Shape shape3 = ShapeCache.getShape("3");
		System.out.println("shape3:" + shape3.getType());
	}
}
