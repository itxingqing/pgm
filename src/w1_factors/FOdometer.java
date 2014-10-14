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

Description : class for Odometer for Faactors. This odometer is used to 
              fill the table of values in a Factor.

Date        : 2014 - July - 23
Author      : Arturo Alatriste Trujillo.
 */



package w1_factors;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author Arturo.Alatriste
 */



public class FOdometer {

    public  RandomVarCollection vars; // random variables used in this odometer
    
    public List<Integer> counter; 
    
    int numOfAdditions;
    int sum = 0;
    OdometerStatus status = OdometerStatus.Reset;
    
    public FOdometer( ){
    }
    
    public FOdometer( ArrayList<RandomVar> vars  )
    {
        this.vars = new RandomVarCollection( vars );
        //counter = new ArrayList<Integer>( vars.size() );
        
        counter = new ArrayList<Integer>( this.vars.size() );
        while( counter.size() < this.vars.size() )
        {
            counter.add(0);
        }
    }

    public FOdometer( RandomVarCollection vars  )
    {
        this.vars = vars;
        counter = new ArrayList<Integer>( this.vars.size() );
        while( counter.size() < this.vars.size() )
        {
            counter.add(0);
        }
    }
    
    
    public void reset()
    {
        status = OdometerStatus.Reset;
        sum = 0;
        numOfAdditions=0;
    }
    
    public void start()
    {
        status = OdometerStatus.StartedInCeros;
        sum = 0;
        numOfAdditions=0;
    }
    
    public void addOne()
    {
        int value = 0;
        int carry = 1;
        
        for(int i=0; i < vars.size();  i++ )
        {
            value = counter.get(i) + carry;

            if ( value == vars.get(i).getCardinality()  )
            {
                counter.set(i, 0);
                carry = 1;
            }
            else
            {
                counter.set(i, value);
                carry = 0;
                break;
            }
        }
    }

    
    public void printHeader()
    {
        System.out.print( "\nOdometer Variables Columns \n\n" );

        for(int i = 0; i < counter.size(); i++)
        {
            System.out.printf( "%d\t", i  );            
        }
        System.out.print( "\n" );
        
        for(int i = 0; i < counter.size(); i++)
        {
            System.out.printf( "-\t"  );
        }
    }
    
    public void print()
    {
        System.out.print( "\n" );
        for(int i = 0; i < counter.size(); i++)
        {
            System.out.printf( "%d\t", counter.get(i)  );
        }
    }

    public void printHeaderReverse()
    {
        System.out.print( "\nOdometer Variables Columns \n\n" );
        for(int i = counter.size() -1; i >= 0 ; i--)
        {
            System.out.printf( "%d\t", i  );
        }
        System.out.print( "\n" );
        for(int i = counter.size() -1; i >= 0 ; i--)
        {
            System.out.printf( "-\t"  );
        }        
    }
    
    public void printReverse()
    {
        System.out.print( "\n" );
        for(int i = counter.size() -1; i >= 0 ; i--)
        {
            System.out.printf( "%d\t", counter.get(i)  );
        }
    }
    
    /**
     * Copy the current value of the odometer to a JTable in the specified row
     * @param t   JTable
     * @param row int 
     */
    public void copyTo(JTable t, int row)
    {
        String s = "";
        for(int c = 0; c < t.getColumnCount() - 1; c++)
        {
            s = vars.get(c).getValues().get( counter.get(c) );
            t.setValueAt(  s, row, c);
        }
    }
    
}
