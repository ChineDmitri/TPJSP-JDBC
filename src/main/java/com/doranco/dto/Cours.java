package com.doranco.dto;

public class Cours {
	private int id;
	private String intitule;
	private int coef;
	private int duree;

	public Cours(int id, String intitule, int coef, int duree) {
		this.id = id;
		this.intitule = intitule;
		this.coef = coef;
		this.duree = duree;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIntitule() {
		return intitule;
	}

	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}

	public int getCoef() {
		return coef;
	}

	public void setCoef(int coef) {
		this.coef = coef;
	}

	public int getDuree() {
		return duree;
	}

	public void setDuree(int duree) {
		this.duree = duree;
	}

}
