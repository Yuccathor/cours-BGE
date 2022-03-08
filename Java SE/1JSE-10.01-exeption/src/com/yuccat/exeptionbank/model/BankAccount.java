package com.yuccat.exeptionbank.model;

import com.yuccat.exceptionbank.exception.BankException;

public class BankAccount {
	private static final int MALUS = 30;
	private String name; //name
	private int balance = 0; //solde
	

	public BankAccount(String name) {
		super();
		this.name = name;
	}

	public void add(int amount) {
		this.balance += amount;
	}
	public void withdraw(int amount) throws BankException {
		
		this.add(-amount);
		if (this.balance < 0 ) {
			this.balance -= MALUS;
			throw new BankException("à découvert de " + this.balance, true);
			
		}
		if (this.balance < 100 ) {
			throw new BankException("Votre solde se rapproche de 0, " + this.balance, false);
		}
	}
	
	public String getName() {
		return name;
	}

	public int getBalance() {
		return balance;
	}

	@Override
	public String toString() {
		return "BankAccount [name=" + name + ", balance=" + balance + "]";
	}


	
	
}

//retirer ajouter de l'argent
