package com.isi.greatfictivco.model;

import java.util.List;

public class Produit {
	//Attributs
	private int id_produit;
	private String upc;
	private String nom;
	private String image;
	private String description;
	private double prix_vendant;
	private double prix_coutant;
	private int qte_par_paquet;
	private boolean si_enleve;
	private int id_categorie;
	private int id_type_unite;
	private int id_fournisseur;
	private int qte_critique;
	private List<Entrepot> listeEntrepot;
	
	
	//Accesseurs et mutateurs
	public int getId_produit() {
		return id_produit;
	}
	
	public void setId_produit(int id_produit) {
		this.id_produit = id_produit;
	}
	
	public String getUpc() {
		return upc;
	}
	
	public void setUpc(String upc) {
		this.upc = upc;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getImage() {
		return image;
	}
	
	public void setImage(String image) {
		this.image = image;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public double getPrix_vendant() {
		return prix_vendant;
	}
	
	public void setPrix_vendant(double prix_vendant) {
		this.prix_vendant = prix_vendant;
	}
	
	public double getPrix_coutant() {
		return prix_coutant;
	}
	
	public void setPrix_coutant(double prix_coutant) {
		this.prix_coutant = prix_coutant;
	}
	
	public int getQte_par_paquet() {
		return qte_par_paquet;
	}
	
	public void setQte_par_paquet(int qte_par_paquet) {
		this.qte_par_paquet = qte_par_paquet;
	}
	
	public boolean isSi_enleve() {
		return si_enleve;
	}
	
	public void setSi_enleve(boolean si_enleve) {
		this.si_enleve = si_enleve;
	}
	
	public int getId_categorie() {
		return id_categorie;
	}
	
	public void setId_categorie(int id_categorie) {
		this.id_categorie = id_categorie;
	}
	
	public int getId_type_unite() {
		return id_type_unite;
	}
	
	public void setId_type_unite(int id_type_unite) {
		this.id_type_unite = id_type_unite;
	}
	
	public int getId_fournisseur() {
		return id_fournisseur;
	}
	
	public void setId_fournisseur(int id_fournisseur) {
		this.id_fournisseur = id_fournisseur;
	}
	
	public List<Entrepot> getListeEntrepot() {
		return listeEntrepot;
	}
	
	public void setListeEntrepot(List<Entrepot> listeEntrepot) {
		this.listeEntrepot = listeEntrepot;
	}

	public int getQte_critique() {
		return qte_critique;
	}

	public void setQte_critique(int qte_critique) {
		this.qte_critique = qte_critique;
	}
	
}
