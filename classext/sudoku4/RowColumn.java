package sudoku4;

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

public class RowColumn extends Container  {

    /**
     * The button (used basically as an LED) indicating
     * whether this row or column is incomplete, complete,
     * or in violation.
     */
    private Indicator led;


    /**
     * Constructor.
     * @param entries An array of entries for this row or column.
     */
    public RowColumn(Entry[] entries) {
        super(entries);
        led = new Indicator();
    }

    /**
     * Accessor method for the indicator button.
     * @return The indicator button.
     */
    public Component getButton() { return led; }

    protected void handleViolation() { 
        led.setColor(Color.RED);
    }
    protected void handleUnknowns() {
        led.setColor(Color.WHITE);
    }
    protected void handleFinished(){ 
        led.setColor(Color.GREEN);
    }

}
