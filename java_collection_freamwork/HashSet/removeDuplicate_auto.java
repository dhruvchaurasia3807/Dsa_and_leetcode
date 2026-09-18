package java_collection_freamwork.HashSet;
import java.util.HashSet;

public class removeDuplicate_auto {
    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();

        set.add(10);
        set.add(20);
        set.add(10);
        set.add(30);
        set.add(20);

        System.out.println(set);
    }
}

// output:
// [20, 10, 30]