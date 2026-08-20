public class leet2264 {

    public static String largestGoodInteger(String num) {

        char maxChar = ' ';

        for (int i = 2; i < num.length(); i++) {

            if (num.charAt(i) == num.charAt(i - 1)
                    && num.charAt(i) == num.charAt(i - 2)) {

                maxChar = (char) Math.max(maxChar, num.charAt(i));
            }
        }

        // No good integer found
        if (maxChar == ' ') {
            return "";
        } 
        // Good integer found
        else {
            return new String(new char[] {
                maxChar,
                maxChar,
                maxChar
            });
        }
    }

    public static void main(String[] args) {

        String num = "6777133339";

        String result = largestGoodInteger(num);

        System.out.println(result);
    }
}

// output:777