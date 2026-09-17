package java_collection_freamwork.HashMap;
import java.util.HashMap;
public class getValue {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap <>();
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Mango");

        System.out.println(map.get(2));
        System.out.println(map.get(3));
        System.out.println(map.get(4));

    }
}

// output:
// Banana
// Mango
//null