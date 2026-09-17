package java_collection_freamwork.HashMap;
import java.util.HashMap;
public class FindDuplicate {
    public static void main(String[] args) {
        int[] arr = {10,20,30,20};

        HashMap<Integer,Integer> map = new HashMap<>();
        boolean duplicate = false;

        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                duplicate = true;
                break;
            }
            map.put(arr[i], 1);
        }

        System.out.println(duplicate);
    }
}
