package com.isi.greatfictivco.view;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class ListeClients extends Vue {
	private JPanel panelTableau;
	private String titreTableau = "Liste des clients";
	private ModeleTableau modeleTableau;
	private JTable tableau;
	private Object[][] data;

	public ListeClients(ViewController viewController) {
		super(viewController);

		addSearch(viewController);
		creerStructurePanelTableau();

		Object[][] data = {// TODO remove hardcoding

		{ "Cysboy", "28 ans", "1.80 m", "modifier" },

		{ "BZHHydde", "28 ans", "1.80 m", "modifier" },

		{ "IamBow", "24 ans", "1.90 m", "modifier" },

		{ "FunMan", "32 ans", "1.85 m", "modifier" }

		};

		String title[] = { "Pseudo", "Age", "Taille", "Action" };// TODO remove
																	// hardcoding

		modeleTableau = new ModeleTableau(data, title);
		creerTableau();
		ajouterComposantsDansVue();
	}

	private void creerStructurePanelTableau() {
		panelTableau = new JPanel();
		panelTableau.setBorder(BorderFactory.createTitledBorder(BorderFactory
				.createLineBorder(ConstantesVue.COULEUR_BORDURE), titreTableau,
				TitledBorder.TOP, TitledBorder.LEFT, new Font(
						ConstantesVue.FONT_TITRE_TABLEAU,
						ConstantesVue.FONT_STYLE_TITRE_TABLEAU,
						ConstantesVue.FONT_SIZE_TITRE_TABLEAU)));

		panelTableau.setLayout(new GridLayout());
		panelTableau.setPreferredSize(new Dimension(
				ConstantesVue.LARGEUR_PANEL_LISTE_CLIENTS,
				ConstantesVue.HAUTEUR_PANEL_LISTE_CLIENTS));
		panelTableau.setMaximumSize(getPreferredSize());

	}

	private void creerTableau() {
		tableau = new JTable(modeleTableau);

		// tableau.setDefaultRenderer(JButton.class, new
		// ComposantTableau());//TODO delete si pas utilisé

		// afficher un JButton en fonction de la colonne
		tableau.getColumn("Action").setCellRenderer(new AfficherJButton());
		tableau.getColumn("Action").setCellEditor(new EditerJButton(new JCheckBox()));
		tableau.setSize(ConstantesVue.LARGEUR_PANEL_LISTE_CLIENTS,
				ConstantesVue.HAUTEUR_PANEL_LISTE_CLIENTS);
	}
	
	private void ajouterComposantsDansVue(){
		panelTableau.add(new JScrollPane(tableau));
		add(panelTableau);
	}

}


