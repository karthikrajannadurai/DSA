package org.dsa.Tree.BinaryTree;

import java.util.*;

public class L_107_BottomUpLevelOrderTraversal {

    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode() {}
     * TreeNode(int val) { this.val = val; }
     * TreeNode(int val, TreeNode left, TreeNode right) {
     * this.val = val;
     * this.left = left;
     * this.right = right;
     * }
     * }
     */
    public List<List<Integer>> levelOrderBottom(TreeNode root) {

        Stack<List<Integer>> stack = new Stack<>();
        List<Integer> levelList;
        List<List<Integer>> ans = new LinkedList<>();
        if (root == null) {
            return ans;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        TreeNode temp;
        int length;
        while (!queue.isEmpty()) {

            length = queue.size();
            levelList = new LinkedList<>();
            for (int index = 0; index < length; index++) {
                temp = queue.poll();
                levelList.add(temp.val);
                if (temp.left != null) {
                    queue.add(temp.left);
                }
                if (temp.right != null) {
                    queue.add(temp.right);
                }
            }
            stack.push(levelList);
        }

        while (!stack.isEmpty()) {
            ans.add(stack.pop());
        }
        return ans;
    }
}
