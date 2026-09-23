package java_collection_freamwork.TreeSet;
import java.util.*;

public class printData {
    public static void main(String[] args) {

        TreeSet<Integer> set = new TreeSet<>();

        set.add(30);
        set.add(10);
        set.add(20);
        set.add(5);
        set.add(20);

        System.out.println(set);
    }
}

// output:[5, 10, 20, 30]