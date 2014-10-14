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

Description : class for Probabilistic Graphical Models.
                this can be a Bayes Network or Markov Chain.
Date        : 2014 - July - 29
Author      : Arturo Alatriste Trujillo.


 */

package w1_factors;

import java.util.ArrayList;

/**
 *
 * @author Arturo.Alatriste
 */
public class Pgm {
    public RandomVarCollection  vars;
    public FactorCollection     factors;
    public FOdometer            odometer;
    
    Pgm(){
    
    }
    
    public void loadSample(){

        String[] a1 = new String[] { "easy", "hard"               };
        String[] a2 = new String[] { "low" , "brilliant"          };
        String[] a3 = new String[] { "A"   , "B"          , "C"   };
        
        RandomVar v1 = new RandomVar(1, "v1", "Difficulty"  , a1);
        RandomVar v2 = new RandomVar(2, "v2", "Intelligence", a2);
        RandomVar v3 = new RandomVar(3, "v3", "Grade"       , a3);

        vars.add( v1 );
        vars.add( v2 );
        vars.add( v3 );

        
        ArrayList<RandomVar> arrayList = new ArrayList<RandomVar>();
        arrayList.add(v1);
        arrayList.add(v2);
        arrayList.add(v3);
        
        v1.printHeader();
        v1.print();
        v2.print();
        v3.print();
        
        FOdometer odometer = new FOdometer( arrayList );
        odometer.reset();
        
        vars = new RandomVarCollection( arrayList  );

        factors = new FactorCollection();
        
        
        
    }
    
}

/**
 *    _____      ________________
 *   /  _  \    /  _  \__    ___/
 *  /  /_\  \  /  /_\  \|    |   
 * /    |    \/    |    \    |   
 * \____|__  /\____|__  /____|   
 *         \/         \/         
 */
