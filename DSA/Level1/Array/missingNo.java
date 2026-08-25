package DSA.Level1.Array;

public class missingNo {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,6};
        int sum = 0;
        int n = arr.length+1;
        
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        int tot_sum = n*(n+1)/2;

        int missing_no = tot_sum-sum;
        // System.out.println(sum);
        // System.out.println(tot_sum);
        System.out.println("the missing no is "+missing_no);

    }
}
