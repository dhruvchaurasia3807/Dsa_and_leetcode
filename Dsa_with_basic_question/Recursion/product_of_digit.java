package Dsa_with_basic_question.Recursion;

public class product_of_digit {

    static int product(int n) {

        // Base Case
        if (n == 0) {
            return 1;
        }

        // Recursive Call
        return (n % 10) * product(n / 10);
    }

    public static void main(String[] args) {
        System.out.println(product(1234));
    }
}

// output:24