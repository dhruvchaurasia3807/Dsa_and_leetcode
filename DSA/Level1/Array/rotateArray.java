public class rotateArray {
   public static void main(String[] args) {
    int arr[] = {1,2,3,4,5};

    int rotation = 2;
    for(int  r=1;r<=rotation;r++){
        int last = arr[arr.length-1];

        for(int i= arr.length-1;i>0;i--){
            arr[i] = arr[i-1];//right shift
        }
        arr[0] = last;
    }

    for(int item:arr){
        System.out.print(item+" ");
    }
   } 
}

// output:4 5 1 2 3 
