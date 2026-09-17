package java_collection_freamwork.ArrayList;
import java.util.*;
public class secondLargest {
   public static void main(String[] args) {
     ArrayList<Integer> list = new ArrayList<>();
      list.add(10);
      list.add(20);
      list.add(30);
      list.add(20);
      list.add(50);
      int largest = Integer.MIN_VALUE;
      int secondLargest = Integer.MIN_VALUE;

      for(int i=0;i<list.size();i++){
        int num = list.get(i);
        if(num > largest){
            secondLargest = largest;
            largest = num;
        }
        else if (num > secondLargest && num != largest) {
            secondLargest = num;
        }
      }

       System.out.println("Largest = " + largest);
       System.out.println("Second Largest = " + secondLargest);
   } 
}
