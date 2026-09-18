package java_collection_freamwork.HashSet;

import java.util.HashSet;

public class hashset_with_string {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();

        set.add("Apple");
        set.add("Banana");
        set.add("Apple");
        set.add("Mango");

        System.out.println(set);
    }
}

// output:[Apple, Mango, Banana]