package com.isi.greatfictivco.view;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Search extends Vue{
	private JLabel labelRecherche;
	private JTextField boiteRecherche;

	public Search(ViewController viewController) {
		super(viewController);

		setLayout(new FlowLayout(FlowLayout.LEFT,
				ConstantesVue.CHAMPS_RECHERCHE_DECALAGE_HORIZONTAL,
				ConstantesVue.CHAMPS_RECHERCHE_DECALAGE_VERTICAL));
		
		setPreferredSize(new Dimension(ConstantesVue.LARGEUR_PANEL_RECHERCHE, ConstantesVue.HAUTEUR_PANEL_RECHERCHE));
		setMaximumSize(getPreferredSize());
		setBorder(BorderFactory.createLineBorder(ConstantesVue.COULEUR_BORDURE, ConstantesVue.LARGEUR_BORDURE));
		labelRecherche = new JLabel("Recherche");
		boiteRecherche = new JTextField(ConstantesVue.LARGEUR_TEXTFIELD_RECHERCHE);
		add(labelRecherche);
		add(boiteRecherche);

	}
}
