package Dsa_with_basic_question.Array;

import java.util.HashMap;

public class freq_count {
    public static void main(String[] args) {
       int[] arr = {1, 2, 2, 3, 1, 2};
       HashMap<Integer,Integer> map = new HashMap<>();
       for(int i=0;i<arr.length;i++){
        map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
       }
       System.out.println(map);
    }
}
