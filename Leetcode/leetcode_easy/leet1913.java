public class leet1913 {

    public static int maxProductDifference(int[] nums) {

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int num : nums) {

            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else {
                secondLargest = Math.max(secondLargest, num);
            }

            
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else {
                secondSmallest = Math.min(secondSmallest, num);
            }
        }

        return (largest * secondLargest) - (secondSmallest * smallest);
    }

    public static void main(String[] args) {

        int[] nums = {5, 6, 2, 7, 4};

        int result = maxProductDifference(nums);

        System.out.println("Maximum Product Difference = " + result);
    }
}

// output:Maximum Product Difference = 34