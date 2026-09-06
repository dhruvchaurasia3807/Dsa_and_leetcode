package DSA.Level1.Stage7_TwoPointers;

public class removeDuplicateFromSortedArray {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3};

        int left = 0;
        
        for(int right = 1;right<arr.length;right++){
           if(arr[left] != arr[right]){
            left++;

            arr[left] = arr[right];
           }
        }

        for(int i=0;i<=left;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

// output:1 2 3 