package com.isi.greatfictivco.model;

import java.util.List;

public class Produit {
	//Attributs
	private int idProduit;
	private String UPC;
	private String nomProduit;
	private String descriptionProduit;
	private double prixVendant;
	private double prixCoutant;
	private int quantiteParEmballage;
	private boolean estRetire;
	private int idCategorie;
	private int idTypeUnite;
	private int idFournisseur;
	private int quantiteTotal;
	private List<Entrepot> listeEntrepot;
	
	
	//Accesseurs et mutateurs
	public int getIdProduit() {
		return idProduit;
	}
	
	public void setIdProduit(int idProduit) {
		this.idProduit = idProduit;
	}
	
	public String getUPC() {
		return UPC;
	}
	
	public void setUPC(String uPC) {
		UPC = uPC;
	}
	
	public String getNomProduit() {
		return nomProduit;
	}
	
	public void setNomProduit(String nomProduit) {
		this.nomProduit = nomProduit;
	}
	
	public String getDescriptionProduit() {
		return descriptionProduit;
	}
	
	public void setDescriptionProduit(String descriptionProduit) {
		this.descriptionProduit = descriptionProduit;
	}
	
	public double getPrixVendant() {
		return prixVendant;
	}
	
	public void setPrixVendant(double prixVendant) {
		this.prixVendant = prixVendant;
	}
	
	public double getPrixCoutant() {
		return prixCoutant;
	}
	
	public void setPrixCoutant(double prixCoutant) {
		this.prixCoutant = prixCoutant;
	}
	
	public int getQuantiteParEmballage() {
		return quantiteParEmballage;
	}
	
	public void setQuantiteParEmballage(int quantiteParEmballage) {
		this.quantiteParEmballage = quantiteParEmballage;
	}
	
	public boolean isEstRetire() {
		return estRetire;
	}
	
	public void setEstRetire(boolean estRetire) {
		this.estRetire = estRetire;
	}
	
	public int getIdCategorie() {
		return idCategorie;
	}
	
	public void setIdCategorie(int idCategorie) {
		this.idCategorie = idCategorie;
	}
	
	public int getIdTypeUnite() {
		return idTypeUnite;
	}
	
	public void setIdTypeUnite(int idTypeUnite) {
		this.idTypeUnite = idTypeUnite;
	}
	
	public int getIdFournisseur() {
		return idFournisseur;
	}
	
	public void setIdFournisseur(int idFournisseur) {
		this.idFournisseur = idFournisseur;
	}
	
	public int getQuantiteTotal() {
		return quantiteTotal;
	}
	
	public void setQuantiteTotal(int quantiteTotal) {
		this.quantiteTotal = quantiteTotal;
	}
	
	public List<Entrepot> getListeEntrepot() {
		return listeEntrepot;
	}
	
	public void setListeEntrepot(List<Entrepot> listeEntrepot) {
		this.listeEntrepot = listeEntrepot;
	}
	
}
