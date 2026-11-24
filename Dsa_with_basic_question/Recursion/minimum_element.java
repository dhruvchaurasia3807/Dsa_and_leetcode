package Dsa_with_basic_question.Recursion;

public class minimum_element {

    static int findMin(int[] arr, int index) {

        // Base Case
        if (index == arr.length - 1) {
            return arr[index];
        }

        // Recursive Call
        int min = findMin(arr, index + 1);

        return Math.min(arr[index], min);
    }

    public static void main(String[] args) {

        int[] arr = {10, 5, 20, 3, 15};

        System.out.println(findMin(arr, 0));
    }
}

// output:3