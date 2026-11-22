package Dsa_with_basic_question.Recursion;

public class count_evenNo {

    static int countEven(int n) {

        // Base Case
        if (n == 0) {
            return 0;
        }

        int digit = n % 10;

        // Recursive Call
        if (digit % 2 == 0) {
            return 1 + countEven(n / 10);
        } else {
            return countEven(n / 10);
        }
    }

    public static void main(String[] args) {
        System.out.println(countEven(123456));
    }
}

// output:3