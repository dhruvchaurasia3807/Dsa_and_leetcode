import java.util.Arrays;

class Solution {
    public int[][] divideArray(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);

        int[][] result = new int[n / 3][3];
        int index = 0;

        for (int i = 0; i <= n - 3; i += 3) {
            if (nums[i + 2] - nums[i] > k) {
                return new int[0][0];
            }

            result[index++] = new int[] {
                nums[i], nums[i + 1], nums[i + 2]
            };
        }

        return result;
    }
}

public class leet2966 {
    public static void main(String[] args) {

        int[] nums = {1, 3, 4, 8, 7, 9};
        int k = 2;

        Solution obj = new Solution();

        int[][] result = obj.divideArray(nums, k);

        for (int i = 0; i < result.length; i++) {
            System.out.println(
                result[i][0] + " " +
                result[i][1] + " " +
                result[i][2]
            );
        }
    }
}

// output:
// 1 3 4
// 7 8 9