import  java.util.*;
public class leet2441 {

    public static int findMaxK(int[] nums){
       Arrays.sort(nums);
       int i = 0;
       int j = nums.length-1;
       
       while(i<j){
        if(-nums[i] == nums[j]){
            return nums[j];
        }
        else if(-nums[i] < nums[j]){
            j--;
        }
        else{
            i++;
        }
       }
       return -1;
    }
  public static void main(String[] args) {
    int[] nums = {-1,10,6,7,1,-7};
    int result = findMaxK(nums);
    System.out.print(result);

  }  
}

// output:7