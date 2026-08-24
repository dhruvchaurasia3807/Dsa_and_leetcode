package DSA.Level1.Searching_Sorting;

public class bubble_sort {
    public static void main(String[] args) {
        int[] arr = {2,45,1,34,57,29};

        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for(int item:arr){
            System.out.print(item+" ");
        }
    }
    
}
