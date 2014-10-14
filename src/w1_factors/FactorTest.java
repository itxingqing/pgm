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

Description : Test for Factors class
Date        : 2014 - July - 23
Author      : Arturo Alatriste Trujillo.
*/



package w1_factors;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Arturo.Alatriste
 */
public class FactorTest {
    
    //Attributes
    RandomVar v1;
    RandomVar v2;
    RandomVar v3;
    RandomVarCollection vars;

    public void createVars() {

        RandomVar v1 = new RandomVar( 1, "v1", "difficulty",   
            new ArrayList<String>( Arrays.asList( "Easy", "Hard"      )));
        
        RandomVar v2 = new RandomVar( 2, "v2", "intelligence", 
                new ArrayList<String>( Arrays.asList( "Low" , "Brilliant" )));
        
        RandomVar v3 = new RandomVar( 3, "v3", "rich_or_poor", 
                new ArrayList<String>( Arrays.asList( "Rich", "Poor"      )));
        
        
        vars = new RandomVarCollection();
        vars.add(v1);
        vars.add(v2);
        vars.add(v3);
        
        
        System.out.print( "\n\n Values" );        
        System.out.println( v1.getValues());        
        System.out.println( v2.getValues());                
        System.out.println( v3.getValues());        
        System.out.print( "\n\n" );        
    }

    public void test1() {
        
        createVars();
        Factor f1 = new Factor( 1, "Factor A", vars );
        f1.FillTable();

        //print headers
        for(int c = 0; c < f1.getTable().getColumnCount(); c++ )
        {
            System.out.print(   f1.getTable().getColumnModel()
                    .getColumn(c).getHeaderValue() + "\t");
        }
        
        // print data
        for(int r=0; r < f1.getTable().getRowCount() ; r++)
        {
            System.out.print( "\n" );        
            for(int c=0; c < f1.getTable().getColumnCount() ; c++)
            {
                System.out.print(f1.getTable().getValueAt(r, c) + "\t" );
            }
        }
    }


    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        FactorTest t = new FactorTest();
        t.test1();
        
    }
    
}
