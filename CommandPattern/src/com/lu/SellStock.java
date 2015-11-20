package com.lu;

public class SellStock implements Order {
	private Stock stock;

	public SellStock(Stock stock) {
		super();
		this.stock = stock;
	}

	@Override
	public void excute() {
		stock.sell();
	}

}
