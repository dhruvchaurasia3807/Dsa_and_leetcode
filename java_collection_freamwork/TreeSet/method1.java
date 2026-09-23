package java_collection_freamwork.TreeSet;

import java.util.TreeSet;

public class method1 {
    public static void main(String[] args) {

        TreeSet<Integer> set = new TreeSet<>();

        // Add elements
        set.add(30);
        set.add(10);
        set.add(20);
        set.add(40);

        System.out.println("TreeSet: " + set);

        // Smallest element
        System.out.println("Smallest: " + set.first());

        // Largest element
        System.out.println("Largest: " + set.last());

        // Check element
        System.out.println("Contains 20: " + set.contains(20));
    }
}

// output:
// TreeSet: [10, 20, 30, 40]
// Smallest: 10
// Largest: 40
// Contains 20: true