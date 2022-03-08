package com.yuccat.vendable.model;


public class Livre implements Vendable {

	public String idBook;
	public String name;
	public String author;
	public int price;

	
	public Livre(String idBook, String name, String author, int price) {
		super();
		this.idBook = idBook;
		this.name = name;
		this.author = author;
		this.price = price;
	}

	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return idBook;
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return price;
	}

	@Override
	public String getInfos() {
		// TODO Auto-generated method stub
		return this.author+this.name;
	}

}
