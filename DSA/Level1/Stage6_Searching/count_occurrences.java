package DSA.Level1.Stage6_Searching;

public class count_occurrences {
    public static void main(String[] args) {
        int arr[] = {2,5,2,8,2,9};
        int target = 2;
        int count = 0;
        for(int i=0;i<arr.length;i++){
           if(arr[i] == target){
            count++;
           }
        }
        System.out.println("the occurrences of a target is = "+ count);
    }
}

// output:the occurrences of a target is = 3
