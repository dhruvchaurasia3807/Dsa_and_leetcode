package java_collection_freamwork.Stack;

import java.util.ArrayDeque;

public class validParentheses {
    public static void main(String[] args) {

        String s = "({[]})";

        ArrayDeque<Character> stack = new ArrayDeque<>();

        boolean valid = true;

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch == '(' || ch == '[' || ch == '{') {

                stack.push(ch);

            } else {

                if (stack.isEmpty()) {
                    valid = false;
                    break;
                }

                char top = stack.pop();

                if (ch == ')' && top != '(') {
                    valid = false;
                    break;
                }

                if (ch == ']' && top != '[') {
                    valid = false;
                    break;
                }

                if (ch == '}' && top != '{') {
                    valid = false;
                    break;
                }
            }
        }

        if (!stack.isEmpty()) {
            valid = false;
        }

        System.out.println(valid);
    }
}

// output:true