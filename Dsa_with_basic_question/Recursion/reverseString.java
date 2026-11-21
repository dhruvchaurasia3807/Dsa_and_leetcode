package Dsa_with_basic_question.Recursion;

public class reverseString {
    static String reverse(String str){
        //base case
        if(str.length() == 0){
            return "";
        }
       //recursive call
       return reverse(str.substring(1)) + str.charAt(0);
    }
    public static void main(String[] args) {
        System.out.println(reverse("abcd"));
    }
}

// output:dcba