public class leet1903 {

    public static String largestOddNumber(String num) {

        int n = num.length();

        for (int i = n - 1; i >= 0; i--) {

            if (Character.getNumericValue(num.charAt(i)) % 2 != 0) {
                return num.substring(0, i + 1);
            }
        }

        return "";
    }

    public static void main(String[] args) {

        String num = "123456";

        String result = largestOddNumber(num);

        System.out.println("Largest Odd Number: " + result);
    }
}

// Largest Odd Number: 12345