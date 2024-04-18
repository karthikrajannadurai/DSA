package org.dsa.Tree.BinaryTree;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class L_145_PostOrderTraversal {
    public static void main(String[] args) {

    }

    public static void postOrderTraversal(TreeNode root) {

        if (root == null) {
            return;
        }
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.println(root.val);
    }

    public List<Integer> postorderTraversal(TreeNode root) {

        List<Integer> ans = new LinkedList<>();
        if (root == null) {
            return ans;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;
        TreeNode temp;
        while (current != null || !stack.isEmpty()) {
            if (current != null) {
                stack.push(current);
                current = current.left;
            } else { // this will check for right subtree
                temp = stack.peek().right;
                if (temp == null) { // if null then we need to move to root.
                    temp = stack.pop();
                    ans.add(temp.val);
                    while (!stack.isEmpty() && stack.peek().right == temp) { // this loop is checking for current node is left or right
                        temp = stack.pop();
                        ans.add(temp.val);
                    }
                } else {// this condition shows that, the right subtree has left node
                    current = temp;
                }
            }
        }
        return ans;
    }
}
