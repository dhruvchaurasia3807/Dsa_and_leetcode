package Dsa_with_basic_question.Recursion;

public class fibo_index {

    static int fib(int n) {

        // Base Case
        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        // Recursive Call
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(fib(6));
    }
}


// output:8