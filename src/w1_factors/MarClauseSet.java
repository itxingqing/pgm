/*
        ____________
       /\  ________ \       
      /  \ \______/\ \
     / /\ \ \  / /\ \ \     
    / / /\ \ \/ / /\ \ \
   / / /__\ \ \/_/__\_\ \
  / /_/____\ \___________\
  \ \ \____/ / ________/ /
   \ \ \  / / /\ \  / / / 
    \ \ \/ / /\ \ \/ / / 
     \ \/ / /__\_\/ / /
      \  / /______\/ /
       \/___________/       

Description : class for conditions used in Marginalization
Date        : 2014 - September - 08
Author      : Arturo Alatriste Trujillo.
*/

package w1_factors;

import java.util.HashMap;

/**
 *
 * @author Arturo.Alatriste
 */
public class MarClauseSet {
    
    public HashMap<RandomVar, String> m = new HashMap<RandomVar, String> ();
    
    public void add(RandomVar v, String value)
    {
        m.put(v, value);
    }
    
    public HashMap<RandomVar, String> getVarValueMap()
    {
        return m;
    }
    
}
