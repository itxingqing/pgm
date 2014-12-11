/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package w1_factors;

import java.util.EventObject;

/**
 *
 * @author ojodecocodrilo
 */
public class FactorCreated extends EventObject
{
    public Factor f;
    
    public FactorCreated( Object source )
    {
        super( source );
        f = (Factor) source;
    }
    
}

