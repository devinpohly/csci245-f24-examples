package sudoku4;

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
import java.util.*;

public class Square extends Container  {


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
        super(entries);
        panel = new JPanel();
        for (int i = 0; i < entries.length; i++) 
            panel.add(entries[i].display());
        defaultColor = panel.getBackground();
    }

    /**
     * Accessor method for the panel.
     * @return The panel showing the entries.
     */
    public Component getPanel() { return panel; }

    protected void handleViolation() {
        panel.setBackground(Color.RED);
    }

    protected void handleUnknowns() {
        panel.setBackground(defaultColor);
    }

    protected void handleFinished() {
        panel.setBackground(Color.GREEN);
    }

}
