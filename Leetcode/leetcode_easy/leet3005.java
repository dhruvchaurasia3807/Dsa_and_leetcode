public class leet3005 {

    public static int maxFrequencyElements(int[] nums) {

        int[] arr = new int[101];

        // Frequency count
        for (int i = 0; i < nums.length; i++) {
            arr[nums[i]]++;
        }

        // Find max frequency
        int maxfreq = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxfreq) {
                maxfreq = arr[i];
            }
        }

        // Count elements having max frequency
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == maxfreq) {
                count++;
            }
        }

        return count * maxfreq;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 2, 3, 1, 4};

        int answer = maxFrequencyElements(nums);

        System.out.println(answer);
    }
}

// output:4