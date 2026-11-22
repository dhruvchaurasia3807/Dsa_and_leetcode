package Dsa_with_basic_question.Recursion;
public class palindrome_no {

    static int reverse(int n) {

        // Base Case
        if (n == 0) {
            return 0;
        }

        // Recursive Call
        return (n % 10) * (int)Math.pow(10, (int)Math.log10(n))
                + reverse(n / 10);
    }

    public static void main(String[] args) {

        int n = 121;

        if (n == reverse(n)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}


// output:Palindrome