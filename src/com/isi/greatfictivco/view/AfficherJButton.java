package com.isi.greatfictivco.view;

import java.awt.Component;

import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

public class AfficherJButton extends JButton implements TableCellRenderer{

	@Override
	public Component getTableCellRendererComponent(JTable table, Object value,
			boolean isSelected, boolean isFocus, int row, int col) {
		setText((value!=null)? value.toString(): "");
		return this;
	}

}
