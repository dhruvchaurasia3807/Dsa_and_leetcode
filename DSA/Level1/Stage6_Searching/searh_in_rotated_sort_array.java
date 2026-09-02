package DSA.Level1.Stage6_Searching;
public class searh_in_rotated_sort_array {
    public static void main(String[] args) {

        int[] arr = {4, 5, 6, 7, 0, 1, 2};

        int target = 0;

        int left = 0;
        int right = arr.length - 1;

        int answer = -1;

        while (left <= right) {

            int mid = (left + right) / 2;

            if (arr[mid] == target) {

                answer = mid;
                break;
            }

            // Left side sorted hai
            if (arr[left] <= arr[mid]) {

                if (target >= arr[left] && target < arr[mid]) {

                    right = mid - 1;

                } else {

                    left = mid + 1;
                }

            }

            // Right side sorted hai
            else {

                if (target > arr[mid] && target <= arr[right]) {

                    left = mid + 1;

                } else {

                    right = mid - 1;
                }
            }
        }

        System.out.println("Index = " + answer);
    }
}

// output:Index = 4