package java_collection_freamwork.HashMap;
import java.util.HashMap;
public class putElement {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap <>();
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Mango");

        System.out.println(map);

    }
}

// output:{1=Apple, 2=Banana, 3=Mango}