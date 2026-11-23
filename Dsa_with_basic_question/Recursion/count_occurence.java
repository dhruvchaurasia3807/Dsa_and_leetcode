package Dsa_with_basic_question.Recursion;


public class count_occurence {

    static int count(int[] arr, int index, int target) {

        if (index == arr.length) {
            return 0;
        }

        if (arr[index] == target) {
            return 1 + count(arr, index + 1, target);
        }

        return count(arr, index + 1, target);
    }

    public static void main(String[] args) {

        int[] arr = {2, 5, 2, 8, 2, 9};

        System.out.println(count(arr, 0, 2));
    }
}

// output:3