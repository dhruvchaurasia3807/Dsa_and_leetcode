package DSA.Level1.Stage6_Searching;

public class first_occurrence {
    public static void main(String[] args) {
        int arr[] = { 5, 2, 7, 2, 9 };
        int target = 2;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("the target is occurre first in index = " + i);
                break;
            }
        }
    }
}

// output:the target is occurre first in index = 1
