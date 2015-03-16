package com.isi.greatfictivco.model;

public class Utilisateur {
	//Attributs
	private int idUtilisateur;
	private String nomUtilisateur;
	private Role roleUtilisateur;
	
	
	//Accesseurs et mutateurs
	public int getIdUtilisateur() {
		return idUtilisateur;
	}
	
	public void setIdUtilisateur(int idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}
	
	public String getNomUtilisateur() {
		return nomUtilisateur;
	}
	
	public void setNomUtilisateur(String nomUtilisateur) {
		this.nomUtilisateur = nomUtilisateur;
	}
	
	public Role getRoleUtilisateur() {
		return roleUtilisateur;
	}
	
	public void setRoleUtilisateur(Role roleUtilisateur) {
		this.roleUtilisateur = roleUtilisateur;
	}

}
