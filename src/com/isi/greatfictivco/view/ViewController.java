package com.isi.greatfictivco.view;

import com.isi.greatfictivco.controller.OtherController;

public class ViewController {
	private OtherController otherController;
	private BaseWindow baseWindow;
	private Menu menu;

	public ViewController(OtherController otherController, String title) {
		this.otherController = otherController;
		menu = new Menu("admin");// TODO remove hard coding of role
		baseWindow = new BaseWindow(title, menu.getMenuBar());
		//baseWindow.changeVuePrincipale(new ListeProduits(this), this);
		//baseWindow.changeVuePrincipale(new Produit(this), this);
		baseWindow.changeVuePrincipale(new Client(this), this);
	}
}
