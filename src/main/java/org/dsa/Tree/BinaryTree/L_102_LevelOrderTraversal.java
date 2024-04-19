package org.dsa.Tree.BinaryTree;

import java.util.*;

public class L_102_LevelOrderTraversal {

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

    // based on null definition
    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> ans = new LinkedList<>();
        if (root == null) {
            return ans;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);
        List<Integer> list = new LinkedList<>();
        TreeNode temp;
        while (!queue.isEmpty()) {
            temp = queue.poll();
            if (temp == null) {
                ans.add(list);
                list = new LinkedList<>();
                if (!queue.isEmpty()) {
                    queue.add(null);
                }
            } else {
                list.add(temp.val);
            }
            if (temp != null && temp.left != null) {
                queue.add(temp.left);
            }
            if (temp != null && temp.right != null) {
                queue.add(temp.right);
            }
        }
        return ans;
    }
}

// based on the for loop definition
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            List<Integer> list = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                list.add(node.val);
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            if (!list.isEmpty()) {
                result.add(list);
            }
        }
        return result;
    }
}