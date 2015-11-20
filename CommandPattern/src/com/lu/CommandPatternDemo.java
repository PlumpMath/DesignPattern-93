package com.lu;

public class CommandPatternDemo {
	public static void main(String[] args) {
		Broker broker = new Broker();
		Stock stock = new Stock();
		BuyStock buyStock = new BuyStock(stock);
		SellStock sellStock = new SellStock(stock);
		broker.takeOrder(sellStock);
		broker.takeOrder(buyStock);
		broker.palceOrder();

	}
}
