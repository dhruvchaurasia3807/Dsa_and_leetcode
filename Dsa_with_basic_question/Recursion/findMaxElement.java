package Dsa_with_basic_question.Recursion;

public class findMaxElement {

    static int findMax(int[] arr, int index) {

        // Base Case
        if (index == arr.length - 1) {
            return arr[index];
        }

        int max = findMax(arr, index + 1);

        return Math.max(arr[index], max);
    }

    public static void main(String[] args) {

        int[] arr = {10, 25, 5, 40, 15};

        System.out.println(findMax(arr, 0));
    }
}

// output:40