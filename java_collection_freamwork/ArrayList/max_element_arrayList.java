package java_collection_freamwork.ArrayList;
import java.util.ArrayList;
public class max_element_arrayList{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        
        int max  = list.get(0);

        for(int i=0;i<list.size();i++){
            if(list.get(i)>max){
                max = list.get(i);
            }
        }

        System.out.println(max);

        
    }
}

 
// output:
//30