package com.isi.greatfictivco.view;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

@SuppressWarnings("serial")
public class ListeClients extends Vue {
	private JPanel listeClients;
	
	public ListeClients(ViewController viewController) {
		super(viewController);
		
		addSearch(viewController);
		listeClients = new JPanel();
		listeClients.setLayout(new GridLayout());
		listeClients.setPreferredSize(new Dimension(
				ConstantesVue.LARGEUR_PANEL_LISTE_CLIENTS,
				ConstantesVue.HAUTEUR_PANEL_LISTE_CLIENTS));
		listeClients.setMaximumSize(getPreferredSize());
		listeClients.setBorder(BorderFactory.createLineBorder(ConstantesVue.COULEUR_BORDURE,
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
		
		listeClients.add(new JScrollPane(tableau));
		add(listeClients);

	}
	
	

}
