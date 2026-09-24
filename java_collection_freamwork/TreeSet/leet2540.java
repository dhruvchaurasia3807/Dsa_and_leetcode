package java_collection_freamwork.TreeSet;
public class leet2540 {

    public static int getCommon(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;

        int i = 0; // for nums1
        int j = 0; // for nums2

        while (i < m && j < n) {

            if (nums1[i] == nums2[j]) {
                return nums1[i];
            } 
            else if (nums1[i] < nums2[j]) {
                i++;
            } 
            else {
                j++;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {2, 4, 5, 6};

        int result = getCommon(nums1, nums2);

        System.out.println(result);
    }
}

// output:2