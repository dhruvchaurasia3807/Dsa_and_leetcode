import java.util.HashMap;

public class leet1624 {

    public static int maxLengthBetweenEqualCharacters(String s) {

        int n = s.length();

        HashMap<Character, Integer> map = new HashMap<>();

        int result = -1;

        for (int i = 0; i < n; i++) {

            char ch = s.charAt(i);

            if (!map.containsKey(ch)) {
                map.put(ch, i);
            } else {
                result = Math.max(result, i - map.get(ch) - 1);
            }
        }

        return result;
    }

    public static void main(String[] args) {

        String s = "abcdefa";

        int result = maxLengthBetweenEqualCharacters(s);

        System.out.println("Maximum length: " + result);
    }
}

// output:Maximum length: 5