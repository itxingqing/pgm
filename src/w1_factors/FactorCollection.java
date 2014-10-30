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
 * Description : Factorcollection is a collection of Factors
 * 
 * Date        : 2014 - October - 13
 * Author      : Arturo Alatriste Trujillo.
 ****************************************************************************/


package w1_factors;

import java.lang.Integer;
import java.util.*;
import java.util.ArrayList;

/**
 *
 * @author Arturo.Alatriste
 */
public class FactorCollection {
    ArrayList<Factor> factors;
    
    public FactorCollection(){
        factors = new ArrayList<Factor>();
    }

    public FactorCollection(ArrayList<Factor> factors){
        this.factors = factors;
    }
    
    public void add(Factor value){
        factors.add(value);
    }
    
    public void clear()
    {
        factors.clear();
    }
    
    public Factor get(int index){
        return factors.get(index);
    }

    public Factor getById(int id){
        for(Factor f : factors)
        {
            if (f.id == id)
            {
                return f;
            }
        }
        return null;
    }

    public Factor getByName(String name){
        for(Factor f : factors)
        {
            if ( f.name.equals(name) )
            {
                return f;
            }
        }
        return null;
    }
            
    public void set(int index, Factor value){
        factors.set(index, value);
    }
    
    public int size(){
        return factors.size();
    }

    /**
     * create a Sorted ArrayList with the id of all the factors of this collection
     * @return 
     */
    private ArrayList<Integer> getSortedIds()
    {
        try
        {
            ArrayList<Integer> ids = new ArrayList<Integer>();
       
            for(Factor f : factors )
            {
                ids.add( (Integer) f.getId() );
            }
            
            Collections.sort(ids, (Integer id1, Integer id2) -> (id1.compareTo(id2))  );
            return ids;
        }
        catch(Exception e)
        {
            System.out.println( e.getMessage() );
        }
        finally
        {}
        return null;
    }
    
    public int generateId() throws Exception
    {
        if (factors == null || factors.size() == 0)
        {return 0;}

        if ( factors.size() == Integer.MAX_VALUE )
        {
            throw new Exception( "No empty space. Delete some factors." );
        }

        ArrayList<Integer> ids = getSortedIds();
        
        if (ids == null)
        {
            return 0;
        }
        
        
        /**
         * find a free id between 0 and BiggestId.
         * if none is found, the id is incremented and 
         * get an id bigger than BiggestId.
         */
        int id=0;
        for(int i = 0; i < ids.size(); i++ )
        {
            if (id < i)
            {
                return id;
            }
            else if (id == i)
            {
                id++;
            }
        }
        return id;
        
    }
}
