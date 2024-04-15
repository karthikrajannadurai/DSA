package org.dsa.StackUsingList;

import java.util.Stack;

public class L_20_BalancedParenthesis {

    /**
     * 1. using stack we have done.
     * 2. using array as stack we can do more efficiently
     * @param s
     * @return
     */
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char top;
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                top = stack.peek();
                if (top == '(' && c == ')' || top == '{' && c == '}' || top == '[' && c == ']') {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();

    }
}
