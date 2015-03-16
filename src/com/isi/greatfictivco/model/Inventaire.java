package com.isi.greatfictivco.model;

import java.util.List;

public final class Inventaire {
	// Attributs
	private List<Produit> listeProduit;
	private static Inventaire instance = null;
	
	
	//Constructeur privee pour empecher l'instanciation
	private Inventaire(){};
	
	
	//Accesseurs et mutateurs
	public final static Inventaire getInstance() {

		if (Inventaire.instance == null) {
			// multithreading
			synchronized (Inventaire.class) {
				if (Inventaire.instance == null) {
					Inventaire.instance = new Inventaire();
				}
			}
		}
		return Inventaire.instance;
	}

	public List<Produit> getListeProduit() {
		return listeProduit;
	}

	public void setListeProduit(List<Produit> listeProduit) {
		this.listeProduit = listeProduit;
	}

}
