/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metier;

import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Administrateur
 */
public class MonModelDeTable extends AbstractTableModel{
    private String[] columnNames = {"Nom Coureur","Prénom Coureur","Place","Temps"};
		private Object[][] data=new Object[5000][4];
    @Override
		public int getColumnCount()
		{
			return columnNames.length;
		}
    @Override
		public int getRowCount()
		{
			return data.length;
		}
    @Override
		public String getColumnName(int col)
		{
			return columnNames[col];
		}
    @Override
		public Object getValueAt(int row, int col)
		{
			return data[row][col];
		}
		
    @Override
		public boolean isCellEditable(int row, int col)
		{
			return (col < 0);
		}
    @Override
		public void setValueAt(Object value, int row, int col)
		{
			data[row][col] = value;
			fireTableCellUpdated(row,col);
                        fireTableDataChanged();
		}
                
                public void effaceTout()
                {
                    int i;
                    int j;
                    for(i = 0;i< data.length; i++)
                  {
                      for(j = 0; j<columnNames.length; j++)
                      {
                          data[i][j] = "";
                      }
                  }
        }
}
