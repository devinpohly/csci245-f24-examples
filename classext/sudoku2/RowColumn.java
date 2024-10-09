package sudoku2;

/**
 * RowColumn.java
 * 
 * Class for modeling a row or a column in the Sudoku table.
 * 
 * @author Thomas VanDrunen
 * CS 245, Wheaton College, Fall 2007
 * In-class example
 * Sept 17, 2007
 */

import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class RowColumn implements ActionListener {

    /**
     * The button (used basically as an LED) indicating
     * whether this row or column is incomplete, complete,
     * or in violation.
     */
    private Indicator led;

    /**
     * The shared chunk of code between Square and Row Column
     */
    private SRCShare share;

    /**
     * Constructor.
     * @param entries An array of entries for this row or column.
     */
    public RowColumn(Entry[] entries) {
        share = new SRCShare(entries);
        led = new Indicator();
    }

    /**
     * Accessor method for the indicator button.
     * @return The indicator button.
     */
    public Component getButton() { return led; }

    /**
     * Set the indicator button for this row or column to show if
     * there are violations, or if the row/column is complete.
     * The shared chunk does all of this work now.
     * @param ae Unused
     */
    public void actionPerformed(ActionEvent ae) {


        boolean[] result = share.method();

        if (result[0]) 
            led.setColor(Color.RED);
        else if (result[1]) 
            led.setColor(Color.WHITE);
        else 
            led.setColor(Color.GREEN);

    }

}
