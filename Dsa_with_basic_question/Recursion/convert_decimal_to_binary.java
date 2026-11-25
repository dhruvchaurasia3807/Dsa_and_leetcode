package Dsa_with_basic_question.Recursion;

public class convert_decimal_to_binary {

    static void decimalToBinary(int n) {

        // Base Case
        if (n == 0) {
            return;
        }

        // Recursive Call
        decimalToBinary(n / 2);

        // Print Remainder
        System.out.print(n % 2);
    }

    public static void main(String[] args) {

        int n = 10;

        if (n == 0) {
            System.out.print(0);
        } else {
            decimalToBinary(n);
        }
    }
}


// output:1010