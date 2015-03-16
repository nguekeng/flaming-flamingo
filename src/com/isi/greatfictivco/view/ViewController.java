package com.isi.greatfictivco.view;

import com.isi.greatfictivco.controller.OtherController;

public class ViewController {
	private OtherController otherController;
	private BaseWindow baseWindow;
	private Menu menu;

	public ViewController(OtherController otherController, String title) {
		this.otherController = otherController;
		menu = new Menu("telephone");// TODO remove hard coding of role
		baseWindow = new BaseWindow(title, menu.getMenuBar());
		baseWindow.changeVuePrincipale(new ListeClients(this), this);
	}
	
	public void afficherModificationClient(){//TODO envoyer a la page de modif du client avec l'id en paramètre
		baseWindow.changeVuePrincipale(new ListeProduits(this), this);
	}
}
