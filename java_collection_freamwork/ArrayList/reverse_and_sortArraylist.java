package java_collection_freamwork.ArrayList;
import java.util.ArrayList;
import java.util.Collections;
public class reverse_and_sortArraylist{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        
        Collections.reverse(list);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);   
    }
}

 
// output:
// [30, 20, 10]
// [10, 20, 30]
// [30, 20, 10]