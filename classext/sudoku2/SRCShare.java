package sudoku2;

import java.util.*;

public class SRCShare {

    /**
     * The entries constituting this row or column.
     */
    private ArrayList<Entry> entries;

    
    public SRCShare(Entry[] entries) {
        this.entries = new ArrayList<Entry>();
        for (int i = 0; i < entries.length; i++)
            this.entries.add(entries[i]);
    }

    public boolean[] method() {
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
        boolean[] toReturn = new boolean[2];
        toReturn[0] = violation;
        toReturn[1] = unknowns;

        return toReturn;
    }


}
