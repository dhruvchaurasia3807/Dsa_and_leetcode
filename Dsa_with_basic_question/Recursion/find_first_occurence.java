package Dsa_with_basic_question.Recursion;

public class find_first_occurence {

    static int findElement(int[] arr, int index, int target) {

        // Base Case
        if (index == arr.length) {
            return -1;
        }

        // Check Current Element
        if (arr[index] == target) {
            return index;
        }

        // Recursive Call
        return findElement(arr, index + 1, target);
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 20, 40};

        int result = findElement(arr, 0, 20);

        System.out.println(result);
    }
}

// output:1