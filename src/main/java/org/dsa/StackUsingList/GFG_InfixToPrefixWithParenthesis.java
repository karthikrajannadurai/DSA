package org.dsa.StackUsingList;

import java.util.Stack;

public class GFG_InfixToPrefixWithParenthesis {


    public static StringBuilder infixToPreFix(String infix) {

        Stack<Character> stack = new Stack<>();
        StringBuilder builder = new StringBuilder();
        Character ch;
        for (int index = infix.length() - 1; index >= 0; index--) {
            ch = infix.charAt(index);
            if (!isOperator(ch)) {
                builder.append(ch);
            } else if (ch.equals(')')) {
                stack.push(ch);
            } else if (ch.equals('(')) {
                while (!stack.isEmpty() && stack.peek() != ')') {
                    builder.append(stack.pop());
                }
                stack.pop();
            } else {
                while (!stack.isEmpty() && (precedence(ch) < precedence(stack.peek()) || checkAssociativity(ch, stack.peek()))) {
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

    public static boolean checkAssociativity(Character incoming, Character stackPeek) {
        if (precedence(incoming) == precedence(stackPeek)) {
            if( incoming.equals('^')){
                return true;
            }
            return !(incoming.equals('+') || incoming.equals('-') || incoming.equals('*') || incoming.equals('/'));
        }
        return false;
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
        if (ch.equals('(') || ch.equals(')')) {
            return true;
        }
        return ch.equals('+') || ch.equals('-') || ch.equals('*') || ch.equals('/') || ch.equals('^');
    }

    public static void main(String[] args) {
//        System.out.println(infixToPostFix("K+L*O"));
//        System.out.println(infixToPostFix("a+b*{c^d-e}^{f+g*h}-i"));
        System.out.println(infixToPreFix("K+L-M*N+(O^P)*W/U/V*T+Q").reverse());
    }
}
