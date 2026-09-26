package Dsa_with_basic_question.Array;

public class Largest_and_secondLargest {
   public static void main(String[] args) {
    int[] arr = {10,25,35,20,5};
    int largest = Integer.MIN_VALUE;
    int second_largest = Integer.MIN_VALUE;

    for(int i=0;i<arr.length;i++){
        if(arr[i] > largest){
            second_largest = largest;
            largest = arr[i];
        }
        else if(arr[i] > second_largest && arr[i] != largest){
            second_largest = arr[i];
        }
    }

    System.out.println("largest : "+ largest);
    System.out.println("second largest : "+ second_largest);
   } 
}
