package java_collection_freamwork.TreeMap;

import java.util.TreeMap;

public class printElement_treemap {
    public static void main(String[] args) {

        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(30, "C");
        map.put(10, "A");
        map.put(20, "B");
        map.put(40, "D");

        System.out.println(map);
    }
}

// output:{10=A, 20=B, 30=C, 40=D}