package java_collection_freamwork.HashMap;
import java.util.HashMap;
public class mostFrequent_element {
  public static void main(String[] args) {
    int[] arr = {10,20,10,30,20,10};
    HashMap<Integer,Integer> map = new HashMap<>();

    //count freq
    for(int i=0;i<arr.length;i++){
        map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
    }

    int maxFrequency = 0;
    int mostFrequent = 0;

    //find max frequency
    for(int i=0;i<arr.length;i++){
        int num = arr[i];

        if(map.get(num) > maxFrequency){
            maxFrequency = map.get(num);
            mostFrequent = num;
        }
    }

        System.out.println("Most frequent element: " + mostFrequent);
        System.out.println("Frequency: " + maxFrequency);
  }  
}


// output:
// Most frequent element: 10
// Frequency: 3