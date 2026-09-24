package java_collection_freamwork.TreeMap;
import java.util.TreeMap;

public class methods {
    public static void main(String[] args) {

        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(30, "C");
        map.put(10, "A");
        map.put(20, "B");
        map.put(40, "D");

        System.out.println("TreeMap: " + map);

        System.out.println("Value of 20: " + map.get(20));

        System.out.println("First Key: " + map.firstKey());

        System.out.println("Last Key: " + map.lastKey());
    }
}

// output:
// TreeMap: {10=A, 20=B, 30=C, 40=D}
// Value of 20: B
// First Key: 10
// Last Key: 40