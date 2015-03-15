package com.isi.greatfictivco.view;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JMenuBar;

@SuppressWarnings("serial")
public class BaseWindow extends JFrame {
private Vue vue;
	
	public BaseWindow(String title, JMenuBar menuBar){
		super(title);
		
		setSize(1200, 700);
		setLocation(
				(int) (java.awt.Toolkit.getDefaultToolkit().getScreenSize().getWidth() / 2 - 600 ),//600 as constant
				(int) (java.awt.Toolkit.getDefaultToolkit().getScreenSize().getHeight() / 2 - (350 )));//350 as constant
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLayout(new BoxLayout(this.getContentPane(),BoxLayout.Y_AXIS));
		this.setJMenuBar(menuBar);
		
	}
	
	private void ajouterHeaderEtRecherche(ViewController viewController){
		add(Box.createVerticalStrut(80));
		add(new Header(viewController));
		add(Box.createVerticalStrut(20));
		add(new Search(viewController));
		add(Box.createVerticalStrut(20));
	}
	
	public void changeVuePrincipale(Vue vue, ViewController viewController){
		this.vue = vue;
		getContentPane().removeAll();
		ajouterHeaderEtRecherche(viewController);
		add(vue);
		validate();
		repaint();
	}
}
