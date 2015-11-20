package com.lu;

import java.util.Date;

public class ChatRoom {
	public static void showMessage(User user, String message) {
		System.out.println("time:" + new Date() + "username:" + user.getName() + "message:" + message);
	}
}
