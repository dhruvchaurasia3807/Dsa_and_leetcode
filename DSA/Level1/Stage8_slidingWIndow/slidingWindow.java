package DSA.Level1.Stage8_slidingWIndow;
public class slidingWindow {

    public static int maxSum(int[] arr, int k) {

        int windowSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int left = 0;

        for (int right = 0; right < arr.length; right++) {

            windowSum += arr[right];

            if (right >= k - 1) {

                maxSum = Math.max(maxSum, windowSum);

                windowSum -= arr[left];
                left++;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {

        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;

        int result = maxSum(arr, k);

        System.out.println(result);
    }
}

// output:9