package java_collection_freamwork.Stack;

import java.util.Stack;

public class valid_parenthesis2 {
    public static void main(String[] args) {

        String s = "({[]})";

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            // Opening bracket
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            }

            // Closing bracket
            else {

                if (stack.isEmpty()) {
                    System.out.println("Invalid");
                    return;
                }

                char top = stack.pop();

                if (ch == ')' && top != '(') {
                    System.out.println("Invalid");
                    return;
                }

                if (ch == ']' && top != '[') {
                    System.out.println("Invalid");
                    return;
                }

                if (ch == '}' && top != '{') {
                    System.out.println("Invalid");
                    return;
                }
            }
        }

        if (stack.isEmpty()) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }
}

// output:Valid