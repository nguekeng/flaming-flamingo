package com.isi.greatfictivco.model;

import java.util.List;

public final class Inventaire {
	// Attributs
	private int id_inventaire;
	private int id_entrepot;
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


	public int getId_inventaire() {
		return id_inventaire;
	}


	public void setId_inventaire(int id_inventaire) {
		this.id_inventaire = id_inventaire;
	}


	public int getId_entrepot() {
		return id_entrepot;
	}


	public void setId_entrepot(int id_entrepot) {
		this.id_entrepot = id_entrepot;
	}

}
