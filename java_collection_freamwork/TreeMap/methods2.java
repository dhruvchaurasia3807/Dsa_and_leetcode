package java_collection_freamwork.TreeMap;
import java.util.TreeMap;

public class methods2 {
    public static void main(String[] args) {

        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(10, "A");
        map.put(20, "B");
        map.put(30, "C");
        map.put(40, "D");

        System.out.println("Key 20 exists: " + map.containsKey(20));

        System.out.println("Value C exists: " + map.containsValue("C"));

        map.remove(30);

        System.out.println("Size: " + map.size());

        System.out.println(map);
    }
}

// output:Key 20 exists: true
// Value C exists: true
// Size: 3
// {10=A, 20=B, 40=D}