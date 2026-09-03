public class leet1422Second {

    public static int maxScore(String s) {

        int n = s.length();
        int result = Integer.MIN_VALUE;

        // Count total 1s
        int totalOnes = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                totalOnes++;
            }
        }

        int zeros = 0;

        // Split the string
        for (int i = 0; i < n - 1; i++) {

            if (s.charAt(i) == '1') {
                totalOnes--;
            } else {
                zeros++;
            }

            result = Math.max(result, zeros + totalOnes);
        }

        return result;
    }

    public static void main(String[] args) {

        String s = "011101";

        int answer = maxScore(s);

        System.out.println("Maximum Score = " + answer);
    }
}

// output:Maximum Score = 5