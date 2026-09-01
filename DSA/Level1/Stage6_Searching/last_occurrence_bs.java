package DSA.Level1.Stage6_Searching;

public class last_occurrence_bs {
   public static void main(String[] args) {
    int arr[] = {1,2,2,2,3,4};
    int target = 2;
    int left = 0;
    int right = arr.length-1;
    int answer = -1;

    while(left<=right){
        int mid = (left+right)/2;
        
        if(arr[mid] == target){
            answer = mid;
            left = mid+1;
        }
        else if(arr[mid] < target){
           left = mid+1; 
        }
        else{
            right = mid-1;
        }
    }

    System.out.println("last index = "+answer);
   } 
}


// output:last index = 3