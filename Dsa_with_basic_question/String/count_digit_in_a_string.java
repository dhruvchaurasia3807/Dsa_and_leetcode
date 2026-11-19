package Dsa_with_basic_question.String;

public class count_digit_in_a_string {
    public static void main(String[] args) {
        String str = "abc123";
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= '0' && ch <= '9') {
                count++;
            }
        }
        System.out.println(count);
    }
}

// output:3