package com.yuccat.heritage02.model;

public class Manager extends Employee {


	private static int christmasBonus = 2004;

	public Manager(String name, int salary) {
		super(name, salary);
		// TODO Auto-generated constructor stub
	}
	
	public static int getChristmasbonus() {
		return christmasBonus;
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		this.annualPay = salary*13 + christmasBonus;
		
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
