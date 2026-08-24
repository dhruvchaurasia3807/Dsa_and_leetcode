package DSA.Level1.Array;

public class findLargest_elements {
    public static void main(String[] args) {
        int arr[] = {2,3,56,7,88,4};
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("largest no is = "+max);
    }
}

// output:largest no is = 88