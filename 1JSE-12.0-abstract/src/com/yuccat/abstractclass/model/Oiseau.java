package com.yuccat.abstractclass.model;

public class Oiseau extends Animal {

	public Oiseau(String name, boolean hydrated) {
		super(name, hydrated);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Le "+name + " mange des graines");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Le "+name+" se déplace par dépot successif de guano");
	}

	@Override
	public void cry() {
		// TODO Auto-generated method stub
		System.out.println("Le "+name+" roucoul : \"Je. Ne. MANGE. PAS... DE GRAINES\"");
	}

}
