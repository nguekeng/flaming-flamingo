package com.isi.greatfictivco.model;

public class Fournisseur {
	//Attributs
	private int id_fournisseur;
	private String nom_fournisseur;
	
	
	//Accesseurs et mutateurs
	public int getId_fournisseur() {
		return id_fournisseur;
	}
	
	public void setId_fournisseur(int id_fournisseur) {
		this.id_fournisseur = id_fournisseur;
	}
	
	public String getNom_fournisseur() {
		return nom_fournisseur;
	}
	
	public void setNom_fournisseur(String nom_fournisseur) {
		this.nom_fournisseur = nom_fournisseur;
	}

}
