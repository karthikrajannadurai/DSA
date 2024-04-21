package org.dsa.Tree.ConstructionOfBT;


import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ConstructFromLevelOrder {
    public static void main(String[] args) {
        // construct BT from level order

        Tree tree = new Tree();
        for(int index=0;index<17;index++){
            tree.insert(index);
        }
        System.out.println(levelOrder(tree.root));
    }

    public static List<List<Integer>> levelOrder(TreeNode root) {

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