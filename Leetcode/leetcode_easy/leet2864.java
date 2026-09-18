public class leet2864 {

    public static String maximumOddBinaryNumber(String s) {

        int n = s.length();

        StringBuilder result = new StringBuilder();

        for (int k = 0; k < n; k++) {
            result.append('0');
        }

        int countOnes = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '1') {
                countOnes++;
            }
        }

        int j = 0;

        while (countOnes > 1) {
            result.setCharAt(j, '1');
            j++;

            countOnes--;
        }

        result.setCharAt(n - 1, '1');

        return result.toString();
    }

    public static void main(String[] args) {

        String s = "0101";

        String result = maximumOddBinaryNumber(s);

        System.out.println(result);
    }
}

// output:1001