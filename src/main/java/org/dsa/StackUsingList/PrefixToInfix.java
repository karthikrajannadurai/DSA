package org.dsa.StackUsingList;

import java.util.Stack;

public class PrefixToInfix {
    public static StringBuilder prefixToInfix(String prefix) {

        StringBuilder builder = new StringBuilder();
        StringBuilder temp;
        Stack<StringBuilder> stack = new Stack<>();
        for (int index = prefix.length() - 1; index >= 0; index--) {
            temp = new StringBuilder();
            if (!isOperator(prefix.charAt(index))) {
                temp.append(prefix.charAt(index));
                stack.push(temp);
            } else {// import code snip for prefix
                StringBuilder a = stack.pop();
                StringBuilder b = stack.pop();
                // if you need here you can append (), because the postfix expression don't have brackets
                // the brackets should be appended reversed as the final expressions is reversed.
                b.insert(0, ')');
                b.append(prefix.charAt(index));
                b.append(a);
                b.append('(');
                stack.push(b);
            }
        }
        return stack.pop();
    }

    public static boolean isOperator(Character ch) {
        return ch.equals('+') || ch.equals('-') || ch.equals('*') || ch.equals('/') || ch.equals('^');
    }

    public static void main(String[] args) {
        System.out.println(prefixToInfix("*+ab/cf").reverse());
    }
}
