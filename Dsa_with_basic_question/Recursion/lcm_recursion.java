package Dsa_with_basic_question.Recursion;
public class lcm_recursion {

    static int findLCM(int a, int b, int multiple) {

        // Base Case
        if (multiple % a == 0 && multiple % b == 0) {
            return multiple;
        }

        // Recursive Call
        return findLCM(a, b, multiple + 1);
    }

    public static void main(String[] args) {

        int a = 4;
        int b = 6;

        System.out.println(findLCM(a, b, Math.max(a, b)));
    }
}

// output:12