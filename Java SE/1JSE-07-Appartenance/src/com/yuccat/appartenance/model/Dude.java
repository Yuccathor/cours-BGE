package com.yuccat.appartenance.model;

public class Dude {
	private String lastName;
	private String firstName;
	private int age;
	private Address address;

	public Dude(String lastName, String firstName, int age, Address address) {
		super();
		this.lastName = lastName;
		this.firstName = firstName;
		this.age = age;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Dude [lastName=" + lastName + ", firstName=" + firstName + ", age=" + age + ", address=" + address
				+ "]";
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}


}
