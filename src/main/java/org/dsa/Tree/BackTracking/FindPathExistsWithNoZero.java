package org.dsa.Tree.BackTracking;


import org.dsa.Tree.BinaryTree.TreeNode;

public class FindPathExistsWithNoZero {

    public static void main(String[] args) {

        TreeNode root=new TreeNode(4);
        root.left=new TreeNode(0);
        root.right=new TreeNode(1);

        root.left.right=new TreeNode(7);
        root.right.left=new TreeNode(2);
        root.right.right=new TreeNode(0);

        System.out.println(preOrder(root));
    }

    public static boolean preOrder(TreeNode node) {

        if (node == null) {
            return true;
        }
        if (node.left == null && node.right == null) {
            return true;
        }
        if (node.val == 0) {
            return false;
        }
        return preOrder(node.left) && preOrder(node.right);
    }
}
