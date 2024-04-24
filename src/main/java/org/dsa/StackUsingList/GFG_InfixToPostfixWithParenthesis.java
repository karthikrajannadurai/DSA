package org.dsa.StackUsingList;

import java.util.Stack;

public class GFG_InfixToPostfixWithParenthesis {
    static Character openCh = '{', closedCh = '}';

    public static StringBuilder infixToPostFix(String infix) {

        Stack<Character> stack = new Stack<>();
        StringBuilder builder = new StringBuilder();
        for (Character ch : infix.toCharArray()) {
            if (!isOperator(ch)) {
                builder.append(ch);
            } else if (ch.equals(openCh)) {
                stack.push(ch);
            } else if (ch.equals(closedCh)) {
                while (!stack.isEmpty() && stack.peek() != openCh) {
                    builder.append(stack.pop());
                }
                stack.pop();
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
        if (ch.equals(openCh) || ch.equals(closedCh)) {
            return true;
        }
        return ch.equals('+') || ch.equals('-') || ch.equals('*') || ch.equals('/') || ch.equals('^');
    }

    public static void main(String[] args) {
//        System.out.println(infixToPostFix("K+L*O"));
        System.out.println(infixToPostFix("a+b*{c^d-e}^{f+g*h}-i"));
//        System.out.println(infixToPostFix("A*{B+C}/D"));
    }
}
