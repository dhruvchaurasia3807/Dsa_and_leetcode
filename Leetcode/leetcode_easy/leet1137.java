import java.util.*;
public class leet1137 {
    int[] t = new int[38];

    public int find(int n){
        if(n==0) return 0;
        if(n==1 || n==2) return 1;
        //check whether the answer is already stored
        if(t[n] != -1) return  t[n];

        int a = find(n-1);
        int b = find(n-2);
        int c = find(n-3);
        //store answer using memoization
        return t[n] = a+b+c;
    }
    public int tribonacci(int n){
        Arrays.fill(t,-1);
        return find(n);
    }

    public static void main(String[] args) {
        leet1137 obj = new leet1137();
        int n=4;
        int result = obj.tribonacci(n);
        System.out.println(result);
    }
}

// output:4