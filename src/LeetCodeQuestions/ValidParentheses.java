package LeetCodeQuestions;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String s = "(])";
        System.out.println(isValid(s));
    }
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (!stack.isEmpty() && (ch == ')' || ch == '}' || ch == ']')) {
                if ((stack.peek() == '(' && ch == ')') || (stack.peek() == '{' && ch == '}')
                        || (stack.peek() == '[' && ch == ']')) {
                    stack.pop();
                }
                else{
                    stack.push(ch);
                }
            }
            else{
                stack.push(ch);
            }
        }
        return stack.isEmpty();
    }
}
