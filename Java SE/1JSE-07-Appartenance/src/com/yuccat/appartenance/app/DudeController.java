package com.yuccat.appartenance.app;

import com.yuccat.appartenance.model.Address;
import com.yuccat.appartenance.model.Dude;

public class DudeController {



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dude dudes [] = {
				new Dude ("José", "Lebeauski", 41, new Address(31, "rue sésame", 31200, "Toulouse")),
				new Dude ("Léa", "Coschnack", 32, new Address(67, "rue diçis", 42000, "Montluçon")),

		};
		for (Dude e:dudes) {
			System.out.println(e);
		}
		dudes[0].setAddress(dudes[1].getAddress());
		System.out.println(dudes[0]);
	}
}
