package com.lu;

public class RealImage implements Image {
	private String fileName;

	public RealImage(String fileName) {
		super();
		this.fileName = fileName;
	}

	@Override
	public void display() {
		System.out.println("displaying" + fileName);
	}

	public void loadFromDisk() {
		System.out.println("Loading " + fileName);

	}

}
