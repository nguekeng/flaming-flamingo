package com.isi.greatfictivco.view;

import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public abstract class Vue extends JPanel {
	private ViewController viewController;
	
	public Vue(ViewController viewController) {
		this.viewController = viewController;
		setPreferredSize(new Dimension(ConstantesVue.LARGEUR_PANEL_PRINCIPAL, ConstantesVue.HAUTEUR_PANEL_PRINCIPAL));
		setMaximumSize(getPreferredSize());
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
	}
	
	public void addSearch(ViewController viewController){
		add(new Search(viewController));
		add(Box.createVerticalStrut(ConstantesVue.MARGIN_BOTTOM_PANEL_RECHERCHE));
	}
}
