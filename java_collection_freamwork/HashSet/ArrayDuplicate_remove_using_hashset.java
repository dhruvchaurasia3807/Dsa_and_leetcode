package java_collection_freamwork.HashSet;

import java.util.HashSet;

public class ArrayDuplicate_remove_using_hashset {
    public static void main(String[] args) {

        int[] arr = {10, 20, 10, 30, 20, 40};

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        System.out.println(set);
    }
}

// output:[20, 40, 10, 30]