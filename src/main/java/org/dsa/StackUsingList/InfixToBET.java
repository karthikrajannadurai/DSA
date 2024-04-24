package org.dsa.StackUsingList;

import java.util.Stack;

public class InfixToBET {

    static TreeNode infixToBET(String infix) {

        Stack<TreeNode> stack = new Stack<>();
        Stack<TreeNode> TStack = new Stack<>();
        for (Character ch : infix.toCharArray()) {
            TreeNode temp = new TreeNode(ch);
            if (!isOperator(ch)) {
                TStack.push(temp);
            } else {
                while (!stack.isEmpty() && precedence(ch) <= precedence(stack.peek().val)) {
                    buildTree(stack.pop(), TStack);
                }
                stack.push(temp);
            }
        }
        while (!stack.isEmpty()) {
            buildTree(stack.pop(), TStack);
        }
        return TStack.pop();
    }

    static short precedence(Character operator) {
        return switch (operator) {
            case '+', '-' -> 1;
            case '*', '/' -> 2;
            case '^' -> 3;
            default -> -1;
        };
    }

    static boolean isOperator(Character ch) {
        return ch.equals('+') || ch.equals('-') || ch.equals('*') || ch.equals('/') || ch.equals('^');
    }

    static void buildTree(TreeNode operator, Stack<TreeNode> TStack) {

        TreeNode right = TStack.pop();
        TreeNode left = TStack.pop();
        TreeNode root = operator;
        root.left = left;
        root.right = right;
        TStack.push(root);
    }

    public static void main(String[] args) {
//        postFix(infixToBET("a+b"));
        postFix(infixToBET("a+b*c^d-e^f+g*h-i"));
    }

    static void postFix(TreeNode root) {
        if (root == null) {
            return;
        }
        postFix(root.left);
        postFix(root.right);
        System.out.print(root.val);
    }
}
