/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package w1_factors;

import java.util.EventListener;

/**
 *
 * @author ojodecocodrilo
 */
public interface FactorEventListener 
extends EventListener
{
    public void FactorCreated( FactorCreated evt );
    
}
