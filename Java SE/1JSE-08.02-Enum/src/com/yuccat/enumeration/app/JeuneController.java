package com.yuccat.enumeration.app;

import com.yuccat.enumeration.model.Jeune;

public class JeuneController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jeune enfant = Jeune.ENFANT;
		Jeune ado = Jeune.ADO;
		Jeune junior = Jeune.JUNIOR;
		System.out.println("Ze suis un poussin et z'ai entre " + enfant.getMin() + " et " + enfant.getMax());
		System.out.println("Chuis un ado de " + ado.getMin() + " à " + ado.getMax());
		System.out.println(junior.getMin() + " " + junior.getMax());
	}

}
