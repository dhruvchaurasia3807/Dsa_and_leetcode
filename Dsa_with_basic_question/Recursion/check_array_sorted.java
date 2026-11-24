package Dsa_with_basic_question.Recursion;

public class check_array_sorted {

    static boolean isSorted(int[] arr, int index) {

        // Base Case
        if (index == arr.length - 1) {
            return true;
        }

        // Check Current and Next Element
        if (arr[index] > arr[index + 1]) {
            return false;
        }

        // Recursive Call
        return isSorted(arr, index + 1);
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        System.out.println(isSorted(arr, 0));
    }
}

// output:true