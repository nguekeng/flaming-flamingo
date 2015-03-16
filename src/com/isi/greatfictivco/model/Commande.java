package com.isi.greatfictivco.model;

import java.util.Date;
import java.util.List;

public class Commande {
	//Attributs
	private int id_commande;
	private int id_client;
	private String vendeur;
	private Date date;
	private double prix_total;
	private List<Produit> listeProduit;
	
	
	//Accesseurs et mutateurs
	public int getId_commande() {
		return id_commande;
	}
	
	public void setId_commande(int id_commande) {
		this.id_commande = id_commande;
	}
	
	public int getId_client() {
		return id_client;
	}
	
	public void setId_client(int id_client) {
		this.id_client = id_client;
	}
	
	public String getVendeur() {
		return vendeur;
	}
	
	public void setVendeur(String vendeur) {
		this.vendeur = vendeur;
	}
	
	public Date getDate() {
		return date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	public double getPrix_total() {
		return prix_total;
	}
	
	public void setPrix_total(double prix_total) {
		this.prix_total = prix_total;
	}
	
	public List<Produit> getListeProduit() {
		return listeProduit;
	}
	
	public void setListeProduit(List<Produit> listeProduit) {
		this.listeProduit = listeProduit;
	}
	
}
