package com.lu;

public class BuyStock implements Order {
	private Stock stock;

	public BuyStock(Stock stock) {
		super();
		this.stock = stock;
	}

	@Override
	public void excute() {
		stock.buy();
	}

}