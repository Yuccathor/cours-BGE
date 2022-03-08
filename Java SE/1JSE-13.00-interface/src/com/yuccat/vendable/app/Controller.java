package com.yuccat.vendable.app;

import com.yuccat.vendable.model.Livre;
import com.yuccat.vendable.model.Raquette;
import com.yuccat.vendable.model.Vendable;

public class Controller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vendable vendables [] = { 
				new Livre("M420", "L'art du CCC matins", "yuccat", 45), 
				new Raquette("C787LS", "Décathlon", 79, "Yvan" ) };
	
	for (Vendable v:vendables) {
		System.out.println(v.getInfos());
	}
}
}
