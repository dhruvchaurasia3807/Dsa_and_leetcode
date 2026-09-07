package DSA.Level1.Stage7_TwoPointers;

public class remove_given_element {
    public static void main(String[] args) {

        int[] arr = {3, 2, 2, 3};
        int target = 3;

        int left = 0;

        for (int right = 0; right < arr.length; right++) {

            if (arr[right] != target) {

                arr[left] = arr[right];
                left++;
            }
        }

        for (int i = 0; i < left; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

// output:2 2