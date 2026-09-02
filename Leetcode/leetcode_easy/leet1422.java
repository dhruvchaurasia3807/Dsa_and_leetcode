public class leet1422{

    public static int maxScore(String s) {

        int n = s.length();

        int result = Integer.MIN_VALUE;

        // Try every possible split
        for (int i = 0; i < n - 1; i++) {

            int zero_count = 0;

            // Count zeros in left part
            for (int j = 0; j <= i; j++) {
                if (s.charAt(j) == '0') {
                    zero_count++;
                }
            }

            int one_count = 0;

            // Count ones in right part
            for (int j = i + 1; j < n; j++) {
                if (s.charAt(j) == '1') {
                    one_count++;
                }
            }

            // Calculate score
            int score = zero_count + one_count;

            // Store maximum score
            result = Math.max(result, score);
        }

        return result;
    }

    public static void main(String[] args) {

        String s = "011101";

        int answer = maxScore(s);

        System.out.println("Maximum Score = " + answer);
    }
}