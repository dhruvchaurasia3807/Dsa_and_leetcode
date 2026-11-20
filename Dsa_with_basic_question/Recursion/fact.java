package Dsa_with_basic_question.Recursion;

public class fact {
    static int recursive_fact(int n){
        //base case
        if(n==0 || n==1){
            return 1;
        }
        return n*recursive_fact(n-1);
    }
    public static void main(String[] args) {
        System.out.println(recursive_fact(5));
    }
}


// output:120