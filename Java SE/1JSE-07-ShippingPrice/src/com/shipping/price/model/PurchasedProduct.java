package com.shipping.price.model;

public class PurchasedProduct {
	
	private String name ;
	private int price ;
	private int distance = 0 ;
	
	private int finalPrice; //OUT

	public PurchasedProduct(String name, int price, int distance) {
		super();
		this.name = name;
		this.price = price;
		this.distance = distance;
	}
	
	public void run() {
		this.setFinalPrice(this.price) ;
		if(this.price>1000) {
			return;
		}
		if(this.distance>100) {
			this.setFinalPrice(this.getFinalPrice() + 70);
		}
		else {
			this.setFinalPrice(this.getFinalPrice() + 30);
		}
	}

	public int getFinalPrice() {
		return finalPrice;
	}

	public void setFinalPrice(int finalPrice) {
		this.finalPrice = finalPrice;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}
	
	
	
}
