package java_collection_freamwork.TreeSet;

import java.util.TreeSet;

public class method2 {
    public static void main(String[] args) {

        TreeSet<Integer> set = new TreeSet<>();

        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);

        // Remove element
        set.remove(20);

        // Size
        System.out.println("Size: " + set.size());

        // Check empty
        System.out.println("Is Empty: " + set.isEmpty());

        // Clear all elements
        set.clear();

        System.out.println("After clear: " + set);
    }
}

// output:
// Size: 3
// Is Empty: false
// After clear: []