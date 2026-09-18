package java_collection_freamwork.HashSet;

import java.util.HashSet;

public class HashSet_method {
    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();

        set.add(10);
        set.add(20);
        set.add(30);
        //contains()
        set.contains(30);
        //remove()
        set.remove(20);
        System.out.println(set);
        //size()
        System.out.println(set.size());
        //isEmpty()
        System.out.println(set.isEmpty());
        //clear()
        set.clear();
        System.out.println(set);
    }
}
