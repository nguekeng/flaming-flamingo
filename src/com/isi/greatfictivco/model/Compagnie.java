package com.isi.greatfictivco.model;

public class Compagnie {
	//Attributs
	private String nom_compagnie;
	private String adresse;
	private String logo;
		
		
	//Accesseurs et mutateurs
	public String getAdresse() {
		return adresse;
	}
		
	public String getNom_compagnie() {
		return nom_compagnie;
	}

	public void setNom_compagnie(String nom_compagnie) {
		this.nom_compagnie = nom_compagnie;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
		
	public String getLogo() {
			return logo;
	}
		
	public void setLogo(String logo) {
		this.logo = logo;
	}

}
