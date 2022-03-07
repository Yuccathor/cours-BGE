package com.yuccat.enumeration.model;

public enum Jeune {
	ENFANT(0,11), ADO(12,14), JUNIOR(15,18);
	
	private int min;
	private int max;
	
	Jeune(int x, int y){
		this.min = x;
		this.max = y;
	}

	public int getMin() {
		return min;
	}

	public int getMax() {
		return max;
	}
	
}
