package sudoku4;

import java.util.*;
import java.awt.event.*;

public abstract class Container implements ActionListener {


    /**
     * The entries constituting this row or column.
     */
    private ArrayList<Entry> entries;


    protected Container(Entry[] entries) {
        this.entries = new ArrayList<Entry>();
        for (int i = 0; i < entries.length; i++)
            this.entries.add(entries[i]);

    }
    
    public void actionPerformed(ActionEvent ae) {

        boolean unknowns = false;    // have we encountered any unknowns?
        boolean violation = false;     // Have we found a violation?
        
        // The set of things we should find in a complete row
        HashSet<String> values = new HashSet<String>();
        for (int i = 1; i < 10; i++)
            values.add(i + "");

        for (Iterator<Entry> it = entries.iterator(); it.hasNext(); ) {

            // the value we've found in the current entry
            String value = it.next().value();  

            if (value.equals("")) 
                unknowns = true;
            else if (! values.contains(value)) 
                violation = true;
            else 
                values.remove(value);
        }
        if (violation) {
            handleViolation();
        }
        else if (unknowns) {
            handleUnknowns();
        }
        else {
            handleFinished();
        }

    }
    abstract protected void handleViolation();
    abstract protected void handleUnknowns();
    abstract protected void handleFinished();


}
