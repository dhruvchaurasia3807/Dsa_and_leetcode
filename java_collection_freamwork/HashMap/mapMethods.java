package java_collection_freamwork.HashMap;
import java.util.HashMap;
public class mapMethods {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap <>();
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Mango");

        //containsKey()
        if(map.containsKey(2)){
            System.out.println("key exists");
        }
        
        //remove
        map.remove(1);
        System.out.println(map);

        //size()
        System.out.println(map.size());

        //isEmpty()
        System.out.println(map.isEmpty());

        //clear()
        map.clear();
        System.out.println(map);

    }
}

// output:
// key exists
// {2=Banana, 3=Mango}
// 2
// false
// {}