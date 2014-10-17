/*****************************************************************************
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
 * Description : GUI for Factors and Random variables
 * Date        : 2014 - July - 23
 * Author      : Arturo Alatriste Trujillo.
 *****************************************************************************/

package w1_factors;

import java.awt.Dimension;
import java.util.*;
import javax.swing.JTable;
import javax.swing.event.TreeSelectionListener;
import javax.swing.table.DefaultTableModel;

import javax.swing.tree.TreePath;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeSelectionModel;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;

/**
 *
 * @author Arturo.Alatriste
 */
public class JFrameMain extends javax.swing.JFrame {
    
    //public ArrayList<RandomVar> vars    = new ArrayList<RandomVar>();
    public RandomVarCollection vars    = new RandomVarCollection();
    //public ArrayList<Factor>    factors = new ArrayList<Factor>();
    public FactorCollection    factors = new FactorCollection();
    
    JFrame_RndVars frameRndVars;
    JFrameFactors  frameFactors;
    
    /**
     * Creates new form JFrameMain
     */
    public JFrameMain() {
        initComponents();
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
        jButton_RndVars = new javax.swing.JButton();
        jButton_Factors = new javax.swing.JButton();
        jSplitPane1 = new javax.swing.JSplitPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        solExplorer = new javax.swing.JTree();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setRollover(true);

        jButton_RndVars.setText("Random Vars");
        jButton_RndVars.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_RndVars.setFocusable(false);
        jButton_RndVars.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_RndVars.setMaximumSize(new java.awt.Dimension(100, 50));
        jButton_RndVars.setMinimumSize(new java.awt.Dimension(100, 50));
        jButton_RndVars.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton_RndVars.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_RndVarsActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton_RndVars);

        jButton_Factors.setText("Factors");
        jButton_Factors.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_Factors.setFocusable(false);
        jButton_Factors.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_Factors.setMaximumSize(new java.awt.Dimension(100, 50));
        jButton_Factors.setMinimumSize(new java.awt.Dimension(100, 50));
        jButton_Factors.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton_Factors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_FactorsActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton_Factors);

        jSplitPane1.setDividerLocation(200);

        jScrollPane1.setMinimumSize(new java.awt.Dimension(100, 23));

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Solution");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("RandomVars");
        javax.swing.tree.DefaultMutableTreeNode treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Difficulty");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Intelligence");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("SAT");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Grade");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Letter");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Factors");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("factorA");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("factorB");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("factorCl");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("factorD");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Graph");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Nodes");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Edges");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Template");
        javax.swing.tree.DefaultMutableTreeNode treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("backgroud");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("node");
        javax.swing.tree.DefaultMutableTreeNode treeNode5 = new javax.swing.tree.DefaultMutableTreeNode("background");
        treeNode4.add(treeNode5);
        treeNode5 = new javax.swing.tree.DefaultMutableTreeNode("with");
        treeNode4.add(treeNode5);
        treeNode5 = new javax.swing.tree.DefaultMutableTreeNode("height");
        treeNode4.add(treeNode5);
        treeNode5 = new javax.swing.tree.DefaultMutableTreeNode("font");
        javax.swing.tree.DefaultMutableTreeNode treeNode6 = new javax.swing.tree.DefaultMutableTreeNode("color");
        treeNode5.add(treeNode6);
        treeNode6 = new javax.swing.tree.DefaultMutableTreeNode("size");
        treeNode5.add(treeNode6);
        treeNode6 = new javax.swing.tree.DefaultMutableTreeNode("font");
        treeNode5.add(treeNode6);
        treeNode6 = new javax.swing.tree.DefaultMutableTreeNode("style");
        treeNode5.add(treeNode6);
        treeNode4.add(treeNode5);
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("nodeSelected");
        treeNode5 = new javax.swing.tree.DefaultMutableTreeNode("background");
        treeNode4.add(treeNode5);
        treeNode5 = new javax.swing.tree.DefaultMutableTreeNode("with");
        treeNode4.add(treeNode5);
        treeNode5 = new javax.swing.tree.DefaultMutableTreeNode("height");
        treeNode4.add(treeNode5);
        treeNode5 = new javax.swing.tree.DefaultMutableTreeNode("font");
        treeNode6 = new javax.swing.tree.DefaultMutableTreeNode("color");
        treeNode5.add(treeNode6);
        treeNode6 = new javax.swing.tree.DefaultMutableTreeNode("size");
        treeNode5.add(treeNode6);
        treeNode6 = new javax.swing.tree.DefaultMutableTreeNode("font");
        treeNode5.add(treeNode6);
        treeNode6 = new javax.swing.tree.DefaultMutableTreeNode("style");
        treeNode5.add(treeNode6);
        treeNode4.add(treeNode5);
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("edge");
        treeNode5 = new javax.swing.tree.DefaultMutableTreeNode("color");
        treeNode4.add(treeNode5);
        treeNode5 = new javax.swing.tree.DefaultMutableTreeNode("thickness");
        treeNode4.add(treeNode5);
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("edgeSelected");
        treeNode5 = new javax.swing.tree.DefaultMutableTreeNode("color");
        treeNode4.add(treeNode5);
        treeNode5 = new javax.swing.tree.DefaultMutableTreeNode("thickness");
        treeNode4.add(treeNode5);
        treeNode3.add(treeNode4);
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        solExplorer.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        solExplorer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                solExplorerMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(solExplorer);

        jSplitPane1.setLeftComponent(jScrollPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(353, Short.MAX_VALUE))
            .addComponent(jSplitPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_RndVarsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RndVarsActionPerformed
        callRandoVarsFrame();
    }//GEN-LAST:event_jButton_RndVarsActionPerformed

    private void jButton_FactorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_FactorsActionPerformed
        if ( frameFactors == null)
        {
            frameFactors = new JFrameFactors(vars, factors);
        }
        frameFactors.setVisible(true);
    }//GEN-LAST:event_jButton_FactorsActionPerformed

    private void solExplorerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_solExplorerMouseClicked

        DefaultMutableTreeNode node = (DefaultMutableTreeNode) solExplorer.getLastSelectedPathComponent();
        if (node == null)
        {
            return;
        }
        
        if( evt.getClickCount() == 1 ) 
        {
            //mySingleClick(selRow, selPath);
        }
        else if( evt.getClickCount() == 2 ) 
        {
            solExplorerDoubleClick( node );
        }
    }//GEN-LAST:event_solExplorerMouseClicked

    private void solExplorerDoubleClick(DefaultMutableTreeNode node)
    {
        switch( node.getUserObject().toString() )
        {
            case "RandomVars": callRandoVarsFrame(); break;
                
            case "Factors"   : callFactorsFrame();   break;
        }
    }
  
    private void callRandoVarsFrame()
    {
        if (frameRndVars == null)
        {
            frameRndVars = new JFrame_RndVars(vars );
        }
        frameRndVars.setVisible(true);    
    }
    
    private void callFactorsFrame()
    {
        if ( frameFactors == null)
        {
            frameFactors = new JFrameFactors(vars, factors);
        }
        frameFactors.setVisible(true);        
    }
    
    
    /**
     * Create and Initialize the lists of Random variables.
     */
    public void iniVars(){
        vars.clear();
        factors.clear();
        
        RandomVar v1 = new RandomVar(1, "v1", "Difficulty"  , new String[] { "easy"          , "hard"               });
        RandomVar v2 = new RandomVar(2, "v2", "Intelligence", new String[] { "low"           , "brilliant"          });
        RandomVar v3 = new RandomVar(3, "v3", "Grade"       , new String[] { "A"             , "B"          , "C"   });
        RandomVar v4 = new RandomVar(4, "v4", "Sat"         , new String[] { "excellent"     , "good"       , "bad" });
        RandomVar v5 = new RandomVar(5, "v5", "Letter"      , new String[] { "recommendation", "ignored"            });
        vars.add( v1 );
        vars.add( v2 );
        vars.add( v3 );
        vars.add( v4 );
        vars.add( v5 );
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
            java.util.logging.Logger.getLogger(JFrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new JFrameMain().setVisible(true);
                
                JFrameMain f = new JFrameMain();
                f.setVisible(true);
                
                Dimension d =  f.getSize();
                
                
                

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Factors;
    private javax.swing.JButton jButton_RndVars;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTree solExplorer;
    // End of variables declaration//GEN-END:variables
}
