package DSA.Level1.Stage7_TwoPointers;

public class twoSum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int target = 6;
        int left = 0;
        int right = arr.length-1;
        
        while(left<right){
            int sum = arr[left]+arr[right];
            if(sum == target){
                System.out.println("Pair = " + arr[left] + " , "+ arr[right]);
                break;
            }
            else if(sum > target){
                right--;
            }
            else{
                left++;
            }
        }
    }
}

// output:Pair = 1 , 5
