package DSA.Level1.Stage7_TwoPointers;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6,2};
        int left = 0;
        int right = arr.length-1;

        while(left<right){
           int temp = arr[left];
           arr[left] = arr[right];
           arr[right] = temp;

           left++;
           right--;
        }

        for(int item:arr){
            System.out.print(item+" ");
        }
    }
}

// output:2 6 5 3 1 
