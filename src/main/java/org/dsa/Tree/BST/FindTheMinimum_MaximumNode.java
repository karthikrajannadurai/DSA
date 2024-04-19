package org.dsa.Tree.BST;

import com.sun.source.tree.Tree;
import org.dsa.Tree.BinaryTree.TreeNode;

public class FindTheMinimum_MaximumNode {
    public static void main(String[] args) {
        System.out.println(minimumNode(new TreeNode(12)));
        System.out.println(maximumNode(new TreeNode(12)));
    }

    public static int minimumNode(TreeNode root) {

        TreeNode ans = null;
        while (root != null) {
            ans = root;
            root = root.left;
        }
        if (ans == null) {
            return 0;
        }
        return ans.val;
    }

    public static int maximumNode(TreeNode root) {

        TreeNode ans = null;
        while (root != null) {
            ans = root;
            root = root.right;
        }
        if (ans == null) {
            return 0;
        }
        return ans.val;
    }
}
