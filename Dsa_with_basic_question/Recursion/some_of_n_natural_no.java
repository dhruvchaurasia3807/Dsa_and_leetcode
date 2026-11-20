package Dsa_with_basic_question.Recursion;

public class some_of_n_natural_no {
    static int sum(int n){
        if(n==0){
            return 0;
        }

        return n + sum(n-1);
    }
    public static void main(String[] args) {
        System.out.println(sum(5));
    }
}


// output:
// 15