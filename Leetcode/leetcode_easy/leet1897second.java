public class leet1897second {

    public static void main(String[] args) {

        String[] words = {"abc", "aabc", "bc"};

        Solution obj = new Solution();

        boolean result = obj.makeEqual(words);

        System.out.println(result);
    }
}

class Solution {

    public boolean makeEqual(String[] words) {

        int n = words.length;

        int[] count = new int[26];

        for (String word : words) {

            for (char ch : word.toCharArray()) {

                count[ch - 'a']++;
            }
        }

        for (int i = 0; i < 26; i++) {

            if (count[i] % n != 0) {
                return false;
            }
        }

        return true;
    }
}

// output:true