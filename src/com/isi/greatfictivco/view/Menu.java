package com.isi.greatfictivco.view;

import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Menu {
	JMenuBar menuBar;
	JMenu menuInsertion, menuAffichage, menuConfiguration, menuQuitter;
	JMenuItem itemInsertionClient, itemInsertionProduit,
			itemInsertionInventaire, itemInsertionUtilisateur,
			itemAffichageClients, itemAffichageProduitsCommander,
			itemAffichageProduits, itemAffichageUtilisateurs,
			itemAffichageInventaire, itemBonRequisition, itemBonLivraison;

	public Menu(String role) {
		creerMenus();
		if (role.matches("telephone")) {
			creerItemsMenusCentreTelephonique();
		} else if (role.matches("livraison")) {
			creerItemsMenusCentreLivraison();
		} else if (role.matches("admin")) {
			creerItemsMenusAdmin();
		}
		creerBarreMenu(role);
	}

	public JMenuBar getMenuBar() {
		return menuBar;
	}

	public void setMenuBar(JMenuBar menuBar) {
		this.menuBar = menuBar;
	}

	private void creerMenus() {
		menuInsertion = new JMenu("Insertion  ");
		menuAffichage = new JMenu("  Affichage  ");
		menuConfiguration = new JMenu("  Configuration  ");
		menuQuitter = new JMenu("  Quitter  ");
	}

	private void creerItemsMenusCentreTelephonique() {
		itemInsertionClient = new JMenuItem(" Client    ");
		itemAffichageClients = new JMenuItem(" Clients ");
		itemAffichageInventaire = new JMenuItem(" Inventaire ");
		itemBonRequisition = new JMenuItem(" Bons Réquisitions ");
		itemBonLivraison = new JMenuItem(" Bons Livraison ");

		ajouterItemsMenusCentreTelephonique();
	}
	
	private void ajouterItemsMenusCentreTelephonique(){
		menuInsertion.add(itemInsertionClient);

		menuAffichage.add(itemAffichageClients);
		menuAffichage.addSeparator();
		menuAffichage.add(itemAffichageInventaire);
		menuAffichage.addSeparator();
		menuAffichage.add(itemBonRequisition);
		menuAffichage.addSeparator();
		menuAffichage.add(itemBonLivraison);
	}
	
	private void creerItemsMenusCentreLivraison(){
		itemInsertionInventaire = new JMenuItem(" Inventaire    ");
		itemAffichageProduitsCommander = new JMenuItem(" Produits à commander ");

		ajouterItemsMenusCentreLivraison();
	}
	
	private void ajouterItemsMenusCentreLivraison(){
		menuInsertion.add(itemInsertionInventaire);
		menuAffichage.add(itemAffichageProduitsCommander);
	}
	
	private void creerItemsMenusAdmin(){
		itemInsertionUtilisateur = new JMenuItem(" Utilisateur    ");
		itemInsertionProduit = new JMenuItem("  Produit ");
		itemAffichageUtilisateurs = new JMenuItem("  Utilisateurs  ");
		itemAffichageProduits = new JMenuItem(" Produits ");

		ajouterItemsMenusAdmin();
	}
	
	private void ajouterItemsMenusAdmin(){
		menuInsertion.add(itemInsertionUtilisateur);
		menuInsertion.addSeparator();
		menuInsertion.add(itemInsertionProduit);

		menuAffichage.add(itemAffichageProduits);
		menuAffichage.addSeparator();
		menuAffichage.add(itemAffichageUtilisateurs);
	}
	
	private void creerBarreMenu(String role){
		menuBar = new JMenuBar();
		menuBar.setPreferredSize(new Dimension(ConstantesVue.LARGEUR_MENUBAR, ConstantesVue.HAUTEUR_MENUBAR));
		menuBar.add(menuInsertion);
		menuBar.add(menuAffichage);
		if (role.matches("admin")) {
			menuBar.add(menuConfiguration);
		}
		menuBar.add(Box.createHorizontalGlue());
		menuBar.add(menuQuitter);
	}
}
