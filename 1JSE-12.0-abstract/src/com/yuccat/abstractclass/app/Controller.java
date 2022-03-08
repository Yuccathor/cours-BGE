package com.yuccat.abstractclass.app;

import com.yuccat.abstractclass.model.Animal;
import com.yuccat.abstractclass.model.Felin;
import com.yuccat.abstractclass.model.Oiseau;

public class Controller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animals [] = { new Felin("Tigre", false), new Oiseau("Pigeon", false) };
		for (Animal a:animals) {
			a.drink();
			a.eat();
			a.move();
			a.cry();
		}
	}

}
