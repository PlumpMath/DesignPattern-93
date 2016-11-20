package com.lu.gps;

import java.util.List;

/**
 * 位置偏转
 * 
 * @author lusm
 *
 */
public class DeflectHandler extends Handler {

	@Override
	public void operater(List<Position> poList) {
		for (Position position : poList) {
			position.setLatitude(position.getLatitude() + 1);
			position.setLongitude(position.getLongitude() + 1);
			System.out.println("偏转地址");
		}
		if (this.getNextHandler() != null) {
			this.getNextHandler().operater(poList);
		}

	}

}
