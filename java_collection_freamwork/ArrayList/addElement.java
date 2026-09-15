package java_collection_freamwork.ArrayList;
import java.util.ArrayList;
public class addElement {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list);

        list.add(1,15);

        System.out.println(list);
    }
}

 
// output:
// [10, 20, 30]
// [10, 15, 20, 30]