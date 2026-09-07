import java.util.HashMap;
import java.util.Map;

public class leet1897 {

    public static boolean makeEqual(String[] words) {

        int n = words.length;

        Map<Character, Integer> map = new HashMap<>();

        // Count characters
        for (int i = 0; i < words.length; i++) {

            String word = words[i];

            for (int j = 0; j < word.length(); j++) {

                char ch = word.charAt(j);

                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }
        }

        // Check frequency
        for (int value : map.values()) {

            if (value % n != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        String[] words = {"abc", "aabc", "bc"};

        boolean result = makeEqual(words);

        System.out.println(result);
    }
}

// output:true