package DSA.Level1.Stage7_TwoPointers;

public class moveZeroToEnd {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 0, 3, 12 };
        int left = 0;

        for (int right = 0; right < arr.length; right++) {
            if (arr[right] != 0) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}

// output:1 3 12 0 0 
// time:o(n)
// space:o(1)