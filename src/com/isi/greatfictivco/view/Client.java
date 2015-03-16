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


public class Client extends Vue {
	private static final long serialVersionUID = 1L;
	private JLabel lblNoClient;
	private JLabel lblEntreprise;
	private JLabel lblNoEtRue;
	private JLabel lblVille;
	private JLabel lblProvince;
	private JLabel lblCodePostal;
	private JLabel lblNomClient;
	private JLabel lblTelephone;
	private JLabel lblDescription;
	private JButton btEnregistrer;

	private JTextField txtNoClient;
	private JTextField txtEntreprise;
	private JTextField txtNoEtRue;
	private JTextField txtVille;
	private JTextField txtProvince;
	private JTextField txtCodePostal;
	private JTextField txtNomClient;
	private JTextField txtTelephone;
	private JTextArea txtDescription;

	public Client(ViewController viewController) {
		super(viewController);
		addSearch(viewController);
		this.lblNoClient = new JLabel("#Client: ");
		this.lblNoClient.setPreferredSize(new Dimension(150, 50));
		this.lblNoClient.setFont(new Font("Serif", Font.BOLD, 18));

		this.lblEntreprise = new JLabel("Entreprise: ");
		this.lblEntreprise.setPreferredSize(new Dimension(150, 50));
		this.lblEntreprise.setFont(new Font("Serif", Font.BOLD, 18));

		this.lblNoEtRue = new JLabel("No et rue: ");
		this.lblNoEtRue.setPreferredSize(new Dimension(150, 50));
		this.lblNoEtRue.setFont(new Font("Serif", Font.BOLD, 18));

		this.lblVille = new JLabel("Ville: ");
		this.lblVille.setPreferredSize(new Dimension(150, 50));
		this.lblVille.setFont(new Font("Serif", Font.BOLD, 18));

		this.lblProvince = new JLabel("Province: ");
		this.lblProvince.setPreferredSize(new Dimension(150, 50));
		this.lblProvince.setFont(new Font("Serif", Font.BOLD, 18));

		this.lblCodePostal = new JLabel("Code postal: ");
		this.lblCodePostal.setPreferredSize(new Dimension(150, 50));
		this.lblCodePostal.setFont(new Font("Serif", Font.BOLD, 18));

		this.lblNomClient = new JLabel("Nom Client: ");
		this.lblNomClient.setPreferredSize(new Dimension(150, 50));
		this.lblNomClient.setFont(new Font("Serif", Font.BOLD, 18));

		this.lblTelephone = new JLabel("Téléphone: ");
		this.lblTelephone.setPreferredSize(new Dimension(150, 50));
		this.lblTelephone.setFont(new Font("Serif", Font.BOLD, 18));

		this.lblDescription = new JLabel("Description: ");
		this.lblDescription.setPreferredSize(new Dimension(150, 50));
		this.lblDescription.setFont(new Font("Serif", Font.BOLD, 18));

		this.btEnregistrer = new JButton("Enregistrer");
		this.btEnregistrer.setFont(new Font("Serif", Font.BOLD, 18));
		this.btEnregistrer.setBackground(Color.gray);

		// creer des champs de saisie

		this.txtNoClient = new JTextField(10);

		this.txtEntreprise = new JTextField(20);

		this.txtNoEtRue = new JTextField(20);

		this.txtVille = new JTextField(20);

		this.txtProvince = new JTextField(20);

		this.txtCodePostal = new JTextField(20);

		this.txtNomClient = new JTextField(20);

		this.txtTelephone = new JTextField(20);

		this.txtDescription = new JTextArea(5, 20);
		JScrollPane scrollPane = new JScrollPane(txtDescription);

		// creer un panel pour chacun des attributs

		JPanel pNoClient = new JPanel();
		pNoClient.setBackground(Color.LIGHT_GRAY);
		JPanel pEntreprise = new JPanel();
		pEntreprise.setBackground(Color.LIGHT_GRAY);
		JPanel pNoEtRue = new JPanel();
		pNoEtRue.setBackground(Color.LIGHT_GRAY);
		JPanel pVille = new JPanel();
		pVille.setBackground(Color.lightGray);
		JPanel pProvince = new JPanel();
		pProvince.setBackground(Color.LIGHT_GRAY);
		JPanel pCodePostal = new JPanel();
		pCodePostal.setBackground(Color.LIGHT_GRAY);
		JPanel pNomClient = new JPanel();
		pNomClient.setBackground(Color.LIGHT_GRAY);
		JPanel pTelephone = new JPanel();
		pTelephone.setBackground(Color.LIGHT_GRAY);
		JPanel pDescription = new JPanel();
		pDescription.setBackground(Color.LIGHT_GRAY);
		JPanel pBoutons = new JPanel();

		// mettre chacun dans son panel
		pBoutons.setAlignmentX(Component.LEFT_ALIGNMENT);
		
		pNoClient.add(lblNoClient);
		pNoClient.add(txtNoClient);
		pEntreprise.add(lblEntreprise);
		pEntreprise.add(txtEntreprise);
		pNoEtRue.add(lblNoEtRue);
		pNoEtRue.add(txtNoEtRue);
		pVille.add(lblVille);
		pVille.add(txtVille);
		pProvince.add(lblProvince);
		pProvince.add(txtProvince);
		pCodePostal.add(lblCodePostal);
		pCodePostal.add(txtCodePostal);
		pNomClient.add(lblNomClient);
		pNomClient.add(txtNomClient);
		pTelephone.add(lblTelephone);
		pTelephone.add(txtTelephone);
		pDescription.add(lblDescription);
		pDescription.add(scrollPane);
		pBoutons.add(btEnregistrer);

		// les placer dans le layout

		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		panel.setAlignmentX(RIGHT_ALIGNMENT);
		panel.add(pNoClient);
		panel.add(pNomClient);
		panel.add(pEntreprise);
		panel.add(pNoEtRue);
		panel.add(pVille);
		panel.add(pProvince);
		JPanel p = new JPanel();
		p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));
		p.setAlignmentX(LEFT_ALIGNMENT);
		p.add(pCodePostal);
		p.add(pTelephone);
		p.add(pDescription);
		
		JPanel c = new JPanel();

		c.setLayout(new BoxLayout(c, BoxLayout.X_AXIS));
		c.add(panel);
		c.add(p);
		c.add(pBoutons);
		add(c);
		// int result = JOptionPane.showConfirmDialog(null, panel,
		// "Please enter values.", JOptionPane.OK_CANCEL_OPTION);
		btEnregistrer.addActionListener(new EcouteurBouton(viewController));
	}
}

class EcouteurBouton implements ActionListener {
	private ViewController viewController;

	public EcouteurBouton(ViewController viewController) {
		this.viewController = viewController;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		if (((JButton) e.getSource()).getText().equals("Enregistrer")) {

			//viewController.enregisterClient();
		}

	}

}
