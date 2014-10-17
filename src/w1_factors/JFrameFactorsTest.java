/**
 **************************************************************************
 *    _____      ________________
 *   /  _  \    /  _  \__    ___/
 *  /  /_\  \  /  /_\  \|    |   
 * /    |    \/    |    \    |   
 * \____|__  /\____|__  /____|   
 *         \/         \/         
 * 
 * Description : Test for frame Factors
 * Date        : 2014 - July - 24
 * Author      : Arturo Alatriste Trujillo.
 ****************************************************************************/

package w1_factors;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Arturo.Alatriste
 */
public class JFrameFactorsTest {

    //public ArrayList<RandomVar> vars    = new ArrayList<RandomVar>();
    public RandomVarCollection vars    = new RandomVarCollection();
    public FactorCollection    factors = new FactorCollection();
    
    public void iniVars(){
        vars.clear();
        factors.clear();
        
        
        RandomVar v1 = new RandomVar( 1, "v1", "difficulty",   
                new ArrayList<String>( Arrays.asList( "Easy", "Hard"      )));
        
        RandomVar v2 = new RandomVar( 2, "v2", "intelligence", 
                new ArrayList<String>( Arrays.asList( "Low" , "Brilliant" )));
        
        RandomVar v3 = new RandomVar( 3, "v3", "Grade", 
                new ArrayList<String>( Arrays.asList( "A", "B", "C"      )));
        
        RandomVar v4 = new RandomVar( 4, "v4", "SAT", 
                new ArrayList<String>( Arrays.asList( "excellent" , "good", "bad" )));
        
        RandomVar v5 = new RandomVar( 5, "v5", "Letter", 
                new ArrayList<String>( Arrays.asList( "recommendation", "ignored" )));
        
        vars.add(v1);
        vars.add(v2);
        vars.add(v3);

    }
        
    public void test1(){
        iniVars();
        JFrameFactors f = new JFrameFactors(vars, factors);
        f.setVisible(true);
        
        
        f.LoadSample();
        //f.test1();
        
        //f.TestSetHeader();
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrameFactorsTest f = new JFrameFactorsTest();
        
        f.test1();
    }
    
}
