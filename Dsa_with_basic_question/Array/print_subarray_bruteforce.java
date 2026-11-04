package Dsa_with_basic_question.Array;

public class print_subarray_bruteforce {

    public static void print_subarray(int[] numbers){
        int ts = 0;
        for(int i=0;i<numbers.length;i++){
            int start = i;
            for(int j = i;j<numbers.length;j++){
                int end = j;
                for(int k = start;k <= end;k++){ //only for print elements
                    System.out.print(numbers[k] + " ");//subarray
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total subarray = " + ts);
    }
   public static void main(String[] args) {
    int[] numbers = {2,4,6,8,10};
    print_subarray(numbers);
   } 
}


// output:
// 2 
// 2 4 
// 2 4 6 
// 2 4 6 8 
// 2 4 6 8 10 

// 4 
// 4 6 
// 4 6 8 
// 4 6 8 10 

// 6 
// 6 8 
// 6 8 10 

// 8 
// 8 10 

// 10 

// total subarray = 15