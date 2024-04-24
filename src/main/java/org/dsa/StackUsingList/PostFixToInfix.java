package org.dsa.StackUsingList;

import java.util.Stack;

public class PostFixToInfix {
    public static String postfixToInfix(String postfix) {
        Stack<StringBuilder> stack = new Stack<>();
        StringBuilder temp;
        for (Character ch : postfix.toCharArray()) {
            temp = new StringBuilder();
            if (!isOperator(ch)) {
                stack.push(temp.append(ch));
            } else {
                // import code snip for postfix
                StringBuilder b = stack.pop(); // ab concat with operator and push
                StringBuilder a = stack.pop();
                // if you need here you can append (), because the postfix expression don't have brackets
                a.insert(0, '(');
                a.append(ch);
                a.append(b);
                a.append(')');
                stack.push(a);
            }
        }
        return stack.pop().toString();
    }

    public static boolean isOperator(Character ch) {
        return ch.equals('+') || ch.equals('-') || ch.equals('*') || ch.equals('/') || ch.equals('^');
    }

    public static void main(String[] args) {
        System.out.println(postfixToInfix("abcd^e-fgh*+^*+i-"));
//        System.out.println(postfixToInfix("ab*c+"));
    }
}
