package com.yuccat.heritage.model;

public class VoitureSport extends Voiture {


	public VoitureSport(String marque, String modele, String immatriculation, int position, boolean moteur) {
		super(marque, modele, immatriculation, position, moteur);
		// TODO Auto-generated constructor stub

	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		super.drive();
		position += 20;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
