/**
 **************************************************************************
 *    _____      ________________
 *   /  _  \    /  _  \__    ___/
 *  /  /_\  \  /  /_\  \|    |   
 * /    |    \/    |    \    |   
 * \____|__  /\____|__  /____|   
 *         \/         \/         
 * 
 * Description : JInternalFrame Factor is Dialog Frame GUI
 *               this object goes inside JFramefactors. 
 * 
 * Date        : 2014 - October - 13
 * Author      : Arturo Alatriste Trujillo.
 ****************************************************************************/



package w1_factors;

import java.awt.Dimension;
import javax.swing.*;
import javax.swing.JInternalFrame;
import javax.swing.JTable;

/**
 *
 * @author Arturo.Alatriste
 */
public class JifFactor extends JInternalFrame
{

    // private JDesktopPane   desktop;
    // private JInternalFrame frame;    
    private JTable      table;
    private JScrollPane jScrollPane1;    
    
    
    public JifFactor()
    {
        CreateComponents();
    }
    
    public JifFactor(String title)
    {
        CreateComponents();
        setTitle( title );
    }

    //todo. Autoresize Table.
    
    private void CreateComponents()
    {
        //jDesktopPane1 = new javax.swing.JDesktopPane();
        //jInternalFrame1 = new javax.swing.JInternalFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        //jInternalFrame1.setVisible(true);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(table);

        //javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        //jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        
        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout( this.getContentPane() );
        this.getContentPane().setLayout(jInternalFrame1Layout);
        
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
        );

        //javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        /*
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(364, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(363, Short.MAX_VALUE))
        );
        jDesktopPane1.setLayer(jInternalFrame1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        */

        /*
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    */
        setIconifiable(true);
        setMaximizable(true);
        setAutoscrolls(true);
        setVisible(true);
        try
        {
            this.setIcon(false);
            this.setMaximum(true);
            this.setSelected(true);
        }
        catch(Exception e)
        {
        System.out.println( e.getMessage() );
        }
        
        this.setPreferredSize(new Dimension(200,200) );
        this.setBounds(0, 0, 200, 200);
        
        this.show();
        
        this.repaint();    
        
    }
    
    
/*    public JDesktopPane getDesktop()
    {
        return desktop;
    }*/
    
    /*public JInternalFrame getFrame() 
    {
        return frame;    
    }*/
    
    public JTable getTable()
    {
        return table;
    }
    
}
