package org.dsa.Tree.BST;

import org.dsa.Tree.BinaryTree.TreeNode;

// if we use inorder traversal of bst its sorted value.
public class L_701_InsertNode {
    public static void main(String[] args) {
        insertIntoBST(new TreeNode(1), 2);
    }

    // recursion
    public static TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }
        if (val < root.val) {
            root.left = insertIntoBST(root.left, val);
        } else {
            root.right = insertIntoBST(root.right, val);
        }
        return root;
    }

    // iterator space optimized
    public static TreeNode insertInto(TreeNode root, int val) {

        TreeNode previous=null, current = root;
        if (root == null) {
            return new TreeNode(val);
        }
        while (current != null) {
            previous = current;
            if (val < current.val) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        TreeNode newNode = new TreeNode(val);
        if (val < previous.val) {
            previous.left = newNode;
        } else {
            previous.right = newNode;
        }
        return root;
    }
}
