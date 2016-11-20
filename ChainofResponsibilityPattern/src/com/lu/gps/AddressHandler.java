package com.lu.gps;

import java.util.List;
import java.util.Random;

/**
 * 地址设置
 * 
 * @author lusm
 *
 */
public class AddressHandler extends Handler {

	@Override
	public void operater(List<Position> poList) {
		for (Position position : poList) {
			position.setAddress("地址" + new Random().nextInt());
			System.out.println("地址设置");
		}
		if (this.getNextHandler() != null) {
			this.getNextHandler().operater(poList);
		}

	}

}
