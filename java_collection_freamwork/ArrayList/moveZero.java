package java_collection_freamwork.ArrayList;

public class moveZero {
    public static int zeroMove(int[] arr){
        int i=0;
        int j=0;
        for( i=0;i<arr.length;i++){
            if(arr[i]!=0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
          
        }
        return j;
    }
    public static void main(String[] args) {
        int[] arr = {1,0,2,0,3};
        int result = zeroMove(arr);
        //System.out.println(result);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
