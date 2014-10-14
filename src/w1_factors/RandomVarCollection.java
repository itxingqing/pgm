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

Description : RandomVarCollection class
Date        : 2014 - July - 29
Author      : Arturo Alatriste Trujillo.

 * 
 */

package w1_factors;
import java.util.*;
import java.util.ArrayList;

/**
 *
 * @author Arturo.Alatriste
 */
public class RandomVarCollection {
   protected ArrayList<RandomVar>  vars;
   
   public RandomVarCollection(){
       vars = new ArrayList<RandomVar>();
   }
   
   public RandomVarCollection(ArrayList<RandomVar>  vars){
       this.vars = vars;
   }
   
   public RandomVarCollection(RandomVarCollection c){
       vars = new ArrayList<RandomVar>();
       
       for(int i = 0; i < c.size(); i++  )
       {
           vars.add( c.get(i) );
       }
   }
   
   
   public void add(RandomVar v){
       vars.add(v);
   }
   
   public void clear(){
       vars.clear();
   }
   
   
   public void remove(int index){
       vars.remove(index);
   }

   public void remove(Object o){
       vars.remove(o); 
   }
   
   public RandomVar get(int index ){
       return vars.get(index);
   }

   public RandomVar getByName(String name ){
        Optional<RandomVar> opt = vars.stream()
            .filter( v -> v.getName().equals( name ) )
            .findFirst();
       
       if (opt != null && opt.isPresent())
       {
           return opt.get();
       }
       return null;
       
    /*
    RandomVar v = null;
    for(int i=0; i < vars.size() ;i++)
    { 
        v = vars.get(i);
        if ( v.getName().equals(name) )
        {
            return v;
        }
    }
    return null;       
    */
    
   }

   public RandomVar getById(int id ){
       RandomVar v = null;
       for(int i=0; i < vars.size() ;i++)
       { 
           v = vars.get(i);
           if ( v.getId() == id)
           {
               return v;
           }
       }
    return null;
   }
   
   
   public void set(int index, RandomVar v){
       vars.set(index, v);
   }
   
   public int size(){
       return vars.size();
   }
   


/**
 * This function get: c1 U c2.
 * Get all the elements from c1 and all the elements from c2, but it does not
 * get repeated elements.
 */   
   
   public static RandomVarCollection getUnion
        (RandomVarCollection c1, RandomVarCollection c2  ){
            
       RandomVarCollection result = new RandomVarCollection( c1 );
       boolean exist = false;
       
       for(RandomVar v2 : c2.vars )
       {
           exist = false;
           for(RandomVar v1 : c1.vars )
           {
               if ( v2.getId() == v1.getId() )
               {
                   exist = true;
                   break;
               }
           }
           if(!exist)
           {
               result.add(v2);
           }
       }
       
       if (result == null)
       {
           return null;
       }
       
       return result;
   }

/**
 * This function get: c1 U c2.
 * Get all the elements from c1 and all the elements from c2, but it does not
 * get repeated elements.
 */   
   
   public RandomVarCollection getUnion( RandomVarCollection c2 ){
       RandomVarCollection result = new RandomVarCollection( vars );
       boolean exist = false;
       
       for(RandomVar v2 : c2.vars )
       {
           exist = false;
           for(RandomVar v1 : vars )
           {
               if ( v2.getId() == v1.getId() )
               {
                   exist = true;
                   break;
               }
           }
           if(!exist)
           {
           result.add(v2);
           }
       }
       if (result == null)
       {
           return null;
       }
       
       return result;
   }
   
/**
 * take 2 RandomVarCollection objects, map the vars, and return a hash map,
 * where each row represent a var that exist in both collections,
 * key is Index in c1, and value is Index in c2.
 * 
 * @param c1 RandomVarCollection
 * @param c2 RandomVarCollection
 * @return HashMap<Integer, Integer> 
 */   
   
   public static HashMap<Integer, Integer>  getMapVarInd
        (RandomVarCollection c1, RandomVarCollection c2  ){

       HashMap<Integer, Integer> map = new HashMap<Integer, Integer> ();
       
       for(int i=0; i < c1.size(); i++)
       {
           for(int j=0; j < c2.size(); j++)
           {
               if ( c1.get(i).getId() == c2.get(j).getId() )
               {
                   map.put(i, j);
                   break;
               }
           }
       }
       
       if (map.size() == 0)
       {
           return null;
       }
       return map;
   }
        
  
   public HashMap<Integer, Integer> getMapVarInd(RandomVarCollection c2  ){

       HashMap<Integer, Integer> map = new HashMap<Integer, Integer> ();
       
       for(int i=0; i < vars.size(); i++)
       {
           for(int j=0; j < c2.size(); j++)
           {
               if ( vars.get(i).getId() == c2.get(j).getId() )
               {
                   map.put(i, j);
                   break;
               }
           }
       }
       
       if (map.size() == 0)
       {
           return null;
       }
       
       return map;
   }

   public static HashMap<Integer, Integer> getMapBNotinA
        (RandomVarCollection cA, RandomVarCollection cB)
   {
       HashMap<Integer, Integer> map = new HashMap<Integer, Integer> ();
       boolean exist = false;
       for(int b=0; b < cB.size(); b++)
       {
           exist = false;
           for(int a=0; a < cA.size(); a++)
           {
               if ( cA.get(a).getId() == cB.get(b).getId() )
               {
                   exist = true;
                   break;
               }
           }
           if(!exist)
           {
               map.put(b, 0);
           }
       }
       
       if (map.size() == 0)
       {
           return null;
       }
       return map;
   }

   /**
    * This method fill the hashMap that correspond to B.
    * This is used in Factor product.
    * @param B
    * @param mapB 
    */     
   public void FillMap(RandomVarCollection cB, HashMap<Integer, Integer> mapB)
   {
       for(Map.Entry<Integer, Integer> e : mapB.entrySet() )
       {
           for(int i = 0; i < vars.size(); i++ )
           {
               if ( cB.get( e.getKey() ).getId() == vars.get(i).id   )
               {
                   // set empty value in hashMap
                   mapB.put(e.getKey(),  i);
               }
           }
       }
   }

        
}
