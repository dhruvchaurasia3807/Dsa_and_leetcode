import java.util.*;

public class leet1614_ap1 {
    public static int maxDepth(String s) {
        int result = 0;
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                st.push(ch);
            } else if (ch == ')') {
                st.pop();
            }

            result = Math.max(result, st.size());
        }

        return result;
    }

    public static void main(String[] args) {
        String s = "(1+(2*3)+((8)/4))+1";

        System.out.println(maxDepth(s));
    }
}

// output = 3;