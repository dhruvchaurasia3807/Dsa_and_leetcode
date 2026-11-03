package Dsa_with_basic_question.Array;

public class reverse_array_using_loop {
    public static void main(String[] args) {
        int[] arr = {2,134,1,0,45,74,-1};
        //only print arr elements
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        //print reverse of elemetns
        for(int i = arr.length-1;i>=0;i--){
            System.out.print(arr[i] + " ");
        }
    }
}


// output:
// 2 134 1 0 45 74 -1 
// -1 74 45 0 1 134 2 