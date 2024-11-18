import java.util.*;

public abstract class Sorter<E extends Comparable<E>> {

    abstract public void sort(E[] things);

    public static class Insertion<F extends Comparable<F>> extends Sorter<F> {

        public void sort(F[] things) {
            for (int i = 1; i < things.length; i++) {
                F val = things[i];
                for (int j = i - 1; ; j--) {
                    if (j == -1) {
                        things[0] = val;
                        break;
                    }
                    else {
                        if (val.compareTo(things[j]) < 0)
                            things[j+1] = things[j];
                        else {
                            things[j+1] = val;
                            break;
                        }
                    }
                }
            }
        }
    }

    public static class Selection<F extends Comparable<F>> extends Sorter<F> {

        public void sort(F[] things) {
            for (int i = 0; i < things.length; i++) {
                F smallest = things[i];
                int smallestPos = i;
                for (int j = i+1; j < things.length; j++) {
                    if (things[j].compareTo(smallest) < 0) {
                        smallest = things[j];
                        smallestPos = j;
                    }
                }
                things[smallestPos] = things[i];
                things[i] = smallest;
            }
        }
    }

    public static class Bubble<F extends Comparable<F>> extends Sorter<F> {

        public void sort(F[] things) {
            boolean changed = true;
            int ending = things.length;
            while(changed) {
                changed = false;
                for (int i = 1; i < ending; i++) {
                       F temp = things[i];
                        things[i] = things[i - 1];
                        things[i - 1] = temp;
                        changed = true;
                    }
                }
                ending--;
            }
        }
}

