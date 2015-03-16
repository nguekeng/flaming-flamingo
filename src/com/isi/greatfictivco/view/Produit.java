package com.isi.greatfictivco.view;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Produit extends Vue {
	private static final long serialVersionUID = 1L;
	private JLabel lblNoProduit;
	private JLabel lblUPC;
	private JLabel lblNom;
	private JLabel lblQte;
	private JLabel lblCategorie;
	private JLabel lblType;
	private JLabel lblPrixC;
	private JLabel lblPrixV;
	private JLabel lblQteSeuil;
	private JLabel lblDescription;
	private JLabel lblImage;
	private JButton btEnregistrer;

	private JTextField txtNoProduit;
	private JTextField txtUPC;
	private JTextField txtNom;
	private JTextField txtQte;
	private JTextField txtCategorie;
	private JTextField txtType;
	private JTextField txtPrixC;
	private JTextField txtPrixV;
	private JTextField txtQteSeuil;
	private JTextField txtImage;

	private JTextArea txtDescription;

	public Produit(ViewController viewController) {
		super(viewController);
		addSearch(viewController);
		
		this.lblNoProduit = new JLabel("#Produit: ");
		this.lblNoProduit.setPreferredSize(new Dimension(150, 50));
		this.lblNoProduit.setFont(new Font("Serif", Font.BOLD, 18));
		this.lblUPC = new JLabel("UPC: ");
		this.lblUPC.setPreferredSize(new Dimension(150, 50));
		this.lblUPC.setFont(new Font("Serif", Font.BOLD, 18));
		this.lblNom = new JLabel("Nom: ");
		this.lblNom.setPreferredSize(new Dimension(150, 50));
		this.lblNom.setFont(new Font("Serif", Font.BOLD, 18));
		this.lblQte = new JLabel("Quantité: ");
		this.lblQte.setPreferredSize(new Dimension(150, 50));
		this.lblQte.setFont(new Font("Serif", Font.BOLD, 18));
		this.lblCategorie = new JLabel("Categorie: ");
		this.lblCategorie.setPreferredSize(new Dimension(150, 50));
		this.lblCategorie.setFont(new Font("Serif", Font.BOLD, 18));
		this.lblType = new JLabel("Type Unité: ");
		this.lblType.setPreferredSize(new Dimension(150, 50));
		this.lblType.setFont(new Font("Serif", Font.BOLD, 18));
		this.lblPrixC = new JLabel("Prix Coutant: ");
		this.lblPrixC.setPreferredSize(new Dimension(150, 50));
		this.lblPrixC.setFont(new Font("Serif", Font.BOLD, 18));
		this.lblPrixV = new JLabel("Prix Vendant: ");
		this.lblPrixV.setPreferredSize(new Dimension(150, 50));
		this.lblPrixV.setFont(new Font("Serif", Font.BOLD, 18));
		this.lblQteSeuil = new JLabel("Quantité Seuil: ");
		this.lblQteSeuil.setPreferredSize(new Dimension(150, 50));
		this.lblQteSeuil.setFont(new Font("Serif", Font.BOLD, 18));
		this.lblImage = new JLabel("Image: ");
		this.lblImage.setPreferredSize(new Dimension(150, 50));
		this.lblImage.setFont(new Font("Serif", Font.BOLD, 18));
		this.lblDescription = new JLabel("Description: ");
		this.lblDescription.setPreferredSize(new Dimension(150, 50));
		this.lblDescription.setFont(new Font("Serif", Font.BOLD, 18));
		this.btEnregistrer = new JButton("Enregistrer");
		this.btEnregistrer.setFont(new Font("Serif", Font.BOLD, 18));
		this.btEnregistrer.setBackground(Color.gray);

		// creer des champs de saisie

		this.txtNoProduit = new JTextField(10);
		this.txtUPC = new JTextField(20);
		this.txtNom = new JTextField(20);
		this.txtQte = new JTextField(20);
		this.txtCategorie = new JTextField(20);
		this.txtType = new JTextField(20);
		this.txtPrixC = new JTextField(20);
		this.txtPrixV = new JTextField(20);
		this.txtQteSeuil = new JTextField(20);
		this.txtImage = new JTextField(20);
		// JTextArea txtDescription = new JTextArea("",5,30);
		this.txtDescription = new JTextArea(5, 20);
		JScrollPane scrollPane = new JScrollPane(txtDescription);
		// creer un panel pour chacun des attributs

		JPanel pNoProduit = new JPanel();
		pNoProduit.setBackground(Color.LIGHT_GRAY);
		JPanel pUPC = new JPanel();
		pUPC.setBackground(Color.LIGHT_GRAY);
		JPanel pNom = new JPanel();
		pNom.setBackground(Color.LIGHT_GRAY);
		JPanel pQte = new JPanel();
		pQte.setBackground(Color.LIGHT_GRAY);
		JPanel pCategorie = new JPanel();
		pCategorie.setBackground(Color.LIGHT_GRAY);
		JPanel pType = new JPanel();
		pType.setBackground(Color.LIGHT_GRAY);
		JPanel pPrixC = new JPanel();
		pPrixC.setBackground(Color.LIGHT_GRAY);
		JPanel pPrixV = new JPanel();
		pPrixV.setBackground(Color.LIGHT_GRAY);
		JPanel pQteSeuil = new JPanel();
		pQteSeuil.setBackground(Color.LIGHT_GRAY);
		JPanel pImage = new JPanel();
		pImage.setBackground(Color.LIGHT_GRAY);
		JPanel pDescription = new JPanel();
		pDescription.setBackground(Color.LIGHT_GRAY);
		JPanel pBoutons = new JPanel();

		// mettre chacun dans son panel

		pNoProduit.add(lblNoProduit);
		pNoProduit.add(txtNoProduit);
		pUPC.add(lblUPC);
		pUPC.add(txtUPC);
		pNom.add(lblNom);
		pNom.add(txtNom);
		pQte.add(lblQte);
		pQte.add(txtQte);
		pCategorie.add(lblCategorie);
		pCategorie.add(txtCategorie);
		pType.add(lblType);
		pType.add(txtType);
		pPrixC.add(lblPrixC);
		pPrixC.add(txtPrixC);
		pPrixV.add(lblPrixV);
		pPrixV.add(txtPrixV);
		pQteSeuil.add(lblQteSeuil);
		pQteSeuil.add(txtQteSeuil);
		pImage.add(lblImage);
		pImage.add(txtImage);
		pDescription.add(lblDescription);
		pDescription.add(scrollPane);
		pBoutons.add(btEnregistrer);

		// les placer dans le layout
		pBoutons.setAlignmentX(Component.LEFT_ALIGNMENT);
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		panel.setAlignmentX(RIGHT_ALIGNMENT);
		panel.add(pNoProduit);
		panel.add(pUPC);

		panel.add(pQte);

		panel.add(pType);
		panel.add(pPrixC);
		panel.add(pPrixV);
		panel.add(pQteSeuil);
		JPanel p = new JPanel();
		p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));
		p.setAlignmentX(LEFT_ALIGNMENT);
		p.add(pNom);
		p.add(pCategorie);
		p.add(pDescription);
		p.add(pImage);
		//p.add(pBoutons);

		JPanel c = new JPanel();

		c.setLayout(new BoxLayout(c, BoxLayout.X_AXIS));
		c.add(panel);
		c.add(p);
		c.add(pBoutons);
		add(c);
		// int result = JOptionPane.showConfirmDialog(null, panel,
		// "Please enter values.", JOptionPane.OK_CANCEL_OPTION);
		 btEnregistrer.addActionListener(new EcouteurBoutonProduit(viewController));
	}
}
class EcouteurBoutonProduit implements ActionListener {
	private ViewController viewController;
 public EcouteurBoutonProduit( ViewController viewController){
	this. viewController=viewController;
 }

 @Override
	public void actionPerformed(ActionEvent e){
		// TODO Auto-generated method stub
		
  if(((JButton)e.getSource()).getText().equals("Enregistrer")) {

	 // viewController.boutonEnregisterProduit();
		} 
 
	}
}
	


