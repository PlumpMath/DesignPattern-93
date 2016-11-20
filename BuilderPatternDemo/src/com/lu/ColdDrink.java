package com.lu;

public abstract class ColdDrink implements Item {

	public Packing packing() {
		// TODO Auto-generated method stub
		return new Bottle();
	}

	public abstract float price();

}
