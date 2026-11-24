package Dsa_with_basic_question.Recursion;

public class product_of_array {

    static int product(int[] arr, int index) {

        // Base Case
        if (index == arr.length) {
            return 1;
        }

        // Recursive Call
        return arr[index] * product(arr, index + 1);
    }

    public static void main(String[] args) {

        int[] arr = {2, 3, 4};

        System.out.println(product(arr, 0));
    }
}

// output:24