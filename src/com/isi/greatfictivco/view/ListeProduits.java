package com.isi.greatfictivco.view;

import java.util.Vector;

import javax.swing.JScrollPane;
import javax.swing.JTable;

public class ListeProduits extends Vue {
	private JTable table;

	public ListeProduits(ViewController viewController) {
		super(viewController);
		addSearch(viewController);
		Vector<String> line1 = new Vector<String>();
		line1.addElement("00001");
		line1.addElement("ISI");
		line1.addElement("Mme MORIN");
		line1.addElement("514 346 6786");
		line1.addElement("255 boul cremazie est bureau 100");
		line1.addElement("ecole informatique");
		line1.addElement("Modifier");
		line1.addElement("Commander");

		Vector<String> line2 = new Vector<String>();
		line2.addElement("00002");
		line2.addElement("KENKO");
		line2.addElement("Mme MELI");
		line2.addElement("514 346 6786");
		line2.addElement("255 boul cremazie est bureau 100");
		line2.addElement("Lycee");
		line2.addElement("Modifier");
		line2.addElement("Commander");

		Vector<Vector> lesLines = new Vector<Vector>();
		lesLines.addElement(line1);
		lesLines.addElement(line2);

		Vector<String> nomdescolonnes = new Vector<String>();
		nomdescolonnes.addElement("No produit");
		nomdescolonnes.addElement("UPC");
		nomdescolonnes.addElement("Nom");
		nomdescolonnes.addElement("Qte");
		nomdescolonnes.addElement("Categorie");
		nomdescolonnes.addElement("Type");
		nomdescolonnes.addElement("Prix Coutant");
		nomdescolonnes.addElement("Prix Vendant");
		nomdescolonnes.addElement("Qte Seuil");
		nomdescolonnes.addElement("Description");
		nomdescolonnes.addElement("Image");
		nomdescolonnes.addElement("Action1");

		table = new JTable(lesLines, nomdescolonnes);
		add(new JScrollPane(table));

	}
}
