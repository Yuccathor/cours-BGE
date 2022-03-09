package com.yuccat.appartenance.model;

public class Address {

	@Override
	public String toString() {
		return "Address [number=" + number + ", street=" + street + ", postalCode=" + postalCode + ", city=" + city
				+ "]";
	}

	private int number;
	private String street;
	private int postalCode;
	private String city;
	
	public Address(int number, String street, int postalCode, String city) {
		super();
		this.number = number;
		this.street = street;
		this.postalCode = postalCode;
		this.city = city;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	
}
