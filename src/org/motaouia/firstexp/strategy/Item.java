package org.motaouia.firstexp.strategy;

public class Item {

	private String upcCode;
	private double price;

	public Item() {
		super();
	}

	public Item(String upcCode, double prive) {
		super();
		this.upcCode = upcCode;
		this.price = prive;
	}

	public String getUpcCode() {
		return upcCode;
	}

	public void setUpcCode(String upcCode) {
		this.upcCode = upcCode;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double prive) {
		this.price = prive;
	}

}
