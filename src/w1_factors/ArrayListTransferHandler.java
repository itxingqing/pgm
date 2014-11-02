/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package w1_factors;

import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.*;
import java.util.*;
import java.util.ArrayList;


/**
 *
 * @author ojodecocodrilo
 */
public class ArrayListTransferHandler extends ListTransferHandler
{
 
    //Bundle up the selected items in the list
    //as a single string, for export.
    protected String exportString(JComponent c) {
        JList list = (JList)c;
        indices = list.getSelectedIndices();
        ArrayList<String> values = (ArrayList<String>) list.getSelectedValuesList();
        
        StringBuffer buff = new StringBuffer();

        for (int i = 0; i < values.size(); i++) 
        {
            if (values.get(i) != null )
            {
                buff.append(  values.get(i) );
            }
          
            if ( buff.length() > 0 ) 
            {
                buff.append("\n");
            }
        }
        
        return buff.toString();
    }
    
    
    //Bundle up the selected items in the list
    //as a single string, for export.
    protected ArrayList<String> exportArrayList(JComponent c) 
    {
        JList list = (JList)c;
        return (ArrayList<String>) list.getSelectedValuesList();
        
        /*
        indices = list.getSelectedIndices();
        Object[] values = list.getSelectedValues();

        ArrayList<String> arrayList = new ArrayList<String>();
        for (int i = 0; i < values.length; i++) 
        {
            Object val = values[i];
            
            if ( val != null )
            {
                arrayList.add( val.toString() );
            }
        }
        return arrayList;*/
    }
    

    
    
    //Take the incoming string and wherever there is a
    //newline, break it into a separate item in the list.
    protected void importString(JComponent c, String str) {
        JList target = (JList)c;
        DefaultListModel listModel = (DefaultListModel)target.getModel();
        int index = target.getSelectedIndex();

        //Prevent the user from dropping data back on itself.
        //For example, if the user is moving items #4,#5,#6 and #7 and
        //attempts to insert the items after item #5, this would
        //be problematic when removing the original items.
        //So this is not allowed.
        if (indices != null && index >= indices[0] - 1 &&
              index <= indices[indices.length - 1]) {
            indices = null;
            return;
        }

        int max = listModel.getSize();
        if (index < 0) {
            index = max;
        } else {
            index++;
            if (index > max) {
                index = max;
            }
        }
        addIndex = index;
        String[] values = str.split("\n");
        addCount = values.length;
        for (int i = 0; i < values.length; i++) {
            listModel.add(index++, values[i]);
        }
    }
    
    
}
