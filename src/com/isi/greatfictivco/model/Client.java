package com.isi.greatfictivco.model;

import java.util.List;

public class Client {
	//Attributs
	private int idClient;
	private String nomEntreprise;
	private String adresse;
	private String nomContact;
	private String telephoneContact;
	private String description;
	private List<Commande> listeCommande;
	
	
	//Methode pour ajouter une commande
	public void ajouterCommande(){
		
	}
	
	
	//Accesseurs et mutateurs
	public int getIdClient() {
		return idClient;
	}
	
	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}
	
	public String getNomEntreprise() {
		return nomEntreprise;
	}
	
	public void setNomEntreprise(String nomEntreprise) {
		this.nomEntreprise = nomEntreprise;
	}
	
	public String getAdresse() {
		return adresse;
	}
	
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
	public String getNomContact() {
		return nomContact;
	}
	
	public void setNomContact(String nomContact) {
		this.nomContact = nomContact;
	}
	
	public String getTelephoneContact() {
		return telephoneContact;
	}
	
	public void setTelephoneContact(String telephoneContact) {
		this.telephoneContact = telephoneContact;
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
