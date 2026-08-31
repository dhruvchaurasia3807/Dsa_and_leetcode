package DSA.Level1.Stage5_String_Hashmap;

public class String_comparission{
    public static void main(String[] args) {

        String str = "aaabbc";

        String result = "";

        int count = 1;

        for (int i = 0; i < str.length(); i++) {

            if (i + 1 < str.length() &&
                str.charAt(i) == str.charAt(i + 1)) {

                count++;

            } else {

                result = result + str.charAt(i) + count;
                count = 1;
            }
        }

        System.out.println(result);
    }
}

// output:
// a3b2c1