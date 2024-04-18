package org.dsa.Tree.BinaryTree;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class L_94_InOrderTraversalBinaryTree {
    public static void main(String[] args) {

        inOrderTraversal(new TreeNode(1));
    }

    public static void inOrderTraversal(TreeNode node) {
        if (node == null) {
            return;
        }
        inOrderTraversal(node.left);
        System.out.println(node.val);
        inOrderTraversal(node.right);
    }

    public List<Integer> inorderTraversal(TreeNode root) {

        Stack<TreeNode> stack = new Stack<>();
        List<Integer> ans = new LinkedList<>();
        TreeNode current = root;
        if (root == null) {
            return ans;
        }
        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }
            current = stack.pop();
            ans.add(current.val);
            current = current.right;
        }
        return ans;
    }
}
