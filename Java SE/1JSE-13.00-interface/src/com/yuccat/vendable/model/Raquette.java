package com.yuccat.vendable.model;

public class Raquette implements Vendable {
	
	public String reference;
	public String brand;
	public int price;
	public String topPlayer;

	public Raquette(String reference, String brand, int price, String topPlayer) {
		super();
		this.reference = reference;
		this.brand = brand;
		this.price = price;
		this.topPlayer = topPlayer;
	}

	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return this.reference;
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return this.price;
	}

	@Override
	public String getInfos() {
		// TODO Auto-generated method stub
		return this.brand+this.topPlayer;
	}

}
