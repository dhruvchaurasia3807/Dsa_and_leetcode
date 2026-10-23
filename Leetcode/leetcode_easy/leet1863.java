
public class leet1863 {

    private static int solve(int i, int[] nums, int Xor) {
        if (i == nums.length) {
            return Xor;
        }

        int include = solve(i + 1, nums, nums[i] ^ Xor);
        int exclude = solve(i + 1, nums, Xor);

        return include + exclude;
    }

    public static int subsetXORSum(int[] nums) {
        return solve(0, nums, 0);
    }

    public static void main(String[] args) {
        int[] nums = {1, 3};

        int result = subsetXORSum(nums);

        System.out.println("Sum of XOR of all subsets: " + result);
    }
}

// output:
// Sum of XOR of all subsets: 6