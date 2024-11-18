import java.util.*;

public abstract class PeopleFile {

    private Person[] people;
    private Sorter<Person> s;

    public PeopleFile(Set<Person> people) {
        this.people = new Person[people.size()];
        Iterator<Person> it; 
        int i;
        for (it = people.iterator(), i = 0; it.hasNext(); i++) 
            this.people[i] = it.next();
    }

    public double averageSalary() {
        double total = 0;
        for (int i = 0; i < people.length; i++)
            total += people[i].getSalary();
        return total / people.length;
    }

    public void sort() { s.sort(people); }
}

import java.util.*;

public abstract class CheckFile {

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


