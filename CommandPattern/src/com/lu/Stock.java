package com.lu;

public class Stock {
	private String name = "ABC";
	private int quality = 10;
	public void buy() {
		System.out.println("Stock [name=" + name + ", quality=" + quality + "] Bought");
	}
	public void sell() {
		System.out.println("Stock [name=" + name + ", quality=" + quality + "] Sold");
	}
	
}
