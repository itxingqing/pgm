/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package w1_factors;

import java.util.ArrayList;

/**
 *
 * @author Arturo.Alatriste
 */
public class FactorCollection {
    ArrayList<Factor> factors;
    
    public FactorCollection(){
    }

    public FactorCollection(ArrayList<Factor> factors){
        this.factors = factors;
    }
    
    public void add(Factor value){
        factors.add(value);
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
    
}
