package com.isi.greatfictivco.view;

import javax.swing.table.AbstractTableModel;

public class ModeleTableau extends AbstractTableModel{
	private Object[][] datas;
	private String[] titres;
	
	public ModeleTableau(Object[][]datas, String[]titres){
		this.datas = datas;
		this.titres = titres;
	}
	
	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return this.titres.length;
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return this.datas.length;
	}

	@Override
	public Object getValueAt(int row, int col) {
		// TODO Auto-generated method stub
		
		return this.datas[row][col];
	}
	
	public String getColumnName(int col){
		return this.titres[col];
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public Class getColumnClass(int col){
		return this.datas[0][col].getClass();
	}
	
	public boolean isCellEditable(int row, int col){//return true si on veut que les cellules soient éditables
		return false;
	}

}
