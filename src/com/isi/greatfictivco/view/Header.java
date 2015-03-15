package com.isi.greatfictivco.view;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class Header extends Vue {
private BufferedImage logo;
	
	public Header(ViewController viewController){
		super(viewController);
		
		try {
			logo = ImageIO.read(new File("battleship.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		JLabel picLogo = new JLabel(new ImageIcon(logo));
		
		setLayout(new FlowLayout(FlowLayout.LEFT));
		setPreferredSize(new Dimension(ConstantesVue.LARGEUR_PANEL_HEADER,ConstantesVue.HAUTEUR_PANEL_HEADER));
		setMaximumSize(getPreferredSize());
		add(picLogo);
	}
}
