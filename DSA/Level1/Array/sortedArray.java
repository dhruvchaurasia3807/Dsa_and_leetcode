package DSA.Level1.Array;

public class sortedArray {
    public static void main(String[] args) {
        int arr[] = {1,2,4,6,7,8};
        boolean sorted = true;

        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                sorted = false;
                break;
            }
            
        }
        if(sorted){
            System.out.println("Array is sorted ");
        }else{
            System.out.println("array is not sorted");
        }
    }
}

// output:Array is sorted 