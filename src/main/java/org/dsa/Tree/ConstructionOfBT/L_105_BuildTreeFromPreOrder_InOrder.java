package org.dsa.Tree.ConstructionOfBT;

import java.util.Arrays;

public class L_105_BuildTreeFromPreOrder_InOrder {

    int preIdx = 0;
    int inIdx = 0;
    int preorderiint = 0;

    // fast
    public TreeNode buildTree(int[] preOrder, int[] inOrder) {
        return helper(preOrder, inOrder, Integer.MIN_VALUE);
    }

    private TreeNode helper(int[] preOrder, int[] inOrder, int parentVal) {
        if (this.inIdx > inOrder.length - 1 || inOrder[this.inIdx] == parentVal) return null;
        TreeNode root = new TreeNode(preOrder[this.preIdx]);
        this.preIdx++;
        root.left = helper(preOrder, inOrder, root.val);
        this.inIdx++;
        root.right = helper(preOrder, inOrder, parentVal);
        return root;
    }

    public static void main(String[] args) {

        // 1. We can use the search method but that method has to do linear search which is slow.
        // 2. instead use the properties of inorder and preorder traversal properties.
        // 3. preorder first prints the left node and after that it prints the right node.
    }

    public TreeNode buildTreeS(int[] preorder, int[] inorder) {

        if (preorder.length == 0 || inorder.length == 0) {
            return null;
        }

        return helper(preorder, inorder, 0, preorder.length - 1);

    }

    public TreeNode helper(int[] preorder, int[] inorder, int start, int end) {
        if (start > end) {
            return null;
        }

        TreeNode newNode = new TreeNode(preorder[preorderiint++]);
        if (start == end) {
            return newNode;
        }
        int mid = search(inorder, start, end, newNode.val);
        newNode.left = helper(preorder, inorder, start, mid - 1);
        newNode.right = helper(preorder, inorder, mid + 1, end);
        return newNode;
    }

    public int search(int[] arr, int start, int end, int key) {

        for (int index = start; index <= end; index++) {
            if (key == arr[index]) {
                return index;
            }
        }
        return -1;
    }
}
