import java.util.*;

public class PeopleFile {

    public static class Person implements Comparable<Person> {
        private String name, address;
        private double salary;
        public Person(String name, String address, double salary) {
            this.name = name;
            this.address = address;
            this.salary = salary;
        }
        public String getName() { return name; }
        public String getAddress() { return address; }
        public double getSalary() { return salary; }
        public int compareTo(Person o) {
            return this.name.compareTo(o.name);
        }
    }


    private Person[] people;
    private Sorter<Person> s;

    public PeopleFile(Set<Person> people) {
        this.people = new Person[people.size()];
        Iterator<Person> it; 
        int i;
        for (it = people.iterator(), i = 0; it.hasNext(); i++) 
            this.people[i] = it.next();
        s = ....
    }

    public double averageSalary() {
        double total = 0;
        for (int i = 0; i < people.length; i++)
            total += people[i].getSalary();
        return total / people.length;
    }

    public void sort() { s.sort(people); }
}

