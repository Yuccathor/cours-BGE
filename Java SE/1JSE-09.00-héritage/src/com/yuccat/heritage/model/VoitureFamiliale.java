package com.yuccat.heritage.model;

public class VoitureFamiliale extends Voiture {

//	private int siege;

	public VoitureFamiliale(String marque, String modele, String immatriculation, int position, boolean moteur) {
		super(marque, modele, immatriculation, position, moteur);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
