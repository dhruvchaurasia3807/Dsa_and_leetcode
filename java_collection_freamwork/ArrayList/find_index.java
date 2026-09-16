package java_collection_freamwork.ArrayList;
import java.util.ArrayList;
public class find_index{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(20);
        
        System.out.println(list.indexOf(20));     //index
        System.out.println(list.lastIndexOf(20));  //last index

        
    }
}

 
// output:
// 1
// 3