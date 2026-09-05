package DSA.Level1.Stage7_TwoPointers;

public class palindrome {
    public static void main(String[] args) {
        String str = "madam";
        int left = 0;
        int right = str.length()-1;
        boolean isPalindrome = true;

        while(left < right){

            if(str.charAt(right) != str.charAt(left)){
               isPalindrome = false;
               break;
            }
            
            left++;
            right--;
        }

        System.out.println("Palindrome  = "+ isPalindrome);
    }
}

// output:Palindrome  = true
