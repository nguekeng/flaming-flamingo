package com.isi.greatfictivco.model;

public class Utilisateur {
	//Attributs
	private int id_utilisateur;
	private String nom_utilisateur;
	private String mot_de_passe;
	private int id_role;
	
	
	//Accesseurs et mutateurs
	public int getId_utilisateur() {
		return id_utilisateur;
	}
	
	public void setId_utilisateur(int id_utilisateur) {
		this.id_utilisateur = id_utilisateur;
	}
	
	public String getNom_utilisateur() {
		return nom_utilisateur;
	}
	
	public void setNom_utilisateur(String nom_utilisateur) {
		this.nom_utilisateur = nom_utilisateur;
	}
	
	public String getMot_de_passe() {
		return mot_de_passe;
	}
	
	public void setMot_de_passe(String mot_de_passe) {
		this.mot_de_passe = mot_de_passe;
	}
	
	public int getId_role() {
		return id_role;
	}
	
	public void setId_role(int id_role) {
		this.id_role = id_role;
	}
	
}
