package java_collection_freamwork.Iterator;

import java.util.*;

public class Iterator_with_HashSet{
    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();

        set.add(10);
        set.add(20);
        set.add(30);

        Iterator<Integer> it = set.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}

// output:
// 20
// 10
// 30