package org.dsa.StackUsingList;


import java.util.Stack;

public class GFG_PostfixToBET {

    static TreeNode postfixToBET(String postfix) {

        // only one stack is required, any way character is converted to treenode, we can straight away create node and push in stack.
        Stack<TreeNode> stack = new Stack<>();
        for (Character ch : postfix.toCharArray()) {
            if (!isOperator(ch)) {
                stack.push(new TreeNode(ch));
            } else {
                TreeNode right = stack.pop();
                TreeNode left = stack.pop();
                TreeNode root = new TreeNode(ch);
                root.left = left;
                root.right = right;
                stack.push(root);
            }
        }
        return stack.pop();
    }

    static boolean isOperator(Character ch) {
        return ch.equals('+') || ch.equals('-') || ch.equals('*') || ch.equals('/') || ch.equals('^');
    }

    public static void main(String[] args) {
        System.out.println(postfixToBET("wlrb+-*").val);
    }
}

class TreeNode {

    public Character val;
    public TreeNode left;
    public TreeNode right;

    TreeNode() {
    }

    public TreeNode(Character val) {
        this.val = val;
    }

    TreeNode(Character val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
