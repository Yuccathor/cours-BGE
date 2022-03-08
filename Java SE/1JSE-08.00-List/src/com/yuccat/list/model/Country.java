package com.yuccat.list.model;

import java.util.ArrayList;

public class Country {

	private String continent;
	private String name;
	private int population;
	private ArrayList<String> cities = new ArrayList<String>();


	public Country(String continent, String name, int population, String[] cities) {
		super();
		this.continent = continent;
		this.name = name;
		this.population = population;
		for(String c : cities) {
			this.addCities(c);		}
	}


	private void addCities(String cities) {
		// TODO Auto-generated method stub
		this.cities.add(cities);
	}


	public Country(String continent, String name, int population) {
		super();
		this.continent = continent;
		this.name = name;
		this.population = population;
	}


	public String getContinent() {
		return continent;
	}


	public void setContinent(String continent) {
		this.continent = continent;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getPopulation() {
		return population;
	}


	public void setPopulation(int population) {
		this.population = population;
	}


	public ArrayList<String> getCities() {
		return cities;
	}


	public void setCities(ArrayList<String> cities) {
		this.cities = cities;
	}


	@Override
	public String toString() {
		return "Country [continent=" + continent + ", name=" + name + ", population=" + population + ", cities="
				+ cities + "]";
	}


}
