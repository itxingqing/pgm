/*
 * To change this license header, choose License Headers in Project Properties.
 *
 *       ____________
 *      /\  ________ \       
 *     /  \ \______/\ \
 *    / /\ \ \  / /\ \ \     
 *   / / /\ \ \/ / /\ \ \
 *  / / /__\ \ \/_/__\_\ \
 * / /_/____\ \___________\
 * \ \ \____/ / ________/ /
 *  \ \ \  / / /\ \  / / / 
 *   \ \ \/ / /\ \ \/ / / 
 *    \ \/ / /__\_\/ / /
 *     \  / /______\/ /
 *      \/___________/       
 *
 * Description : JTablex Class. Useful Methods for JTable.
 * Date        : 2014 - July - 30
 * Author      : Arturo Alatriste Trujillo.
 ****************************************************************************/


package w1_factors;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author Arturo.Alatriste
 */
public class JTablex {

    
    public static void deleteRows(JTable table){
        DefaultTableModel dm = (DefaultTableModel) table.getModel();
        int rowCount=dm.getRowCount();
        for (int i = 0; i < rowCount; i++) {
            dm.removeRow(0);
        }
        dm.setRowCount( 0 );
    }

    
    public static void deleteColumns(JTable table){
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        TableColumn c = null;

        while( table.getColumnCount() > 0 )
        {
            c = table.getColumnModel().getColumn( 0 );
            table.getColumnModel().removeColumn(c);
        }
        model.setColumnCount(0);
    }

    
    public static void addColumns(JTable t, int columns)
    {
        DefaultTableModel model = (DefaultTableModel) t.getModel();
        int size = t.getColumnCount();
        
        for(int c = 0; c < columns; c++)
        {
            model.addColumn( "col " + (c + size ) );
        }
    }
    
    /**
     * 
     * you can call the function like this
     * suppose we have a table with 3 columns
     * insertRow( table, new Object[] { “eagle”, “tiger”, “shark” } );
     * 
     * @param table
     * @param rowData 
     */
    public static void addRow(JTable table, Object[] rowData ){
            DefaultTableModel dm = (DefaultTableModel) table.getModel();
            dm.addRow( rowData );
        }
    
    public static void addRow(JTable table ){
            DefaultTableModel dm = (DefaultTableModel) table.getModel();
            dm.addRow( new Object[ table.getColumnCount() ] );
        }    
    
    /**
     * 
     * @param table
     * @param rowData
     * @param numberOfRows The numbers of rows that will be added
     */
    public static void addRows(JTable table, Object[] rowData, int numberOfRows ){
        DefaultTableModel dm = (DefaultTableModel) table.getModel();
        for(int i=0; i< numberOfRows; i++ )
        {
            dm.addRow( rowData );
        }
    }

    public static void addRows(JTable table, int numberOfRows ){
        DefaultTableModel dm = (DefaultTableModel) table.getModel();
        
        for(int r=0; r< numberOfRows; r++ )
        {
            dm.addRow( new Object[ table.getColumnCount() ]  );
        }
    }

    public static void copyColumnsHeaders(JTable src, JTable tar)
    {
        for(int c = 0; c < src.getColumnCount(); c++)
        {
            tar.getColumnModel().getColumn(c).setHeaderValue(
                src.getColumnModel().getColumn(c).getHeaderValue() );
        }
    }
    
    public static void copy(JTable src, JTable tar)
    {
        DefaultTableModel srcModel = (DefaultTableModel) src.getModel();
        DefaultTableModel tarModel = (DefaultTableModel) tar.getModel();
        Object[] rowData ; 
        
        deleteRows( tar);
        tarModel.setColumnCount( src.getColumnCount() );
        copyColumnsHeaders(src, tar);
        
        if (src.getRowCount() == 0 )
        {   return; }
        
        //insert rows
        for(int r = 0; r < src.getRowCount(); r++)
        {
            rowData = new Object[ src.getColumnCount() ];
            for(int c=0; c < src.getColumnCount() ;c++)
            {
                rowData[c] = src.getValueAt(r, c);
            }
            tarModel.addRow( rowData  );
        }
    }
    

    
}
