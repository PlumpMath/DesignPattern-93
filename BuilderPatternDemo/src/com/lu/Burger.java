package com.lu;

public abstract class Burger implements Item {

	public Packing packing() {
		// TODO Auto-generated method stub
		return new Wrapper();
	}

	public abstract float price();

}
