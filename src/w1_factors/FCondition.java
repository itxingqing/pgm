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
import java.util.*;
/**
 *
 * @author Arturo.Alatriste
 */


//todo: Reduction - FCondition
public class FCondition {
    
    private String boolOperator  = "";
    private String varDecription = "";;
    private String relOperator   = "";;
    private ArrayList<String> values = new ArrayList<String>();
    
    
    public FCondition()
    {
    }
    
    public FCondition(String boolOperator,  String varDecription,
    String RelOperator, ArrayList<String> values    )
    {
        this.boolOperator = boolOperator;
        this.varDecription      = varDecription;
        this.relOperator  = RelOperator;
        this.values       = values;    
    }
    
    
    public String getBoolOperator()
    {
        return boolOperator;
    }
    
    public String getVarDecription()
    {
        return varDecription;
    }
    
    public String getRelOperator()
    {
        return relOperator;
    }
    
    public ArrayList<String> getValues()
    {
        return values;    
    }
    
    public String getValue()
    {
        if (values == null)
        {
            return null;
        }
        
        return values.get(0);
    }
    
    public boolean containValue(String value)
    {
        if ( values == null )
        {
            return false;
        }
        
        for( int i = 0; i < values.size(); i++ )
        {
            if ( value.equals( values.get(i) ) )
            {
                return true;
            };
        }
        return false;
    }
    
    public void setBoolOperator(String boolOperator)
    {
        this.boolOperator = boolOperator;
    }
    
    public void setvarDecription( String varDecription )
    {
        this.varDecription = varDecription;
    }
    
    public void setRelOperator(String relOperator)
    {
        this.relOperator  = relOperator;
    }
    
    public void setValues(ArrayList<String> values)
    {
        this.values       = values;    
    }

    public void setValues(String values)
    {
        String[] items = values.split( "," );
        
        if (this.values == null)
        {
            this.values = new ArrayList<String>();
        }
        
        for(String s: items)
        {
            this.values.add( s.trim().replace( ",", "" ) );
        }
    }
    
    public boolean isEmpty()
    {
        if ( boolOperator.equals ( "" ) &&
             varDecription.equals( "" ) &&
             relOperator.equals  ( "" ) &&
             values.size()== 0             )
        {
           return true;
        }
        
        return false;
    }

    
}
