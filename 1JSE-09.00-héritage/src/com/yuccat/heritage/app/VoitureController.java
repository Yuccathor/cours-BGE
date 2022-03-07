package com.yuccat.heritage.app;

import com.yuccat.heritage.model.Voiture;
import com.yuccat.heritage.model.VoitureFamiliale;
import com.yuccat.heritage.model.VoitureSport;

public class VoitureController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Voiture voitures [] = new Voiture [] {
				new Voiture("Opel", "Cule", "SI-420-YI", 0, false),
				new VoitureSport("Renaud", "R5", "LO-720-SD",0 , false),
				new VoitureFamiliale("Peugeot", "Espace", "PL-777-IZ", 0, false)
		};

		for(Voiture v:voitures) {
			v.start();
			v.drive();
			
			System.out.println(v);
		}
	}
}
