package Dsa_with_basic_question.String;
public class Reverse_of_string {
    public static void main(String[] args) {
        String str = "hello";
        String result = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }

        System.out.println(result);
    }
}

// output:olleh