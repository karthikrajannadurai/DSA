package org.dsa.Tree.BackTracking;

import org.dsa.Tree.BinaryTree.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class BinaryTreePathWithNonZero {

    /**
     * Find the path with non-zero value.
     * @param root
     * @return
     */
    public List<String> binaryTreePathsEfficient(TreeNode root) {

        List<String> ans = new LinkedList<String>();
        preOrder(root, new StringBuilder(), ans);
        return ans;
    }

    public void preOrder(TreeNode node, StringBuilder path, List<String> ans) {

        if (node == null || node.val == 0) {
            return;
        }
        int len = path.length();
        path.append(node.val);
        if (node.left == null && node.right == null) {
            ans.add(path.toString());
            path.setLength(len);
            return;
        }
        path.append("->");
        preOrder(node.left, path, ans);
        preOrder(node.right, path, ans);
        path.setLength(len);
    }

}
