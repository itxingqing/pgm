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

import javax.swing.*;
import javax.swing.JInternalFrame;
import javax.swing.JTable;

/**
 *
 * @author Arturo.Alatriste
 */
public class JifFactor extends JInternalFrame
{

    private JDesktopPane   desktop;
    private JInternalFrame frame;    
    private JTable         table;
    
    
    
    public JifFactor()
    {
        CreateComponents();
    }
    
    public JifFactor(String title)
    {
        CreateComponents();
        setTitle( title );
    }
            
    private void CreateComponents()
    {
        table   = new JTable();
        frame   = new JInternalFrame();
        desktop = new JDesktopPane();
    
        frame.add( table );
        desktop.add(frame);
    
        frame.repaint();
        desktop.repaint();
        
        setIconifiable(true);
        setMaximizable(true);
        setAutoscrolls(true);
        setVisible(true);
    
    }
    
    
    public JDesktopPane getDesktop()
    {
        return desktop;
    }
    
    public JInternalFrame getFrame() 
    {
        return frame;    
    }
    
    public JTable getTable()
    {
        return table;
    }
    
}
