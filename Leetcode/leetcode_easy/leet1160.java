public class leet1160 {

    public static int countCharacters(String[] words, String chars) {

        int[] charCount = new int[26];

        // Count characters present in chars
        for (int i = 0; i < chars.length(); i++) {
            char ch = chars.charAt(i);
            charCount[ch - 'a']++;
        }

        int result = 0;

        // Check every word
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            int[] wordCount = new int[26];

            // Count characters of current word
            for (int j = 0; j < word.length(); j++) {
                char ch = word.charAt(j);
                wordCount[ch - 'a']++;
            }

            boolean ok = true;

            // Compare both arrays
            for (int j = 0; j < 26; j++) {
                if (wordCount[j] > charCount[j]) {
                    ok = false;
                    break;
                }
            }

            // Add length if word can be formed
            if (ok) {
                result += word.length();
            }
        }

        return result;
    }

    public static void main(String[] args) {

        String[] words = {"cat", "bt", "hat", "tree"};
        String chars = "atach";

        int answer = countCharacters(words, chars);

        System.out.println("Total Length = " + answer);
    }
}

// output:Total Length = 6