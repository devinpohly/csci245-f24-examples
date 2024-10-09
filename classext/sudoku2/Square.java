package sudoku2;

/**
 * Square.java
 * 
 * Class for modeling a square in the Sudoku table.
 * 
 * @author Thomas VanDrunen
 * CS 245, Wheaton College, Fall 2007
 * In-class example
 * Sept 17, 2007
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Square implements ActionListener {

    /**
     * The shared chunk of code between Square and Row Column
     */
    private SRCShare share;

    /**
     * The panel showing the entries.
     */
    private JPanel panel;

    /**
     * The color of the panel before we mess with it.
     * We need to record this so we can switch it back.
     */
    private Color defaultColor;

    /**
     * Constructor.
     * Store the entries, create the panel, and record the default
     * color.
     * @param entries An array of entries for this square.
     */
    public Square(Entry[] entries) {
        share = new SRCShare(entries);
        panel = new JPanel();
        for (int i = 0; i < entries.length; i++) 
            panel.add(entries[i].display());
        
        defaultColor = panel.getBackground();
    }

    /**
     * Accessor method for the panel.
     * @return The panel showing the entries.
     */
    public Component getPanel() { 
    	System.out.println("hi " + panel);
    	return panel; 
    }

    /**
     * Set the background color of this square to show if
     * there are violations, or if the row/column is complete.
     * The shared chunk does all of this work now.
     * @param ae Unused
     */    
    public void actionPerformed(ActionEvent ae) {

        boolean[] result = share.method();

        if (result[0]) 
            panel.setBackground(Color.RED);
        else if (result[1]) 
            panel.setBackground(defaultColor);
        else 
            panel.setBackground(Color.GREEN);
    }

}
