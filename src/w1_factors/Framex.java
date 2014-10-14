/**
 **************************************************************************
 *    _____      ________________
 *   /  _  \    /  _  \__    ___/
 *  /  /_\  \  /  /_\  \|    |   
 * /    |    \/    |    \    |   
 * \____|__  /\____|__  /____|   
 *         \/         \/         
 * 
 * Description : Class for JDesktop and JInternalFrame, 
 *               specially visual organize in
 *                  cascade, tile, minimize or maximize all.
 * 
 * Date        : 2014 - October - 8
 * Author      : Arturo Alatriste Trujillo.
 ****************************************************************************/




package w1_factors;

import javax.swing.*;
import javax.swing.JInternalFrame;

/**
 *
 * @author Arturo.Alatriste
 */
public class Framex {
    

    /**
     * This method minimzes all the frames in desktop 
     * @param desktop JDesktopPane
     */
    public static void minimize(JDesktopPane desktop ) {                                             
        for ( JInternalFrame f : desktop.getAllFrames() )
        {
            try
            {
                f.setMaximum(false);
                f.setIcon( true );
                f.repaint();
            }
            catch(Exception e)
            {
               System.out.println( e.getMessage() );
            }
            finally
            {}
        }        
        desktop.repaint();

    }                                            

    /**
     * This method maximizes all the frames in desktop 
     * @param desktop JDesktopPane
     */
    public static void maximize(JDesktopPane desktop) {                                             
        for ( JInternalFrame f : desktop.getAllFrames() )
        {
            try
            {
                f.setIcon( true );
                f.setMaximum(true);
                f.repaint();
            }
            catch(Exception e)
            {
               System.out.println( e.getMessage() );
            }
            finally
            {}
        }    
        desktop.repaint();
    }                                            

    /**
     * This method cascade from Right to Top the frames in desktop. 
     * @param desktop JDesktopPane
     * @param border int. The space increment between frames.
     */
    public static void cascadert(JDesktopPane desktop, int border)
    {
        int n=0; // number of open frames
        for ( JInternalFrame f : desktop.getAllFrames() )
        {
            if ( f.isIcon() == false )
            {
                n++;
            }
        }
        if (n == 0) return;
        
        int w = desktop.getWidth()  - border * (n-1);
        int h = desktop.getHeight() - border * (n-1);
        int x = border * n;
        int y = 0 - border;
        
        for ( JInternalFrame f : desktop.getAllFrames() )
        {
            try
            {
                if ( f.isIcon() == true )
                {
                    continue;
                }
                x -= border;
                y += border;
                f.setIcon( false );
                f.setMaximum(false);
                f.reshape(x, y, w, h);
            }
            catch(Exception e)
            {
               System.out.println( e.getMessage() );
            }
            finally
            {}
        }    
    }
    
    /**
     * 
     * This method cascade from Left to Bottom the frames in desktop. 
     * @param desktop JDesktopPane
     * @param border int. The space increment between frames.
     */
    public static void cascadelb(JDesktopPane desktop, int border)
    {
        int n=0; // number of open frames
        for ( JInternalFrame f : desktop.getAllFrames() )
        {
            if ( f.isIcon() == false )
            {
                n++;
            }
        }
        if (n == 0) return;
        
        int w = desktop.getWidth()  - border * (n-1);
        int h = desktop.getHeight() - border * (n-1);
        
        int x = 0 - border;
        int y = border * n;
        
        for ( JInternalFrame f : desktop.getAllFrames() )
        {
            try
            {
                if ( f.isIcon() == true )
                {
                    continue;
                }
                x += border;
                y -= border;
                f.setIcon( false );
                f.setMaximum(false);
                f.reshape(x, y, w, h);
            }
            catch(Exception e)
            {
               System.out.println( e.getMessage() );
            }
            finally
            {}
        }    
    }
    
    /**
     * This method cascade from Right to Bottom the frames in desktop. 
     * @param desktop JDesktopPane
     * @param border int. The space increment between frames.

     */
    public static void cascaderb(JDesktopPane desktop, int border)
    {
        int n=0; // number of open frames
        for ( JInternalFrame f : desktop.getAllFrames() )
        {
            if ( f.isIcon() == false )
            {
                n++;
            }
        }
        if (n == 0) return;
        
        int w = desktop.getWidth()  - border * (n-1);
        int h = desktop.getHeight() - border * (n-1);
        
        int x = border * n;
        int y = border * n;
        
        for ( JInternalFrame f : desktop.getAllFrames() )
        {
            try
            {
                if ( f.isIcon() == true )
                {
                    continue;
                }
                x -= border;
                y -= border;
                
                f.setIcon( false );
                f.setMaximum(false);
                f.reshape(x, y, w, h);
            }
            catch(Exception e)
            {
               System.out.println( e.getMessage() );
            }
            finally
            {}
        }    
    }
    
    /**
     * This method cascade from Left to Top the frames in desktop. 
     * @param desktop JDesktopPane
     * @param border int. The space increment between frames.
     */
    public static void cascadelt(JDesktopPane desktop, int border)
    {
        int n=0; // number of open frames
        for ( JInternalFrame f : desktop.getAllFrames() )
        {
            if ( f.isIcon() == false )
            {
                n++;
            }
        }
        if (n == 0) return;
        
        int w = desktop.getWidth()  - border * (n-1);
        int h = desktop.getHeight() - border * (n-1);
        
        int x = 0 - border;
        int y = 0 - border;
        
        for ( JInternalFrame f : desktop.getAllFrames() )
        {
            try
            {
                if ( f.isIcon() == true )
                {
                    continue;
                }
                x += border;
                y += border;
                
                f.setIcon( false );
                f.setMaximum(false);
                f.reshape(x, y, w, h);
            }
            catch(Exception e)
            {
               System.out.println( e.getMessage() );
            }
            finally
            {}
        }    
    }
    
    /**
     * Tile horizontally the frames in desktop.
     * @param desktop JDesktopPane
     */
    public static void tileHor(JDesktopPane desktop)
    {
        int n=0; // number of open frames
        for ( JInternalFrame f : desktop.getAllFrames() )
        {
            if ( f.isIcon() == false )
            {
                n++;
            }
        }
        if (n == 0) return;
        
        int w = desktop.getWidth();
        int h = desktop.getHeight() / n;
        int x = 0;
        int y = 0 - h;
        
        for ( JInternalFrame f : desktop.getAllFrames() )
        {
            try
            {
                if ( f.isIcon() == true )
                {
                    continue;
                }
                y += h;
                
                f.setIcon( false );
                f.setMaximum(false);
                f.reshape(x, y, w, h);
            }
            catch(Exception e)
            {
               System.out.println( e.getMessage() );
            }
            finally
            {}
        }
    }
    
    /**
     * Tile vertically the frames in desktop.
     * @param desktop JDesktopPane
     */
    public static void tileVer(JDesktopPane desktop)
    {
        int n=0; // number of open frames
        for ( JInternalFrame f : desktop.getAllFrames() )
        {
            if ( f.isIcon() == false )
            {
                n++;
            }
        }
        if (n == 0) return;
        
        int w = desktop.getWidth() / n;
        int h = desktop.getHeight();
        int x = 0 - w;
        int y = 0;
        
        for ( JInternalFrame f : desktop.getAllFrames() )
        {
            try
            {
                if ( f.isIcon() == true )
                {
                    continue;
                }
                x += w;
                
                f.setIcon( false );
                f.setMaximum(false);
                f.reshape(x, y, w, h);
            }
            catch(Exception e)
            {
               System.out.println( e.getMessage() );
            }
            finally
            {}
        }
    }
    
    
    public static void tileSqr(JDesktopPane desktop)
    {
        int n=0; // number of open frames
        for ( JInternalFrame f : desktop.getAllFrames() )
        {
            if ( f.isIcon() == false )
            {
                n++;
            }
        }
        if (n == 0) return;
        
        int k = (int) Math.ceil( Math.sqrt( n ) );
        int w = desktop.getWidth()  / k;
        int h = desktop.getHeight() / k;
        int x = 0 - w;
        int y = 0;
        int i = 0;
        
        for ( JInternalFrame f : desktop.getAllFrames() )
        {
            try
            {
                if ( f.isIcon() == true )
                {
                    continue;
                }
                
                if (i < k)
                {
                    x += w;
                    i++;
                }
                else
                {
                    x  = 0;
                    y += h;
                    i  = 1;
                }
                
                f.setIcon( false );
                f.setMaximum(false);
                f.reshape(x, y, w, h);
            }
            catch(Exception e)
            {
               System.out.println( e.getMessage() );
            }
            finally
            {}
        }                
    }
}
