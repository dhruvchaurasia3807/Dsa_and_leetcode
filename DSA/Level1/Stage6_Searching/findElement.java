package DSA.Level1.Stage6_Searching;

public class findElement {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int target = 40;
        int index = -1;
        boolean isFound = false;

        for(int i=0;i<arr.length;i++){
            if(arr[i] == target){
                isFound = true;
                index = i;
                break;
                
            }  
        }
        if(isFound){
            System.out.println("the target is found at index =  "+index );

        }else{
            System.out.println("element is not found");
        }
    }
}
