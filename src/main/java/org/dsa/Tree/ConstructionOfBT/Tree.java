package org.dsa.Tree.ConstructionOfBT;

import java.util.LinkedList;
import java.util.Queue;

public class Tree {
    TreeNode root = null;
    private Queue<TreeNode> queue = new LinkedList<>();

    public boolean insert(int val) {

        if (root == null) {
            this.root = new TreeNode(val);
            queue.offer(this.root);
            return true;
        }

        TreeNode temp = queue.peek();
        if (temp.left == null) {
            temp.left = new TreeNode(val);
        } else {
            temp.right = new TreeNode(val);
            temp = queue.poll();
            queue.offer(temp.left);
            queue.offer(temp.right);
        }

        return true;
    }
}
