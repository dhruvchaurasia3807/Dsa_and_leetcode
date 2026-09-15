package java_collection_freamwork.ArrayList;
import java.util.ArrayList;
public class getElement {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list.get(0));
        System.out.println(list.get(2));
    }
}

 
// output:
// 10
// 30