package org.dsa.Tree.BST;

import org.dsa.Tree.BinaryTree.TreeNode;

public class L_700_SearchInBinarySearchTree {

    // space optimized one ,
    // with recursion we need to use stack
    public static TreeNode searchBST(TreeNode root, int val) {

        TreeNode current = root;
        if (root == null) {
            return null;
        }
        while (current != null) {
            if (current.val == val) {
                return current;
            }
            if (val < current.val) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return null;
    }
}
