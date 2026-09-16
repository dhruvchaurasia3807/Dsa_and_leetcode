package java_collection_freamwork.ArrayList;
import java.util.ArrayList;
public class methods{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list.contains(10));
        System.out.println(list.contains(15));

        System.out.println(list.size());

        System.out.println(list.isEmpty());
        System.out.println(list);

        list.clear();

        System.out.println(list);

        
    }
}

 
// output:
// true
// false
// 3
// false
// [10, 20, 30]
// []