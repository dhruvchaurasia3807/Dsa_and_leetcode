package DSA.Level1.Searching_Sorting;

public class selection_sort {
    public static void main(String[] args) {
        int[] arr = {2,6,1,23,45,76,12};

        for(int i=0;i<arr.length-1;i++){
            int smallestIndex = i;
            for(int j= i+1;j<arr.length-1;j++){
                if(arr[j]<arr[smallestIndex]){
                    smallestIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[smallestIndex];
            arr[smallestIndex] = temp;
        }

        for(int item:arr){
            System.out.print(item + " ");
        }
    }
}


// output:1 2 6 23 45 76 12 