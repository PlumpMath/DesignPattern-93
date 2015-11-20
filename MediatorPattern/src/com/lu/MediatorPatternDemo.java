package com.lu;

public class MediatorPatternDemo {
	public static void main(String[] args) {
		User jack = new User("jack");
		User mike = new User("mike");
		jack.sendMessage("hi ,mike");
		mike.sendMessage("hi ,jack");
	}
}
