package org.motaouia.firstexp.strategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCard {

	private List<Item> items;
	private double totalAmount;

	public ShoppingCard() {
		this.items = new ArrayList<Item>();
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public double getTotalAmount() {
		this.totalAmount = 0;
		for (Item item : this.items) {
			this.totalAmount += item.getPrice();
		}
		return this.totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public void pay(IPaymentStrategy paymentStrategy) {
		paymentStrategy.pay(this.getTotalAmount());
	}

	public void addItem(Item item) {
		this.items.add(item);
	}

	public void removeItem(Item item) {
		this.items.remove(item);
	}

}
