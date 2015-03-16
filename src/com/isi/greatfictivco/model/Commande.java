package com.isi.greatfictivco.model;

import java.util.Date;
import java.util.List;

public class Commande {
	//Attributs
	private int idCommande;
	private int idClient;
	private Date dateCommande;
	private double prixTotal;
	private List<Produit> listeProduit;
	
	
	//Accesseurs et mutateurs
	public int getIdCommande() {
		return idCommande;
	}
	
	public void setIdCommande(int idCommande) {
		this.idCommande = idCommande;
	}
	
	public int getIdClient() {
		return idClient;
	}
	
	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}
	
	public Date getDateCommande() {
		return dateCommande;
	}
	
	public void setDateCommande(Date dateCommande) {
		this.dateCommande = dateCommande;
	}
	
	public double getPrixTotal() {
		return prixTotal;
	}
	
	public void setPrixTotal(double prixTotal) {
		this.prixTotal = prixTotal;
	}
	
	public List<Produit> getListeProduit() {
		return listeProduit;
	}
	
	public void setListeProduit(List<Produit> listeProduit) {
		this.listeProduit = listeProduit;
	}
	
}
