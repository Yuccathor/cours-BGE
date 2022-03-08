package com.yuccat.abstractclass.model;

public class Felin extends Animal {

	public Felin(String name, boolean hydrated) {
		super(name, hydrated);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Le "+name+" mange de la viande");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Le "+name+" se déplace furtivement");
	}

	@Override
	public void cry() {
		// TODO Auto-generated method stub
		System.out.println("Le "+name+" feule : ''Euuh... Grr ?''");
	}

}
