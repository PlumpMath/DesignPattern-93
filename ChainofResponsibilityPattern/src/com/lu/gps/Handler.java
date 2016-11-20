package com.lu.gps;

import java.util.List;

public abstract class Handler {

	private Handler nextHandler;

	/**
	 * 位置处理器
	 * 
	 * @param poList
	 */
	public abstract void operater(List<Position> poList);

	public Handler getNextHandler() {
		return nextHandler;
	}

	public void setNextHandler(Handler nextHandler) {
		this.nextHandler = nextHandler;
	}

}
