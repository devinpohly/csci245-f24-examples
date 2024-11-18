import java.util.*;

public class CheckFile {

    public static class Check implements Comparable<Check> {
        private String name, date;
        private double amount;
        public Check(String name, String date, double salary) {
            this.name = name;
            this.date = date;
            this.amount = amount;
        }
        public String getName() { return name; }
        public String getDate() { return date; }
        public double getAmount() { return amount; }
        public int compareTo(Check o) {
            return this.date.compareTo(o.date);
        }
    }


    protected Check[] checks;
    private Sorter<Check> s;

    public CheckFile(Set<Check> checks) {
        this.checks = new Check[checks.size()];
        Iterator<Check> it; 
        int i;
        for (it = checks.iterator(), i = 0; it.hasNext(); i++) 
            this.checks[i] = it.next();
    }

    public double averageAmount() {
        double total = 0;
        for (int i = 0; i < checks.length; i++)
            total += checks[i].getAmount();
        return total / checks.length;
    }

    public void sort() { s.sort(checks); }
}


