/*


          _____                    _____                _____          
         /\    \                  /\    \              /\    \         
        /::\    \                /::\    \            /::\    \        
       /::::\    \              /::::\    \           \:::\    \       
      /::::::\    \            /::::::\    \           \:::\    \      
     /:::/\:::\    \          /:::/\:::\    \           \:::\    \     
    /:::/__\:::\    \        /:::/__\:::\    \           \:::\    \    
   /::::\   \:::\    \      /::::\   \:::\    \          /::::\    \   
  /::::::\   \:::\    \    /::::::\   \:::\    \        /::::::\    \  
 /:::/\:::\   \:::\    \  /:::/\:::\   \:::\    \      /:::/\:::\    \ 
/:::/  \:::\   \:::\____\/:::/  \:::\   \:::\____\    /:::/  \:::\____\
\::/    \:::\  /:::/    /\::/    \:::\  /:::/    /   /:::/    \::/    /
 \/____/ \:::\/:::/    /  \/____/ \:::\/:::/    /   /:::/    / \/____/ 
          \::::::/    /            \::::::/    /   /:::/    /          
           \::::/    /              \::::/    /   /:::/    /           
           /:::/    /               /:::/    /    \::/    /            
          /:::/    /               /:::/    /      \/____/             
         /:::/    /               /:::/    /                           
        /:::/    /               /:::/    /                            
        \::/    /                \::/    /                             
         \/____/                  \/____/                              
                                                                       

Description : Test for Random Variable
Date        : 2014 - July - 23
Author      : Arturo Alatriste Trujillo.

 */

package w1_factors;
import java.util.*;

/**
 *
 * @author Arturo.Alatriste
 */
public class RandomVarTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String[] a1 = new String[] { "easy", "hard"               };
        String[] a2 = new String[] { "low" , "brilliant"          };
        String[] a3 = new String[] { "A"   , "B"          , "C"   };
        
        RandomVar v1 = new RandomVar(1, "v1", "Difficulty"  , a1);
        RandomVar v2 = new RandomVar(2, "v2", "Intelligence", a2);
        RandomVar v3 = new RandomVar(3, "v3", "Grade"       , a3);
        
        v1.printHeader();
        v1.print();
        v2.print();
        v3.print();
        
        System.out.println( "\n\n" );
        
        v1.fillValues();
        
        System.out.print( "v1 values: " );
        System.out.println( v1.getValues());
        
        String [] myArray = { "as", "bn", "cv" };
        
        ArrayList<String> values2 = new ArrayList<String>();
        values2.add( "Genious"   );
        values2.add( "Brilliant" );
        values2.add( "Normal"    );
        
        v2.setValues(values2);
        
        System.out.print( "v2 values: " );
        System.out.println( v2.getValues());        
        System.out.print( "\n\n" );
    }
    
}
