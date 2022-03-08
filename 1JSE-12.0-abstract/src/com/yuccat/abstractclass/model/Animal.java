package com.yuccat.abstractclass.model;

public abstract class Animal {
	protected String name;
	protected boolean hydrated = false;
	
	
	public Animal(String name, boolean hydrated) {
		super();
		this.name = name;
		this.hydrated = hydrated;
	}

	public void drink() {
		this.hydrated = true;
		System.out.println("L'animal est hydraté");
	}

	public String getName() {
		return name;
	}


	@Override
	public String toString() {
		return "Animal [name=" + name + ", hydrated=" + hydrated + "]";
	}

	
	public abstract void eat();
	
	public abstract void move();
	
	public abstract void cry();
	
}
