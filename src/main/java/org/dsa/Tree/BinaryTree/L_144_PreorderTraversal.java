package org.dsa.Tree.BinaryTree;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class L_144_PreorderTraversal {
    public static void main(String[] args) {
        preorder(new BinaryTree(1));
    }

    public static void preorder(BinaryTree node) {

        // total TC-O(N)
        // SC-O(H) since maximum function stack used is height of the tree.
        if (node == null) {
            return;
        }
        System.out.println(node.getData());
        preorder(node.getLeft());
        preorder(node.getRight());
    }

    public List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> ans = new LinkedList<>();
        if (root == null) {
            return ans;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;
        while (current != null || !stack.isEmpty()) {

            while (current != null) {
                ans.add(current.val);
                if (current.right != null) {
                    stack.push(current.right);
                }
                current = current.left;
            }

            if (!stack.isEmpty()) {
                current = stack.pop();
            }
        }
        return ans;
    }
}
