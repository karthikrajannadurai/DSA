package org.dsa.Tree.BST;

import org.dsa.Tree.BinaryTree.TreeNode;

public class L_98_IsValidBST {
    public boolean isValidBST(TreeNode root) {

        return isValidRecursive(root, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY);
    }

    public boolean isValidRecursive(TreeNode node, Double left, Double right) {

        if (node == null) {
            return true;
        }
        if (!(left < node.val && node.val < right)) {
            return false;
        }
        return (isValidRecursive(node.left, left, (double) node.val)
                && isValidRecursive(node.right, (double) node.val, right));

    }
}
