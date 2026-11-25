package Dsa_with_basic_question.Recursion;
public class binary_to_decimal {

    static int binaryToDecimal(int binary, int power) {

        // Base Case
        if (binary == 0) {
            return 0;
        }

        // Extract Last Digit
        int digit = binary % 10;

        // Recursive Call
        return digit * (int)Math.pow(2, power)
                + binaryToDecimal(binary / 10, power + 1);
    }

    public static void main(String[] args) {

        int binary = 1011;

        System.out.println(binaryToDecimal(binary, 0));
    }
}


// output:11