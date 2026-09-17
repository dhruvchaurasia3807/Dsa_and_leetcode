package java_collection_freamwork.HashMap;

import java.util.HashMap;

public class twosum {
    public static void main(String[] args) {

        int[] arr = {2, 7, 11, 15};
        int target = 9;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            int need = target - arr[i];

            if (map.containsKey(need)) {

                System.out.println("Pair found");
                break;
            }

            map.put(arr[i], i);
        }
    }
}


// output:Pair found