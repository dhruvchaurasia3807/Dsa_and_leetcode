import java.util.Arrays;

public class leet242 {

    public static boolean isAnagram(String s, String t) {

        int[] count = new int[26];

        // Count characters of s
        for (char ch : s.toCharArray()) {
            count[ch - 'a']++;
        }

        // Subtract characters of t
        for (char ch : t.toCharArray()) {
            count[ch - 'a']--;
        }

        // Check if all elements are 0
        boolean allZeros = Arrays.stream(count)
                                 .allMatch(element -> element == 0);

        return allZeros;
    }

    public static void main(String[] args) {

        String s = "listen";
        String t = "silent";

        boolean result = isAnagram(s, t);

        System.out.println("Is Anagram: " + result);
    }
}

// output:Is Anagram: true