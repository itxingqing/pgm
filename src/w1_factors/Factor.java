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

Description : class for Factors in Probabilistic Graphical Models
Date        : 2014 - July - 23
Author      : Arturo Alatriste Trujillo.
*/


package w1_factors;

import static java.lang.Math.pow;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author Arturo.Alatriste
 */
public class Factor {
    
    //attributes
    protected int                   id;
    protected String                name;
    protected RandomVarCollection   vars;
    protected FOdometer             odometer;
    
    /**
     * in the JTable table, the first columns correspond 
     * with the random variables from vars.
     *
     * The last column contains the probability. 
     * example:
     * 
     *  List vars
     *  ----------------------------
     * |  index  | Random variable  |
     * |----------------------------
     * |    0    |     v0           |
     * |    1    |     v1           |
     * |    2    |     v2           |
     *  ----------------------------
     * 
     * 
     * JTable table
     *  --------------------------------------------
     * |  row    | v0 | v1 | v2 | v3 | probability  |
     * |--------------------------------------------
     * |    0    |    |    |    |    |     0.00     |
     * |    1    |    |    |    |    |     0.00     |
     * |    2    |    |    |    |    |     0.00     |
     * |    3    |    |    |    |    |     0.00     |
     * |    4    |    |    |    |    |     0.00     |
     * |    5    |    |    |    |    |     0.00     |
     * |    6    |    |    |    |    |     0.00     |
     * |    7    |    |    |    |    |     0.00     |
     *  --------------------------------------------
     * 
     */
    protected JTable                table;

    // Attributes get set
    
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
     * @return the vars
     */
    public RandomVarCollection getVars() {
        return vars;
    }

    /**
     * @param vars the vars to set
     */
    public void setVars(RandomVarCollection vars) {
        this.vars = vars;
    }

    /**
     * @return the odometer
     */
    public FOdometer getOdometer() {
        return odometer;
    }

    /**
     * @param odometer the odometer to set
     */
    public void setOdometer(FOdometer odometer) {
        this.odometer = odometer;
    }

    /**
     * @return the table
     */
    public JTable getTable() {
        return table;
    }

    /**
     * @param table the table to set
     */
    public void setTable(JTable table) {
        this.table = table;
    }
    
   
    // Constructors
    public Factor(int id, String name)
    {
        this.id   = id;
        this.name = name;
        //vars = new ArrayList<RandomVar>();
        vars = new RandomVarCollection();
    }

    public Factor(int id, String name, ArrayList<RandomVar> vars)
    {
        this.id   = id;
        this.name = name;
        //this.vars = vars;
        this.vars = new RandomVarCollection(vars);
        
    }
    
    public Factor(int id, String name, RandomVarCollection vars)
    {
        this.id   = id;
        this.name = name;
        this.vars = vars;
    }
    
    
    /**
     * Copy table to a a visual control JTable
     * @param t 
     */
    public void copyTo(JTable t)
    {
        JTablex.copy(getTable(), t);
    }

    /**
     * copy the table to a visual control JifFactor
     * @param frame 
     */
    public void copyTo(JifFactor frame)
    {
        JTable t = frame.getTable();
        JTablex.copy(getTable(), t);
    }
    
    
   
    public String getCell(int row, int col)
    {
        return getTable().getValueAt(row, col).toString();
    }
    
    public String getCell(int row, String colName)
    {
        for(int col = 0; col < getTable().getColumnCount(); col++ )
        {
            if ( this.getTable().getColumnModel().getColumn( col ).getHeaderValue() .equals(colName ) )
            {
                return getTable().getValueAt(row, col).toString();
            }
        }
        return null;
    }    

    public float getProbability(int row)
    {
        //Float p = 0.0F;
        //p = Float.parseFloat( table.getValueAt(row, table.getColumnCount()-1).toString() );
        
        return Float.parseFloat( getTable().getValueAt(row, 
                getTable().getColumnCount()-1).toString() );
    }

    public void setProbability(float value, int row )
    {
        getTable().setValueAt(value, row, getTable().getColumnCount()-1);
    }
    
    public void SumProbability(float probability, int row )
    {
        //sum the probability + current prob stored in the table
        
        probability +=  Float.parseFloat( getTable().getValueAt(row, 
                getTable().getColumnCount()-1).toString() );
        
        getTable().setValueAt(probability, row, getTable().getColumnCount()-1);
    }            
    
    public void setProbability(Object[] value)
    {
        for(int r = 0; r < value.length; r++)
        {
            if ( r >= getTable().getRowCount() )
            {break;}
            
            getTable().setValueAt(value[ r ] , r, getTable().getColumnCount()-1);
        }
    }
    
    public void setCell(Object value, int row, String colName)
    {
        for(int col = 0; col < getTable().getColumnCount(); col++ )
        {
            if ( getTable().getColumnName(0).equals(colName ) )
            {
                getTable().setValueAt(value, row, col);
            }
        }
    }    
    
    /**
     * Get the id of the specified random variable. 
     * This function is useful when looping through the vars in the factor.
     * @param varIndex cero based Index of the location of the var. 
     * @return int id of the found random variable.
     */
    public int getVarId(int varIndex)
    {
        return vars.get( varIndex ).getId();
    }
    
    /**
     * Add a row at the end of the JTable of this Factor
     * @param fA   Factor
     * @param rowA specify which row from Factor fA will be copied
     * @param mapAB specify which columns from fA will be copied. This map has
     *              key   = index of column fro, factor fA, 
     *              value = index of column from this factor 
     * 
     */
    public void AddRow( Factor fA, int rowA, HashMap<Integer, Integer> mapAB )
    {
        JTablex.addRow( this.table );
        
        for( Map.Entry<Integer, Integer> e :  mapAB.entrySet()  )
        {
            getTable().setValueAt(fA.getCell(rowA, e.getKey()), 
                    this.table.getRowCount()-1, e.getValue() );
        }
    }
    
    public void AddRow( Factor fA, int rowA )
    {
        JTablex.addRow( this.table );
        
        for( int c = 0; c < this.table.getColumnCount(); c++ )
        {
            getTable().setValueAt( fA.getCell(rowA, c ), 
                this.table.getRowCount()-1, c );
        }
    }
    
    
    /**
     * add columns and set the  headers to table.
     */
    public void setHeaders()
    {
        for(int c = 0; c < getTable().getColumnCount()-1; c++ )
        {
            getTable().getColumnModel().getColumn(c).setHeaderValue(getVars().get(c).getName());
        }
        getTable().getColumnModel().getColumn( getTable().getColumnCount()-1 )
                .setHeaderValue( "probability" );
    }

    /**
     * create an empty table with the maximum of rows needed.
     */
    public void createEmptyTable()
    {
        if (getTable() == null)
        {
            setTable(new JTable(0, getVars().size() + 1 ));
        }
        JTablex.deleteRows(getTable());
        setHeaders();
        
        int rows = 0;
        for(int i=0; i < getVars().size(); i++)
        {
            if (rows == 0)
            {
                rows = getVars().get( i ).getCardinality();
            }
            else
            {
                rows *= getVars().get( i ).getCardinality();
            }
        }
        
        JTablex.addRows(getTable(), (int) rows );
    }
    
    /**
     * create an empty table with cero rows
     */
    public void createEmptyTableCeroRows()
    {
        if (getTable() == null)
        {
            setTable(new JTable(0, getVars().size() + 1 ));
        }
        JTablex.deleteRows(getTable());
        setHeaders();
    }

    public void FillTable()
    {
        createEmptyTable();
        
        boolean deleteOdometer = false;
        if (getOdometer() == null)
        {
            setOdometer(new FOdometer(getVars()));
            deleteOdometer = true;
        }
        odometer.reset();
                
        for(int r = 0; r < getTable().getRowCount() ; r++)
        {
            getOdometer().copyTo(getTable(), r);
            getOdometer().addOne();
        }
        
        if (deleteOdometer == true)
        {
            setOdometer(null);
        }
    }
    
    
    public static Factor FactorProduct(Factor fA, Factor fB)
    {
        Factor fC = null;
     
        System.out.println( "----------------------"); 
        System.out.println( "FactorProduct, debug");
        System.out.println( "fA.vars.size(): " + fA.vars.size() );
        System.out.println( "fB.vars.size(): " + fB.vars.size() );
        
        
        
        // which vars exist in f1 and f2
        HashMap<Integer, Integer> mapAB = RandomVarCollection.getMapVarInd( fA.getVars(), fB.getVars() );
        
        System.out.println( mapAB );
        System.out.println( "fA.vars.size(): " + fA.vars.size() );
        System.out.println( "fB.vars.size(): " + fB.vars.size() );
        
        if ( mapAB.size() == 0 )
        {
            return fC;
        }

        RandomVarCollection cVars = RandomVarCollection.getUnion( fA.getVars(), fB.getVars() );

        System.out.println( "fA.vars.size(): " + fA.vars.size() );
        System.out.println( "fB.vars.size(): " + fB.vars.size() );        
        
        fC = new Factor( 3, "C", cVars );
        fC.createEmptyTable();
        
        /**
         * in the factor product
         *  fC = fA * fB
         * 
         * To fill the probability table in factor fC,
         * we must write all the var values from factor fA
         * and the remaining var values from fB. So we need to know
         * which var in fB are not repeated in fA, and 
         * var that exist in C and are empty values in fC.
         * 
         * mapB_C = B\A ∩ C , it is 
         * 
         * B set difference A, Intersection C. 
         * set of all members that are in B that are not in A, Intersection C. 
         */
        HashMap<Integer, Integer> mapB_C = RandomVarCollection.getMapBNotinA(fA.getVars(), fB.getVars() );
        cVars.FillMap(fB.vars, mapB_C);
        
        String fA_varValue = "";
        String fB_varValue = "";
        int r=0;
        
        for( int rA = 0; rA < fA.table.getRowCount(); rA++ )
        {
            for( int rB = 0; rB < fB.table.getRowCount(); rB++ )
            {
                for ( Map.Entry<Integer, Integer> e : mapAB.entrySet() ) 
                {
                    fA_varValue = fA.table.getValueAt( rA, e.getKey  () ).toString() ;
                    fB_varValue = fB.table.getValueAt( rB, e.getValue() ).toString() ;
                    
                    if ( fA_varValue.equals( fB_varValue ) )
                    {
                        fC.setVarValues(r, rA, fA);
                        fC.setVarValues(r, rB, fB, mapB_C); 
                        fC.setProbability (fA.getProbability( rA ) * fB.getProbability( rB ), r );
                        r++;
                    }
                }
            }
        }
        return fC;
    }
    
    /**
     * set the var values in this factor using all the vars in factor fA
     * @param r
     * @param rA
     * @param fA 
     */
    private void setVarValues(int r, int rA, Factor fA) 
    {
        for(int c = 0; c < fA.table.getColumnCount(); c++ )
        {
            this.table.setValueAt( fA.table.getValueAt(rA, c) , r, c);
        }
    }
    
    /**
     * set the var values in this factor using only some vars from factor fB
     * @param r
     * @param rB
     * @param fB
     * @param mapB_C 
     */
    private void setVarValues(int r, int rB, Factor fB, 
        HashMap<Integer, Integer> mapB_C)
    {
        for( Map.Entry<Integer, Integer> e : mapB_C.entrySet() )
        {
            this.table.setValueAt( fB.table.getValueAt(rB, e.getKey() ) ,
                r, e.getValue() );
        }
    }
    
    public void print()
    {
        System.out.println( "\n\n  Factor.print() \n\n");
        System.out.println( this.name + "\n\n");
        
        if (getTable() == null)
        {
            System.out.println( "this Table is empty \n\n");
            return;
        }
        
        for(int r = 0; r < getTable().getRowCount(); r++ )
        {
            System.out.println( "\t");
            for(int c = 0; c < getTable().getColumnCount(); c++ )
            {
                System.out.print( getTable().getValueAt(r, c) + "\t");
            }
        }
        System.out.println( "\n\n");
    }

    
    /**
     * This method apply the marginalization operation to f 
     * specifying the RandomVariables that we will keep,
     * and return a new Factor.
     * 
     * @param fA Factor as input. 
     * @param c RandomVarCollection with the vars that we will keep.
     * @return fB Factor, is the result of the operation.
     */
    public static Factor Marginalization(Factor f, RandomVarCollection c)
    {
        boolean matchRow = false;
        Factor fM = new Factor(4, "Marginalization", c);
        fM.createEmptyTableCeroRows();
        HashMap<Integer, Integer> mapfM = RandomVarCollection.getMapVarInd( f.getVars() , c);
        
        for( int r = 0; r < f.table.getRowCount(); r++ )
        {
            for( int rM = 0; rM < fM.table.getRowCount(); rM++ )
            {
                matchRow = Factor.MatchRows( f, fM, r, rM, mapfM );
                if ( matchRow )
                {
                    fM.SumProbability( f.getProbability( r ), rM  );
                    break;
                }
            }
            
            if ( !matchRow )
            {
                fM.AddRow( f, r, mapfM );
                fM.setProbability( f.getProbability(r) , fM.table.getRowCount()-1 );
            }
        }
        return fM;
    }
    
    /**
     * verify if one row from factor fA match with one row from factor fB, using only some vars.
     * @param fA    Factor
     * @param fB    Factor
     * @param rowA  int, the index of row from fA
     * @param rowB  int, the index of row from fB
     * @param mapAB the random vars that will be used
     * @return boolean
     */
    private static boolean MatchRows(Factor fA, Factor fB, int rowA, int rowB, HashMap<Integer, Integer> mapAB)
    {
        boolean matchRows = true;
        String fA_varValue = "";
        String fB_varValue = "";
        
        for ( Map.Entry<Integer, Integer> e : mapAB.entrySet() ) 
        {
            fA_varValue = fA.table.getValueAt( rowA, e.getKey  () ).toString() ;
            fB_varValue = fB.table.getValueAt( rowB, e.getValue() ).toString() ;

            if ( !fA_varValue.equals( fB_varValue ) )
            {
                matchRows = false;
                break;
            }
        }
        return matchRows;
    }
    
    private static boolean MatchRows(Factor fA, Factor fB, int rowA, int rowB)
    {
        String fA_varValue = "";
        String fB_varValue = "";
        
        if ( fA.table.getColumnCount() != fB.table.getColumnCount() )
        {
            return false;
        }
        
        for ( int c = 0; c < fA.table.getColumnCount(); c++ ) 
        {
            fA_varValue = fA.table.getValueAt( rowA, c ).toString() ;
            fB_varValue = fB.table.getValueAt( rowB, c ).toString() ;

            if ( !fA_varValue.equals( fB_varValue ) )
            {
                return false;
            }
        }
        return true;
    }
    
    
    private boolean MatchRows(int row, MarClauseSet clauseSet)
    {
        for(Map.Entry<RandomVar, String> e : clauseSet.getVarValueMap().entrySet() )
        {
            System.out.println( e.getKey().getName() );
            
            
            if ( !this.getCell(row, e.getKey().getName() ).equals( e.getValue() ))
            {
                return false;
            }
        }
        return true;
    }
    
    private String GetMarCardinalities(HashMap<Integer, Integer> mapVarInd, int row)
    {
        StringBuilder s = new StringBuilder();
        
        
        return null;
    }

    
    /**
     * This Factor Operation delete the rows specified by a clauseSet
     * @param f
     * @param removeClauseSet
     * @return 
     */
    public static Factor Reduction(Factor f, MarClauseSet clauseSet )
    {
        boolean matchRow = false;
        
        Factor fM = new Factor(4, "Reduction", f.getVars() );
        fM.createEmptyTableCeroRows();
        
        System.out.println( "Reduction(), starting..." );
        fM.print();
        f.print();
        
        for( int r = 0; r < f.table.getRowCount(); r++ )
        {
            if ( f.MatchRows( r, clauseSet ) )
            {
                continue;
            }
            
            for( int rM = 0; rM < fM.table.getRowCount(); rM++ )
            {
                matchRow = Factor.MatchRows( f, fM, r, rM );
                if ( matchRow )
                {
                    fM.SumProbability( f.getProbability( r ), rM  );
                    break;
                }
            }
            
            if ( !matchRow )
            {
                fM.AddRow( f, r );
                fM.setProbability( f.getProbability(r) , fM.table.getRowCount()-1 );
            }
        }
        
        fM.print();
        System.out.println( "Reduction(), end." );
                
        
        return fM;
    }

    
    
   
}
