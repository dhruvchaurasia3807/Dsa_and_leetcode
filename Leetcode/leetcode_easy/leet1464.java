public class leet1464 {

    public static int maxProduct(int[] nums) {

        int firstmax = 0;
        int secondmax = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] > firstmax) {
                secondmax = firstmax;
                firstmax = nums[i];
            } else {
                secondmax = Math.max(secondmax, nums[i]);
            }
        }

        return (firstmax - 1) * (secondmax - 1);
    }

    public static void main(String[] args) {

        int[] nums = {3, 4, 5, 2};

        int result = maxProduct(nums);

        System.out.println("Maximum Product = " + result);
    }
}

// output:Maximum Product = 12