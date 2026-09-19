import java.util.Arrays;

public class leet977 {

    public static int[] sortedSquares(int[] nums) {
        int n = nums.length;

        // Step 1: Square every element
        for (int i = 0; i < n; i++) {
            nums[i] = nums[i] * nums[i];
        }

        // Step 2: Sort the squared array
        Arrays.sort(nums);

        return nums;
    }

    public static void main(String[] args) {

        int[] nums = {-4, -1, 0, 3, 10};

        int[] result = sortedSquares(nums);

        System.out.println(Arrays.toString(result));
    }
}

// output:[0, 1, 9, 16, 100]