package Dsa_with_basic_question.Array;

public class largest {
    public static void main(String[] args) {
        int[] num = {22,3,54,7,10};
        int largest = Integer.MIN_VALUE;

        for(int i=0;i<num.length;i++){
            if(num[i] > largest){
                largest = num[i];
            }
        }
        System.out.println("largest = " + largest);

    }
}

// output:largest = 54