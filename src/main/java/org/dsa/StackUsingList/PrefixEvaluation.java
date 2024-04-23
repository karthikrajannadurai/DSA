package org.dsa.StackUsingList;

import java.util.Stack;

public class PrefixEvaluation {

    // important for the division and multiplication, the operand 1 and operand 2 is not interchanged, as the nature of input.
    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (int index = tokens.length - 1; index >= 0; index--) {
            if (!checkForOperator(tokens[index])) {
                stack.push(Integer.valueOf(tokens[index]));
            } else {
                stack.push(eval(tokens[index], stack));
            }
        }
        return stack.pop();
    }

    public static boolean checkForOperator(String str) {

        return str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/");
    }

    public static Integer eval(String operator, Stack<Integer> stack) {

        Integer operant1 = stack.pop();
        Integer operant2 = stack.pop();
        int num = 0;
        switch (operator) {
            case "+": {
                num = operant1 + operant2;
                break;
            }
            case "-": {
                num = operant1 - operant2;
                break;
            }
            case "*": {
                num = operant1 * operant2;
                break;
            }
            case "/": {
                num = operant1 / operant2;
                break;
            }
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.println(evalRPN(new String[]{"-","+","*","2","3","*","5","4","9"}));
    }
}
