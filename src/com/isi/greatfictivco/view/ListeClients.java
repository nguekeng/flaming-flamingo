package com.isi.greatfictivco.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;

@SuppressWarnings("serial")
public class ListeClients extends Vue {
	private JPanel titresColonnes;
	private JPanel liste;

	public ListeClients(ViewController viewController) {
		super(viewController);

		setLayout(new GridLayout());
		setPreferredSize(new Dimension(
				ConstantesVue.LARGEUR_PANEL_LISTE_CLIENTS,
				ConstantesVue.HAUTEUR_PANEL_LISTE_CLIENTS));
		setMaximumSize(getPreferredSize());
		setBorder(BorderFactory.createLineBorder(ConstantesVue.COULEUR_BORDURE,
				ConstantesVue.LARGEUR_BORDURE));
		
		Object[][] data = {

		{ "Cysboy", "28 ans", "1.80 m"  },

		{ "BZHHydde", "28 ans", "1.80 m"},

		{ "IamBow", "24 ans", "1.90 m"},

		{ "FunMan", "32 ans", "1.85 m" }

		};

		
		String title[] = { "Pseudo", "Age", "Taille" };

		JTable tableau = new JTable(data, title);
		tableau.setSize(ConstantesVue.LARGEUR_PANEL_LISTE_CLIENTS,
				ConstantesVue.HAUTEUR_PANEL_LISTE_CLIENTS);
		
		add(new JScrollPane(tableau));

	}

}
