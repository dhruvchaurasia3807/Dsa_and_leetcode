package java_collection_freamwork.ArrayList;
import java.util.ArrayList;
public class removeElement {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        list.remove(1);
        System.out.println(list);
    }
}

 
// output:
//[10, 30]