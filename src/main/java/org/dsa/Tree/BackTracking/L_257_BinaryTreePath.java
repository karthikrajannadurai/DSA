package org.dsa.Tree.BackTracking;

import org.dsa.Tree.BinaryTree.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class L_257_BinaryTreePath {

    /**
     * Given the root of a binary tree, return all root-to-leaf paths in any order.
     *<P>
     * A leaf is a node with no children.
     *<P>
     *
     *
     * Example 1:
     *<P>
     *
     * Input: root = [1,2,3,null,5]
     * Output: ["1->2->5","1->3"]
     * Example 2:
     *<P>
     * Input: root = [1]
     * Output: ["1"]
     *<P>
     *
     * Constraints:
     *<P>
     * The number of nodes in the tree is in the range [1, 100].
     * -100 <= Node.val <= 100
     * @param root
     * @return
     */
    public List<String> binaryTreePaths(TreeNode root) {

        return preOrder(root, "", new LinkedList<String>());
    }

    public List<String> preOrder(TreeNode node, String path, List<String> ans) {

        if (node == null) {
            return ans;
        }
        if (node.left == null && node.right == null) {
            ans.add(path + node.val);
            return ans;
        }
        path = path + node.val + "->";
        ans = preOrder(node.left, path, ans);
        ans = preOrder(node.right, path, ans);
        return ans;
    }

    /**
     * Important thing to take away is the string creation will take time, because it creates new memory
     * every time we append. So use the stringbuilder.
     * Even one string append cause program to run slow.
     * @param root
     * @return
     */

    public List<String> binaryTreePathsEfficient(TreeNode root) {

        List<String> ans = new LinkedList<String>();
        preOrder(root, new StringBuilder(), ans);
        return ans;
    }

    public void preOrder(TreeNode node, StringBuilder path, List<String> ans) {

        if (node == null) {
            return;
        }
        int len=path.length();
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
