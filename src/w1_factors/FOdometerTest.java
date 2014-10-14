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

Description : Test of FOdometer
Date        : 2014 - July - 23
Author      : Arturo Alatriste Trujillo.

 */

package w1_factors;
import java.util.*;


/**
 *
 * @author Arturo.Alatriste
 */
public class FOdometerTest {

    public void test1()
    {
        System.out.println( "create an odometer with 3 binary vars, and print all his combinations" );
        
        ArrayList<String> a1 = new ArrayList<String>( Arrays.asList( "Easy", "Hard"      ) );
        ArrayList<String> a2 = new ArrayList<String>( Arrays.asList( "Low" , "Brilliant" ) );
        ArrayList<String> a3 = new ArrayList<String>( Arrays.asList( "Rich", "Poor"      ) );                
                
        
        RandomVar v1 = new RandomVar( 1, "v1", "difficulty",   a1 );
        RandomVar v2 = new RandomVar( 2, "v2", "intelligence", a2 );
        RandomVar v3 = new RandomVar( 3, "v3", "rich_or_poor", a3 );
        
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
        
        odometer.printHeader();
        //odometer.printHeaderReverse();
        
        for(int i=0; i < 8; i++)
        {
            odometer.print();
            //odometer.printReverse();
            odometer.addOne();
        }
        System.out.println( "\n\n\n" );
    }
    
    public void test2()
    {}
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FOdometerTest t1 = new FOdometerTest();
        t1.test1();
        
    }
    
}
