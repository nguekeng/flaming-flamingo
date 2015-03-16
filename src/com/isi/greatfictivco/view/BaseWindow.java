package com.isi.greatfictivco.view;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JMenuBar;

@SuppressWarnings("serial")
public class BaseWindow extends JFrame {
	private Vue vue;

	public BaseWindow(String title, JMenuBar menuBar) {
		super(title);

		setSize(ConstantesVue.LARGEUR_FENETRE_BASE,
				ConstantesVue.HAUTEUR_FENETRE_BASE);
		setLocation(
				(int) (java.awt.Toolkit.getDefaultToolkit().getScreenSize()
						.getWidth() / 2 - ConstantesVue.POSITIONNEMENT_HORIZONTAL_FENETRE_BASE),
				(int) (java.awt.Toolkit.getDefaultToolkit().getScreenSize()
						.getHeight() / 2 - (ConstantesVue.POSITIONNEMENT_VERTICAL_FENETRE_BASE)));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
		this.setJMenuBar(menuBar);

	}

	private void ajouterHeader(ViewController viewController) {
		add(Box.createVerticalStrut(ConstantesVue.MARGIN_TOP_PANEL_HEADER));
		add(new Header(viewController));
		add(Box.createVerticalStrut(ConstantesVue.MARGIN_TOP_PANEL_RECHERCHE));
		
	}

	public void changeVuePrincipale(Vue vue, ViewController viewController) {
		this.vue = vue;
		getContentPane().removeAll();
		ajouterHeader(viewController);
		add(vue);
		validate();
		repaint();
	}
}
