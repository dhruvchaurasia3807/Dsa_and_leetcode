package java_collection_freamwork.HashMap;
import java.util.HashMap;
public class freqCount {
    public static void main(String[] args) {
        int[] arr = {10,20,10,30,20,10};
        
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }
        System.out.println(map);
    }
}


// output:{20=2, 10=3, 30=1}