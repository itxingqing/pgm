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
import java.util.ArrayList;

/**
 *
 * @author Arturo.Alatriste
 */

//todo: Reduction - FEvaluator
public class FEvaluator {
    
    private ArrayList<FCondition> conditions;
    
    private Hashtable<String, String> values;

    //constructor
    public FEvaluator( )
    {
        conditions = new ArrayList<FCondition>();
    }
    
    
    public void CleanConditions()
    {
        conditions.clear();
    }
    
    public boolean Evaluate()
    {
        boolean result = true;
        boolean b      = true;
        FCondition c;
        
        try
        {
            for( int i = 0; i < conditions.size(); i++ )
            {
                c = conditions.get( i );

                // relational operator
                switch( c.getRelOperator() )
                {
                    case "="  : b = c.getValue().equals( values.get( c.getVarDecription() ) ) ; 
                                break;

                    case "!=" : b = !c.getValue().equals( values.get( c.getVarDecription() ) ) ; 
                                break;

                    case "in" : b = c.containValue( values.get( c.getVarDecription() ) );
                                break;

                    case "not in" : b = !c.containValue( values.get( c.getVarDecription() ) );
                                break;                    

                    case ">"  : break;
                    case "<"  : break;
                    case ">="  : break;
                    case "<="  : break;
                }
            
                if ( i == 0 )
                {
                    result = b;
                }
                else 
                {
                    switch( c.getBoolOperator() )
                    {
                        case "AND" : result = result && b; break;
                        case "OR"  : result = result || b; break;
                    }
                }
            }
        
        }
        catch(Exception e)
        {
            System.out.println( e.getMessage() );
        }
        finally
        {}
        
        return result;
    }

    public void addCondition( FCondition condition )
    {
        this.conditions.add(condition);
    }
    
    public ArrayList<FCondition> getConditions()
    {
        return this.conditions;
    }
    
    public int getConditionsCount()
    {
        if (this.conditions == null)
        {
            return 0;
        }
        
        return this.conditions.size();
    }
    
    
    public void setConditions( ArrayList<FCondition> conditions )
    {
        this.conditions = conditions;
    }

    public void setValues( Hashtable<String, String> values )
    {
        this.values = values;
    }
    
    
}
