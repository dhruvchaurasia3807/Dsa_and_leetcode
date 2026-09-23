package java_collection_freamwork.Comparator;

import java.util.*;

public class comprator_with_Integer {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(5);
        list.add(30);
        list.add(20);

        list.sort(Comparator.reverseOrder());

        System.out.println(list);
    }
}

// output:[30, 20, 10, 5]