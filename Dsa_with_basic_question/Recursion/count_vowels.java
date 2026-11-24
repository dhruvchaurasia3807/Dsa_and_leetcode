package Dsa_with_basic_question.Recursion;
public class count_vowels {

    static int countVowels(String str, int index) {

        // Base Case
        if (index == str.length()) {
            return 0;
        }

        char ch = Character.toLowerCase(str.charAt(index));

        int count = 0;

        // Check Vowel
        if (ch == 'a' || ch == 'e' || ch == 'i' ||
            ch == 'o' || ch == 'u') {
            count = 1;
        }

        // Recursive Call
        return count + countVowels(str, index + 1);
    }

    public static void main(String[] args) {

        String str = "education";

        System.out.println(countVowels(str, 0));
    }
}

// output:5