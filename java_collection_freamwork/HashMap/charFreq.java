package java_collection_freamwork.HashMap;

import java.util.HashMap;

public class charFreq {
    public static void main(String[] args) {
        String s = "banana";
        HashMap<Character,Integer> map = new HashMap<>();

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        System.out.println(map);
    }
}

// output:{a=3, b=1, n=2}