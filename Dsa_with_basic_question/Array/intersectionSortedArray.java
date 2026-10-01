package Dsa_with_basic_question.Array;
import java.util.*;
public class intersectionSortedArray {

  public static ArrayList<Integer> intersection(int[] arr1,int[] arr2){
    ArrayList<Integer> result = new ArrayList<>();
    int i = 0;
    int j = 0;
    while(i<arr1.length && j<arr2.length){
        if(arr1[i] < arr2[j]){
            i++;
        }
        else if(arr1[i] > arr2[j]){
            j++;
        }
        else{
            result.add(arr1[i]);
            i++;
        }
    }
    return result;
  }
    public static void main(String[] args) {
       int[] arr1 = {1,2,3,4,5};
       int[] arr2 = {2,3,5,6,7};
       
       ArrayList<Integer> result = intersection(arr1,arr2);
       System.out.println(result);
    }
}

// output:[2, 3, 5]