package com.yuccat.heritage.model;

public class Voiture {
	protected String marque;
	protected String modele;
	protected String immatriculation;
	protected int position = 0;
	protected boolean moteur = false;

	public Voiture(String marque, String modele, String immatriculation, int position, boolean moteur) {
		super();
		this.marque = marque;
		this.modele = modele;
		this.immatriculation = immatriculation;
		this.position = position;
		this.moteur = moteur;

	}
	public void start() {
		moteur = true;
	}
	
	public void drive() {
		position += 100;
	}

	@Override
	public String toString() {
		return "Voiture [marque=" + marque + ", modele=" + modele + ", immatriculation=" + immatriculation
				+ ", position=" + position + ", moteur=" + moteur + "]";
	}
}
