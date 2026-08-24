package DSA.Level1.Array;

public class smallno {
    public static void main(String[] args) {
        int arr[] = {2,4,5,6,22,1};
        int small = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<small){
                small = arr[i];
            }
        }
        System.out.println("the smallest element is = "+ small);
    }
}


// output:the smallest element is = 1