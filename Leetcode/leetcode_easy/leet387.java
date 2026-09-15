public class leet387 {

    public static int firstUniqChar(String s) {

        int[] arr = new int[26];

        // Count characters
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            arr[ch - 'a']++;
        }

        // Find first unique character
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (arr[ch - 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        String s = "aaebcb";

        int answer = firstUniqChar(s);

        System.out.println(answer);
    }
}

// output: 2