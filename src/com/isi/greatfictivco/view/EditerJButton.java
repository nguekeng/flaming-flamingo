package com.isi.greatfictivco.view;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JTable;

public class EditerJButton extends DefaultCellEditor {
	protected JButton bouton;
	private Boolean isPushed;
	private EcouteurBoutonTableau ecouteurBoutonTableau = new EcouteurBoutonTableau();

	public EditerJButton(JCheckBox checkBox) {
		super(checkBox);
		bouton = new JButton();
		bouton.addActionListener(ecouteurBoutonTableau);
	}

	@Override
	public Component getTableCellEditorComponent(JTable table, Object value,
			boolean isSelected, int row, int column) {

		ecouteurBoutonTableau.setRow(row);
		ecouteurBoutonTableau.setColumn(column);
		ecouteurBoutonTableau.setTable(table);
		return bouton;
	}

}

class EcouteurBoutonTableau implements ActionListener {
	private int column;
	private int row;
	private JTable table;

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
	public void actionPerformed(ActionEvent e) {
		System.out.println(((JButton)e.getSource()).getText());

	}

}