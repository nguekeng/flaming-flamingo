package com.isi.greatfictivco.model;

import java.util.List;

public class Client {
	//Attributs
	private int id_client;
	private String entreprise;
	private String adresse;
	private String contact;
	private String telephone;
	private String description;
	private List<Commande> listeCommande;
	
	
	//Accesseurs et mutateurs
	public int getId_client() {
		return id_client;
	}
	
	public void setId_client(int id_client) {
		this.id_client = id_client;
	}
	
	public String getEntreprise() {
		return entreprise;
	}
	
	public void setEntreprise(String entreprise) {
		this.entreprise = entreprise;
	}
	
	public String getAdresse() {
		return adresse;
	}
	
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
	public String getContact() {
		return contact;
	}
	
	public void setContact(String contact) {
		this.contact = contact;
	}
	
	public String getTelephone() {
		return telephone;
	}
	
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public List<Commande> getListeCommande() {
		return listeCommande;
	}
	
	public void setListeCommande(List<Commande> listeCommande) {
		this.listeCommande = listeCommande;
	}
	
}
