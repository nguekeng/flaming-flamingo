package com.isi.greatfictivco.model;

public class Commande_produit {
	//Attributs
	private int id_commande_produit;
	private int id_commande;
	private int id_produit;
	private int qte;
	private double prix_par_unite;
	
	
	//Accesseurs et mutateurs
	public int getId_commande_produit() {
		return id_commande_produit;
	}
	
	public void setId_commande_produit(int id_commande_produit) {
		this.id_commande_produit = id_commande_produit;
	}
	
	public int getId_commande() {
		return id_commande;
	}
	
	public void setId_commande(int id_commande) {
		this.id_commande = id_commande;
	}
	
	public int getId_produit() {
		return id_produit;
	}
	
	public void setId_produit(int id_produit) {
		this.id_produit = id_produit;
	}
	
	public int getQte() {
		return qte;
	}
	
	public void setQte(int qte) {
		this.qte = qte;
	}
	
	public double getPrix_par_unite() {
		return prix_par_unite;
	}
	
	public void setPrix_par_unite(double prix_par_unite) {
		this.prix_par_unite = prix_par_unite;
	}

}
