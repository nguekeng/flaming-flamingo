package com.isi.greatfictivco.view;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public abstract class Vue extends JPanel {
private ViewController viewController;
	
	public Vue(ViewController viewController){
		this.viewController = viewController;
	}
}
