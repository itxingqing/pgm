/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 **************************************************************************
 *    _____      ________________
 *   /  _  \    /  _  \__    ___/
 *  /  /_\  \  /  /_\  \|    |   
 * /    |    \/    |    \    |   
 * \____|__  /\____|__  /____|   
 *         \/         \/         
 * 
 * Description : Factor Product GUI.
 * 
 * Date        : 2014 - November - 3
 * Author      : Arturo Alatriste Trujillo.
 ****************************************************************************/


package w1_factors;

import java.util.ArrayList;
import javax.swing.event.EventListenerList;


/**
 *
 * @author ojodecocodrilo
 */
public class JFrameFactorProduct 
    extends javax.swing.JFrame 
    implements INewFactorHandler
{

    private FactorCollection factors;
    private int              id;
    private Factor           newFactor;
    protected ArrayList<FactorEventListener> listeners = new ArrayList<FactorEventListener> ();

    
    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
        this.txtId.setText( Integer.toString(id) );
    }

    public String getText()
    {
        return txtName.getText();
    }
    
    /*
    public javax.swing.JButton getBtnOK()
    {
        return btnOK;
    }
    
    public javax.swing.JButton getBtnCancel()
    {
        return btnCancel;
    }
    */

    public Factor getFactor1()
    {
        Factor f = factors.get( this.jComboBox_f1.getSelectedIndex() );
        return f;
    }

    public Factor getFactor2()
    {
        Factor f = factors.get( this.jComboBox_f2.getSelectedIndex() );
        return f;
    }
    
    public Factor getNewFactor()
    {
        return newFactor;
    }

    public JFrameFactorProduct() 
    {}    
    
    /**
     * Creates new form JFrameFactorProduct
     */
    public JFrameFactorProduct(FactorCollection factors) {
        initComponents();
        this.factors = factors;
        FillComboBoxes();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        btnOK = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jComboBox_f1 = new javax.swing.JComboBox();
        jComboBox_f2 = new javax.swing.JComboBox();
        lbl_f1 = new javax.swing.JLabel();
        lbl_f2 = new javax.swing.JLabel();
        lbl_Desc = new javax.swing.JLabel();
        jPanel_f3 = new javax.swing.JPanel();
        lbl_f3Id = new javax.swing.JLabel();
        lbl_f3Name = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();

        setTitle("Factor Product");

        jToolBar1.setRollover(true);

        btnOK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/w1_factors/icons/Check_48x48.png"))); // NOI18N
        btnOK.setToolTipText("OK");
        btnOK.setFocusable(false);
        btnOK.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnOK.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });
        jToolBar1.add(btnOK);

        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/w1_factors/icons/Cancel_48x48.png"))); // NOI18N
        btnCancel.setToolTipText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        jToolBar1.add(btnCancel);

        jComboBox_f1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox_f2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lbl_f1.setText("factor1");

        lbl_f2.setText("factor2");

        lbl_Desc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Desc.setText("factor1 * factor2 = factor3");
        lbl_Desc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jPanel_f3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "factor3", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 15))); // NOI18N
        jPanel_f3.setToolTipText("factor3");
        jPanel_f3.setName(""); // NOI18N

        lbl_f3Id.setText("Id");

        lbl_f3Name.setText("name");

        javax.swing.GroupLayout jPanel_f3Layout = new javax.swing.GroupLayout(jPanel_f3);
        jPanel_f3.setLayout(jPanel_f3Layout);
        jPanel_f3Layout.setHorizontalGroup(
            jPanel_f3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_f3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_f3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_f3Name)
                    .addComponent(lbl_f3Id, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel_f3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtId)
                    .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel_f3Layout.setVerticalGroup(
            jPanel_f3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_f3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_f3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_f3Id))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_f3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_f3Name))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel_f3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_f2)
                            .addComponent(lbl_f1))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox_f1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox_f2, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(lbl_Desc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox_f1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_f1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox_f2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_f2))
                .addGap(32, 32, 32)
                .addComponent(jPanel_f3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(lbl_Desc)
                .addGap(34, 34, 34))
        );

        jPanel_f3.getAccessibleContext().setAccessibleName("");
        jPanel_f3.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * initialize the vars and clean the gui
     */
    public void ini()
    {
        FillComboBoxes();
        this.txtId.setText( "" );
        this.txtName.setText( "" );
        newFactor = null;
    }
    
    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
        try
        {
            Factor f = createFactor();
            FactorCreated factorCreated = new FactorCreated(f);
            OnFactorCreated(factorCreated);
        }
        catch(Exception ex)
        {
            System.out.println( ex.getMessage() );
        }
        finally
        {}
        /*
        Factor factor3 = Factor.FactorProduct( 
                factors.get( jComboBox_f1.getSelectedIndex() ) , 
                factors.get( jComboBox_f1.getSelectedIndex() ) );
        
        newFactor = factor3;*/
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_btnOKActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    @Override
    public void addNewFactorListener(FactorEventListener listener) {
        listeners.add(listener);
    }

    @Override
    public void removeNewFactorListener(FactorEventListener listener) {
        listeners.remove(listener);
    }
    
    @Override
    public void OnFactorCreated( FactorCreated evt)
    {
        for(FactorEventListener h: listeners )
        {
            h.OnFactorCreated(evt);
        }
    }
    
    public Factor createFactor() throws Exception
    {
        try 
        {
            Factor f = Factor.FactorProduct( 
                    factors.get( jComboBox_f1.getSelectedIndex() ) , 
                    factors.get( jComboBox_f2.getSelectedIndex() ) );
            
            f.setId( this.getId() );
            f.setName( this.getName() );

            return f;
        } 
        catch (Exception ex) 
        {
            throw new Exception(ex);
        }
        finally
        {
            System.out.println( "end of New Factors" );
        }
    }    
    
    
    /**
     * Fill the ComboBoxes with the factor names
     */
    public void FillComboBoxes()
    {
        jComboBox_f1.removeAllItems();
        jComboBox_f2.removeAllItems();
        
        for( int i = 0; i < factors.size(); i++  )
        {
            jComboBox_f1.addItem(  factors.get(i).getName() );
            jComboBox_f2.addItem(  factors.get(i).getName() );
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrameFactorProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameFactorProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameFactorProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameFactorProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameFactorProduct().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnOK;
    private javax.swing.JComboBox jComboBox_f1;
    private javax.swing.JComboBox jComboBox_f2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_f3;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lbl_Desc;
    private javax.swing.JLabel lbl_f1;
    private javax.swing.JLabel lbl_f2;
    private javax.swing.JLabel lbl_f3Id;
    private javax.swing.JLabel lbl_f3Name;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
