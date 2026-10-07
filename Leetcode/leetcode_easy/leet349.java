import java.util.*;

public class leet349 {

    public static int[] intersection(int[] nums1, int[] nums2) {

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int m = nums1.length;
        int n = nums2.length;

        List<Integer> result = new ArrayList<>();

        int i = 0;
        int j = 0;

        while (i < m && j < n) {

            if (nums1[i] == nums2[j]) {

                result.add(nums1[i]);

                while (i < m - 1 && nums1[i] == nums1[i + 1]) {
                    i++;
                }

                while (j < n - 1 && nums2[j] == nums2[j + 1]) {
                    j++;
                }

                i++;
                j++;

            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }

        int[] ans = new int[result.size()];

        for (int k = 0; k < result.size(); k++) {
            ans[k] = result.get(k);
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] nums1 = {1, 2, 2, 3, 4};
        int[] nums2 = {2, 2, 4, 5};

        int[] ans = intersection(nums1, nums2);

        System.out.println(Arrays.toString(ans));
    }
}

// output:
// [2, 4]