package DSA.Level1.Array;

public class secondLargest {
    public static void main(String[] args) {
        int arr[] = {1,3,5,7,99,23,56};
        int largest = 0;
        int second_largest = 0;

        int n = arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                second_largest = largest;
                largest = arr[i];
            }else{
                second_largest = Math.max(second_largest, arr[i]);
            }
        }
        System.out.println("the second largest elements  is = "+ second_largest);
    }
}
