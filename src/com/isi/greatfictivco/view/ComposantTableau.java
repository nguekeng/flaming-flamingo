package com.isi.greatfictivco.view;

import java.awt.Component;

import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class ComposantTableau extends DefaultTableCellRenderer{
	
	//permet d'afficher un JButton dans une JTable
	@Override
	public Component getTableCellRendererComponent(JTable table, Object value,
			boolean isSelected, boolean hasFocus, int row, int column) {
		// TODO Auto-generated method stub
		if(value instanceof JButton){
			return (JButton)value;
		}else{
			return this;
		}
	}

	
}
