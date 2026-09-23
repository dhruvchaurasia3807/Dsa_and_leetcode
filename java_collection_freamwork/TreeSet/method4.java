package java_collection_freamwork.TreeSet;

import java.util.TreeSet;

public class method4 {
    public static void main(String[] args) {

        TreeSet<Integer> set = new TreeSet<>();

        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);

        System.out.println("First removed: " + set.pollFirst());

        System.out.println("Last removed: " + set.pollLast());

        System.out.println("Remaining: " + set);

        System.out.println("Descending: " + set.descendingSet());
    }
}

// output:
// First removed: 10
// Last removed: 40
// Remaining: [20, 30]

// Descending: [30, 20]