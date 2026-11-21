package Dsa_with_basic_question.Recursion;

public class count_digit {
    static int countDigi(int n){
        if (n==0){
            return 0;
        }

        return 1 + countDigi(n/10);
    }
   public static void main(String[] args) {
    System.out.println(countDigi(12673));
   } 
}

// output:5