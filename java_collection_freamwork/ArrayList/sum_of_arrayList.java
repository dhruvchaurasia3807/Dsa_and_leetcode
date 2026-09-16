package java_collection_freamwork.ArrayList;
import java.util.ArrayList;
public class sum_of_arrayList{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        
        int sum = 0;

        for(int i=0;i<list.size();i++){
            sum=sum+list.get(i);
        }

        System.out.println(sum);

        
    }
}

 
// output:
//60