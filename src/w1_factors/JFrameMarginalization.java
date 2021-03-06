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
 * Description : 
 * 
 * Date        : 2015 - January - 20
 * Author      : Arturo Alatriste Trujillo.
 ****************************************************************************/


package w1_factors;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.DropMode;

/**
 *
 * @author ojodecocodrilo
 */
public class JFrameMarginalization 
    extends javax.swing.JFrame 
    implements INewFactorHandler
{
    private FactorCollection factors;
    //private Factor           factor;
    private RandomVarCollection vars;
    private int id;

    private DefaultListModel availableVarsModel = new DefaultListModel();
    private DefaultListModel includedVarsModel  = new DefaultListModel();

    //protected EventListenerList listeners = new EventListenerList();
    protected ArrayList<FactorEventListener> listeners = new ArrayList<FactorEventListener> ();
    //protected EventListenerList listenerList = new EventListenerList();
    

    /**
     * Creates new form JFrameMarginalization
     */
    public JFrameMarginalization() {
        initComponents();
    }
    
    public JFrameMarginalization(FactorCollection factors) {
        initComponents();
        this.factors = factors;
        ini();
    }    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        availableVars = new javax.swing.JList();
        btnLeftAll = new javax.swing.JButton();
        btnLeft = new javax.swing.JButton();
        btnRight = new javax.swing.JButton();
        btnRightAll = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        includedVars = new javax.swing.JList();
        jLabel_templateFactor = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jToolBar1 = new javax.swing.JToolBar();
        btnOK = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();

        setTitle("Marginalization");

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setForeground(new java.awt.Color(102, 153, 255));

        jLabel1.setText("id");

        jLabel2.setText("Name");

        availableVars.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        availableVars.setDragEnabled(true);
        jScrollPane1.setViewportView(availableVars);

        btnLeftAll.setIcon(new javax.swing.ImageIcon(getClass().getResource("/w1_factors/icons/Actions-arrow-left-double-icon.png"))); // NOI18N
        btnLeftAll.setToolTipText("Move all to left");
        btnLeftAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLeftAllActionPerformed(evt);
            }
        });

        btnLeft.setIcon(new javax.swing.ImageIcon(getClass().getResource("/w1_factors/icons/Actions-arrow-left-icon.png"))); // NOI18N
        btnLeft.setToolTipText("move selected vars to left");
        btnLeft.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLeftActionPerformed(evt);
            }
        });

        btnRight.setIcon(new javax.swing.ImageIcon(getClass().getResource("/w1_factors/icons/Actions-arrow-right-icon.png"))); // NOI18N
        btnRight.setToolTipText("move selected vars to right");
        btnRight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRightActionPerformed(evt);
            }
        });

        btnRightAll.setIcon(new javax.swing.ImageIcon(getClass().getResource("/w1_factors/icons/Actions-arrow-right-double-icon.png"))); // NOI18N
        btnRightAll.setToolTipText("move all to right");
        btnRightAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRightAllActionPerformed(evt);
            }
        });

        txtName.setText("NewFactor");

        jLabel3.setText("Available vars");

        jLabel4.setText("Include these vars");

        includedVars.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        includedVars.setDragEnabled(true);
        jScrollPane2.setViewportView(includedVars);

        jLabel_templateFactor.setText("template factor");
        jLabel_templateFactor.setName(""); // NOI18N

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtName)
                            .addComponent(txtId)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnLeftAll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRightAll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnLeft, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel_templateFactor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_templateFactor)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnLeftAll)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLeft)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRight)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRightAll))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );

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
        btnCancel.setFocusable(false);
        btnCancel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        jToolBar1.add(btnCancel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_btnOKActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnLeftAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLeftAllActionPerformed

        for(int i=0; i < includedVarsModel.size() ;i++)
        {
            availableVarsModel.addElement( includedVarsModel.getElementAt(i) );
        }
        includedVarsModel.removeAllElements();
    }//GEN-LAST:event_btnLeftAllActionPerformed

    private void btnLeftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLeftActionPerformed
        for(int i: includedVars.getSelectedIndices() )
        {
            availableVarsModel.addElement( includedVarsModel.getElementAt(i) );
        }
        int[] selectedIndices = includedVars.getSelectedIndices();
        for(int i = selectedIndices.length - 1; i >= 0 ; i-- )
        {
            includedVarsModel.remove( selectedIndices[ i ] );
        }
    }//GEN-LAST:event_btnLeftActionPerformed

    private void btnRightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRightActionPerformed
        for(int i: availableVars.getSelectedIndices() )
        {
            includedVarsModel.addElement( availableVarsModel.getElementAt(i) );
        }
        int[] selectedIndices = availableVars.getSelectedIndices();
        for(int i = selectedIndices.length - 1; i >= 0 ; i-- )
        {
            availableVarsModel.remove( selectedIndices[ i ] );
        }
    }//GEN-LAST:event_btnRightActionPerformed

    private void btnRightAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRightAllActionPerformed
        for(int i=0; i < availableVarsModel.size() ;i++)
        {
            includedVarsModel.addElement( availableVarsModel.getElementAt(i) );
        }
        availableVarsModel.removeAllElements();
    }//GEN-LAST:event_btnRightAllActionPerformed

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        this.FillVarsListBox();
    }//GEN-LAST:event_jComboBox1ItemStateChanged


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

    public ArrayList<String> getincludedVars()
    {
        if (includedVarsModel.size() == 0)
        {
            return null;
        }
                
        ArrayList<String> arrayList = new ArrayList<String> ();
        for(int i=0; i < includedVarsModel.size(); i++)
        {
            arrayList.add( includedVarsModel.get(i).toString() );
        }
        return arrayList;
    }
    
    public DefaultListModel getincludedVarsModel()
    {
        return includedVarsModel;
    }
    
    
    @Override
    public void addNewFactorListener(FactorEventListener listener) {
        listeners.add(listener);
      //listenerList.add(FactorEventListener.class, listener);
    }

    @Override
    public void removeNewFactorListener(FactorEventListener listener) {
        listeners.remove(listener);
      //listenerList.remove(FactorEventListener.class, listener);
    }
    
    @Override
    public void OnFactorCreated( FactorCreated evt)
    {
        for(FactorEventListener h: listeners )
        {
            h.OnFactorCreated(evt);
        }
    }
    
    
    public void ini()
    {
        FillComboBox();
        this.txtId.setText( "" );
        this.txtName.setText( "" );

        this.availableVars.setDragEnabled(true);
        this.includedVars.setDragEnabled(true);
        
        this.availableVars.setDropMode( DropMode.ON_OR_INSERT );
        this.includedVars.setDropMode( DropMode.ON_OR_INSERT );
        
        availableVars.setTransferHandler( new ListTransferHandler() );
        includedVars .setTransferHandler( new ListTransferHandler() );
    }
    
    
    
    public Factor createFactor() throws Exception
    {
        try 
        {
            Factor f = new Factor( this.getId(), this.getText() );

            for(String s: this.getincludedVars() )
            {
                f.getVars().add( vars.getByDescription(s) );
            }
            f.FillTable();
            return f;
        } 
        catch (Exception ex) 
        {
            Logger.getLogger(JFrameFactors.class.getName()).log(Level.SEVERE, null, ex);
            throw new Exception(ex);
        }
        finally
        {
            System.out.println( "end of New Factors" );
        }
    }    

    public void FillComboBox()
    {
        jComboBox1.removeAllItems();
        
        for( int i = 0; i < factors.size(); i++  )
        {
            jComboBox1.addItem(  factors.get(i).getName() );
        }
    }
    
    private void FillVarsListBox()
    {
        try
        {
            // clean Lists
            availableVarsModel.removeAllElements();
            includedVarsModel.removeAllElements();
            availableVars.setModel( availableVarsModel );
            includedVars.setModel ( includedVarsModel  );        

            //get selected factor
            //Factor f = factors.get( jComboBox1.getSelectedIndex() );
            
            Factor f = factors.getByName( jComboBox1.getSelectedItem().toString() );
            
            vars = f.getVars();

            if( vars == null || vars.size() == 0 )
            {
                return;
            }

            //RandomVar v;
            for(int i=0; i < vars.size() ;i++)
            {
                availableVarsModel.addElement( vars.get(i).getDescription() );
            }
            availableVars.repaint();
            this.repaint();
        }
        catch(Exception e)
        {
            System.out.println( e.getMessage() );
        }
        finally
        {}
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
            java.util.logging.Logger.getLogger(JFrameMarginalization.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameMarginalization.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameMarginalization.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameMarginalization.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameMarginalization().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList availableVars;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnLeft;
    private javax.swing.JButton btnLeftAll;
    private javax.swing.JButton btnOK;
    private javax.swing.JButton btnRight;
    private javax.swing.JButton btnRightAll;
    private javax.swing.JList includedVars;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel_templateFactor;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
