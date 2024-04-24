package org.dsa.StackUsingList;

import java.util.Stack;

public class InfixToPostFixWithoutParenthesis {

    // without parenthesis
    public static StringBuilder infixToPostFix(String infix) {

        Stack<Character> stack = new Stack<>();
        StringBuilder builder = new StringBuilder();
        for (Character ch : infix.toCharArray()) {
            if (!isOperator(ch)) {
                builder.append(ch);
            } else {
                while (!stack.isEmpty() && precedence(ch) <= precedence(stack.peek())) {
                    builder.append(stack.pop());
                }
                stack.push(ch);
            }
        }
        while (!stack.isEmpty()) {
            builder.append(stack.pop());
        }
        return builder;
    }

    public static short precedence(Character operator) {
        return switch (operator) {
            case '+', '-' -> 1;
            case '*', '/' -> 2;
            case '^' -> 3;
            default -> -1;
        };
    }

    public static boolean isOperator(Character ch) {
        return ch.equals('+') || ch.equals('-') || ch.equals('*') || ch.equals('/');
    }

    public static void main(String[] args) {
        System.out.println(infixToPostFix("K+L*O"));
    }
}
