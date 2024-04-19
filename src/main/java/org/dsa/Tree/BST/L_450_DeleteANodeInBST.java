package org.dsa.Tree.BST;

import org.dsa.Tree.BinaryTree.TreeNode;

public class L_450_DeleteANodeInBST {
    public TreeNode deleteNode(TreeNode root, int key) {

        TreeNode current = root;
        TreeNode previous = null;
        while (current != null) {
            if (current.val == key) {
                break;
            }
            previous = current;
            if (key < current.val) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        if (previous == null) {
            return deleteRootNode(current);
        }
        if (previous.left == current) {
            previous.left = deleteRootNode(current);
        } else {
            previous.right = deleteRootNode(current);
        }
        return root;
    }

    public TreeNode deleteRootNode(TreeNode root) {

        if (root == null) {
            return null;
        }
        if (root.left == null) {
            return root.right;
        }
        if (root.right == null) {
            return root.left;
        }
        TreeNode current = root.right;
        TreeNode previous = null;
        while (current.left != null) {
            previous = current;
            current = current.left;
        }
        current.left = root.left;
        if (root.right != current) {
            previous.left = current.right;
            current.right = root.right;
        }
        return current;
    }
}
