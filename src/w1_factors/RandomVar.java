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

Description : class for Random Variable
Date        : 2014 - July - 23
Author      : Arturo Alatriste Trujillo.

 */


package w1_factors;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Arturo.Alatriste
 */
public class RandomVar {
    
    protected int               id;
    protected String            name;
    protected String            description;
    protected ArrayList<String> values;

    //Constructor
    public RandomVar ()
    {
        //values = new ArrayList<String>();
    }

    public void ini (int id, String name, String description )
    {
        this.id = id;
        this.name = name;
        this.description= description;
    }
    
    public RandomVar (int id, String name, String description )
    {
        this.ini (id, name, description );
    }

    
    public RandomVar (int id, String name, String description, ArrayList<String> values )
    {
        this.ini (id, name, description );
        this.values = values; 
        System.out.println( this.id );
    }

    public RandomVar (int id, String name, String description, String[] values )
    {
        this.ini (id, name, description );
        
        this.values = new ArrayList<String>();
        for(String s: values)
        {
            this.values.add(s);
        }
        
        System.out.println( this.id );
    }
    
    
    public void printHeader()
    {
        System.out.println( "id \t name \t description \t cardinality" );
        System.out.println( "-- \t ---- \t ----------- \t -----------" );
    }
    public void print()
    {
        
        System.out.printf( "%d \t %s \t %s \t %d \n", getId(), getName(), getDescription(), getCardinality());
    }
    
    
    //
    public int getCardinality()
    {
        if ( getValues() != null )
        {
            return getValues().size();
        }
        return 0;
    }


    
    /**
     * This procedure clean the values list and fill it according to the cardinality
     */
    public void fillValues()
    {
        if (getValues() == null)
        {
            setValues(new ArrayList<String>());
        }
        
        getValues().clear();
        for(int i=0; i < getCardinality() ;i++)
        {
            getValues().add( Integer.toString(i) );
        }
    }

    public void setValues(ArrayList<String> valueList )
    {
        values = valueList;
        /*
        values.clear();
        for(int i=0; i < getCardinality() ;i++)
        {
            values.add( Integer.toString(i) );
        }
        */
    }
    
    /*
     * If values.size() > 0 then synchronize cardinality.
     */
    /*public void updateCardinality(){
        if (getValues() != null && getValues().size() > 0)
        {
            setCardinality(getValues().size());
        }
    }*/

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the values
     */
    public ArrayList<String> getValues() {
        return values;
    }


    
    
}
