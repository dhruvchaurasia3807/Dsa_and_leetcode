import java.util.*;
public class leet1614_ap2 {

    public static int maxDepth(String s) {
        int result = 0;
        int openBrackets = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                openBrackets++;
            } else if (ch == ')') {
                openBrackets--;
            }

            result = Math.max(result, openBrackets);
        }

        return result;
    }

    public static void main(String[] args) {
        String s = "(1+(2*3)+((8)/4))+1";

        System.out.println(maxDepth(s));
    }
}

// output:3