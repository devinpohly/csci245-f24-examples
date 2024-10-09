package sudoku4;

/**
 * GivenEntry.java
 * 
 * Class to represent an entry in the Sudoku table
 * given at the beginning.
 * 
 * @author Thomas VanDrunen
 * CS 245, Wheaton College, Spring 2007
 * In-class example
 * Sept 17, 2007
 */

import java.awt.*;
import javax.swing.JTextField;

public class GivenEntry extends Entry {

    /**
     * Constructor; uses the given value.
     * @param value The hard-wired value.
     */
    public GivenEntry(String value) {
        this.value = value;
    }
    

    /**
     * Represent this entry with an uneditable textfield.
     * @return An uneditable textfield.
     */
    public Component display() { 
        // The textfield (it's size 3 so that it's the same width
        // as a JComboBox)
        JTextField toReturn = new JTextField(3);  
        toReturn.setText(value + "");
        toReturn.setEditable(false);
        return toReturn;
    }


}

