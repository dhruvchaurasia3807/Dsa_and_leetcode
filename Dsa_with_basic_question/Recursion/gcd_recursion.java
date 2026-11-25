package Dsa_with_basic_question.Recursion;
public class gcd_recursion {

    static int gcd(int a, int b) {

        // Base Case
        if (b == 0) {
            return a;
        }

        // Recursive Call
        return gcd(b, a % b);
    }

    public static void main(String[] args) {

        System.out.println(gcd(12, 8));
    }
}

// output:4