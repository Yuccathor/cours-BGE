package com.yuccat.heritage02.model;

public class Employee {
	
	protected String name;
	protected int salary;
	
	protected int annualPay;

	public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	public void run(){
		this.annualPay = salary * 12;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", annualPay=" + annualPay + "]";
	}
}
