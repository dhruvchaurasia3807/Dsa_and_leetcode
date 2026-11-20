package Dsa_with_basic_question.Recursion;

public class print_no {
    static void printRecursion(int n){
        //base case
        if(n==0){
            return;
        }
        System.out.println(n);
        
        //recursive call
        printRecursion(n-1);
    }
    public static void main(String[] args) {
        printRecursion(5);
    }
}

// output:
// 5
// 4
// 3
// 2
// 1