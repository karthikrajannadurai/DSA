package org.dsa.StackUsingList;

import java.util.Stack;

public class L_150_EvaluationOfPostFixExpression {

    // important note for division and subtraction need to interchange the operand or else will get wrong answer.
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String ch : tokens) {
            if (!checkForOperator(ch)) {
                stack.push(Integer.valueOf(ch));
            } else {
                stack.push(eval(ch, stack));
            }
        }
        return stack.pop();
    }

    public boolean checkForOperator(String str) {

        return str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/");
    }

    public Integer eval(String operator, Stack<Integer> stack) {

        Integer operant1 = stack.pop();
        Integer operant2 = stack.pop();
        int num = 0;
        switch (operator) {
            case "+": {
                num = operant1 + operant2;
                break;
            }
            case "-": {
                num = operant2 - operant1; // important
                break;
            }
            case "*": {
                num = operant1 * operant2;
                break;
            }
            case "/": {
                num = operant2 / operant1; // important
                break;
            }
        }
        return num;
    }
}
