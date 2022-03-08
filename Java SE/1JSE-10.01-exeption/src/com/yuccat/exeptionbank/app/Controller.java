package com.yuccat.exeptionbank.app;

import com.yuccat.exceptionbank.exception.BankException;
import com.yuccat.exeptionbank.model.BankAccount;

public class Controller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount ba = new BankAccount ("yuccat");
		ba.add(250);
		try {
			ba.withdraw(200);
		} catch (BankException e) {
			// TODO Auto-generated catch block
			System.err.println(e.render());
		}
		System.out.println(ba);
		
	}

}
