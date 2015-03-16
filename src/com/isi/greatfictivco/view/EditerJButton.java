package com.isi.greatfictivco.view;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JTable;

@SuppressWarnings("serial")
public class EditerJButton extends DefaultCellEditor {
	protected JButton bouton;
	private Boolean isPushed;
	private EcouteurBoutonTableau ecouteurBoutonTableau; 
	
	
	public EditerJButton(JCheckBox checkBox, String action, String entite, ViewController viewController) {
		super(checkBox);
		
		ecouteurBoutonTableau = new EcouteurBoutonTableau(viewController, entite);
		bouton = new JButton();
		if(action.matches("modifier")){
			bouton.setText("modifier");
		}else if(action.matches("commander")){
			bouton.setText("commander");
		}
		
		bouton.addActionListener(ecouteurBoutonTableau);
	}

	@Override
	public Component getTableCellEditorComponent(JTable table, Object value,
			boolean isSelected, int row, int column) {

		ecouteurBoutonTableau.setRow(row);
		ecouteurBoutonTableau.setColumn(column);
		ecouteurBoutonTableau.setTable(table);
		bouton.setActionCommand(value.toString());
		bouton.setText("modifier");
		return bouton;
	}

}

class EcouteurBoutonTableau implements ActionListener {
	private int column;
	private int row;
	private JTable table;
	private ViewController viewController;
	private String entite;
	public EcouteurBoutonTableau(ViewController viewController, String entite){
		this.viewController = viewController;
		this.entite = entite;
	}

	public void setColumn(int col) {
		this.column = col;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public void setTable(JTable table) {
		this.table = table;
	}

	@Override
	public void actionPerformed(ActionEvent e) {//TODO ajouter action lorsque produit ou utilisateur...
		if(((JButton)e.getSource()).getText().matches("modifier")&& entite.matches("client")){
			//System.out.println(((JButton)e.getSource()).getActionCommand());
			viewController.afficherModificationClient();
		}
		

	}

}