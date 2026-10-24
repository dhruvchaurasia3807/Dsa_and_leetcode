import java.util.HashSet;

public class leet409 {

    public static int longestPalindrome(String s) {
        HashSet<Character> set = new HashSet<>();

        int result = 0;

        for (char ch : s.toCharArray()) {
            if (set.contains(ch)) {
                set.remove(ch);
                result += 2;
            } else {
                set.add(ch);
            }
        }

        if (!set.isEmpty()) {
            result++;
        }

        return result;
    }

    public static void main(String[] args) {
        String s = "abccccdd";

        int result = longestPalindrome(s);

        System.out.println("Longest Palindrome Length: " + result);
    }
}


// output:Longest Palindrome Length: 7