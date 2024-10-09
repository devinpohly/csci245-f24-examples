package sudoku3;
/**
 * RCS.java
 * 
 * Class for modeling a row or a column in the Sudoku table.
 * 
 * @author Thomas VanDrunen
 * CS 245, Wheaton College, Fall 2007
 * In-class example
 * Sept 17, 2007
 */

//import javax.swing.JRadioButton;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

import javax.swing.JPanel;

public class RCS implements ActionListener {

    /**
     * The button (used basically as an LED) indicating
     * whether this row or column is incomplete, complete,
     * or in violation; for rows/columns only (otherwise null).
     */
    private Indicator led;

    /**
     * The panel showing the entries; for squares only (otherwise null).
     */
    private JPanel panel;

    /**
     * The color of the panel before we mess with it.
     * We need to record this so we can switch it back;
     * for squares only (otherwise null).
     */
    private Color defaultColor;


    /**
     * The entries constituting this row or column.
     */
    private Entry[] entries;

    /**
     * Tag indicating if this is a Square or Row or Column,
     * true for square, false for row or column
     */
    private boolean isSquare;

    /**
     * Constructor.
     * @param entries An array of entries for this row or column.
     * @param isSquare Is this a square (alternately, a row or column)
     */
    public RCS(Entry[] entries, boolean isSquare) {
        this.isSquare = isSquare;
        if(isSquare) {
            panel = new JPanel();
            defaultColor = panel.getBackground();     	
        }
        else 
            led = new Indicator();
        this.entries = new Entry[9]; 
        for (int i = 0; i < entries.length; i++) {
            this.entries[i] = entries[i];
            if(isSquare) 
                panel.add(entries[i].display());

        }
    }

    /**
     * Accessor method for the indicator button; for rows/columns
     * only, otherwise throws an UnsupportedOperationException.
     * @return The indicator button.
     * @throws UnsupportedOperationException if called on a square
     */
    public Component getButton() { 
        if (isSquare)
            throw new UnsupportedOperationException();
        else 
            return led; 
    }

    /**
     * Accessor method for the panel; for squares
     * only, otherwise throws an UnsupportedOperationException.
     * @return The panel showing the entries.
     * @throws UnsupportedOperationException if called on a row or column
     */
    public Component getPanel() { 
        if (isSquare) 
            return panel; 
        else 
            throw new UnsupportedOperationException();
    }
    /**
     * Set the indicator button for this row or column to show if
     * there are violations, or if the row/column is complete.
     * Make a hashset that contains all the elements that should be
     * in a row or column. Iterate through the entries.
     * If there are any unknowns, take note. If it contains a value that
     * is not in the hashset, that means the value is in the row/column twice,
     * a violation. Otherwise, remove the value from the hashset.
     * Finally, mark the button red, green, or unselected based on 
     * what we've found.
     * @param ae Unused
     */
    public void actionPerformed(ActionEvent ae) {

        boolean unknowns = false;    // have we encountered any unknowns?
        boolean violation = false;     // Have we found a violation?

        // The set of things we should find in a complete row
        HashSet<String> values = new HashSet<String>();
        for (int i = 1; i < 10; i++)
            values.add(i + "");

        for (int i = 0; i < entries.length; i++) {


            // the value we've found in the current entry
            String value = entries[i].value();  

            if (value.equals("")) 
                unknowns = true;
            else if (! values.contains(value)) 
                violation = true;
            else 
                values.remove(value);
        }
        if (isSquare) {
            if (violation) 
                panel.setBackground(Color.RED);
            else if (unknowns) 
                panel.setBackground(defaultColor);
            else 
                panel.setBackground(Color.GREEN);

        }
        else {
            if (violation) 
                led.setColor(Color.RED);
            else if (unknowns) 
                led.setColor(Color.WHITE);
            else 
                led.setColor(Color.GREEN);
        }

    }

}
