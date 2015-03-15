package com.isi.greatfictivco.view;

import java.awt.Dimension;

import javax.swing.BorderFactory;

@SuppressWarnings("serial")
public class ListeClients extends Vue{
	public ListeClients(ViewController viewController) {
		super(viewController);

		setPreferredSize(new Dimension(
				ConstantesVue.LARGEUR_PANEL_LISTE_CLIENTS,
				ConstantesVue.HAUTEUR_PANEL_LISTE_CLIENTS));
		setMaximumSize(getPreferredSize());
		setBorder(BorderFactory.createLineBorder(ConstantesVue.COULEUR_BORDURE,
				ConstantesVue.LARGEUR_BORDURE));
	}
}
