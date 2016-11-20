package com.lu.gps;

import java.util.ArrayList;
import java.util.List;

/**
 * 调用函数
 * 
 * @author lusm
 *
 */
public class Client {
	public static void main(String[] args) {
		List<Position> list = new ArrayList<Position>();
		list.add(new Position(1f, 1f));
		list.add(new Position(2f, 2f));
		list.add(new Position(3f, 3f));
		System.out.println("处理前：");
		for (Position position : list) {
			System.out.println(position.toString());
		}
		AddressHandler addressHandler = new AddressHandler();
		DeflectHandler deflectHandler = new DeflectHandler();
		deflectHandler.setNextHandler(addressHandler);
		deflectHandler.operater(list);
		System.out.println("处理后：");
		for (Position position : list) {
			System.out.println(position.toString());
		}
	}

}
