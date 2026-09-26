package Dsa_with_basic_question.Array;

import DSA.Level1.Stage6_Searching.last_occurrence;

public class reverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,6,8,10};
        int left = 0;
        int right = arr.length-1;

        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;

        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
