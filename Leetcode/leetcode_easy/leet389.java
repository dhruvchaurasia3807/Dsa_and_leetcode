public class leet389 {

    public static char findTheDifference(String s, String t) {

        int xor = 0;

        for (int i = 0; i < t.length(); i++) {
            xor ^= t.charAt(i);
        }

        for (int i = 0; i < s.length(); i++) {
            xor ^= s.charAt(i);
        }

        return (char) xor;
    }

    public static void main(String[] args) {

        String s = "abcd";
        String t = "abcde";

        char result = findTheDifference(s, t);

        System.out.println("Extra character: " + result);
    }
}

// output:Extra character: e