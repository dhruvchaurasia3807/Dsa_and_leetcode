package DSA.Level1.Stage6_Searching;

public class last_occurrence {
    public static void main(String[] args) {
        int arr[] = { 5, 2, 7, 2, 9 };
        int target = 2;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == target) {
                System.out.println("the target is occurre last in index = " + i);
                break;
            }
        }
    }
}

// output:the target is occurre last in index = 1
