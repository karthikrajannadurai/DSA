package org.dsa.Tree.ConstructionOfBT;

public class L_106_ConstructFromPostOrder_Inorder {

    // just memorize it difficult to track
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return printRoot(inorder, postorder, 0, inorder.length - 1, 0, postorder.length - 1);
    }

    public TreeNode printRoot(int[] inorder, int[] postorder, int startIndexOfIn, int EndIndexOfIn, int startIndexOfPre, int EndIndexOfPre) {
        if (startIndexOfIn > EndIndexOfIn || startIndexOfPre > EndIndexOfPre)
            return null;

        TreeNode root = new TreeNode(postorder[EndIndexOfPre]);
        int r = EndIndexOfIn;
        while (inorder[r] != root.val) {
            r--;//1
        }
        int rightSideEle = EndIndexOfIn - r;
        root.right = printRoot(inorder, postorder, r + 1, EndIndexOfIn, EndIndexOfPre - rightSideEle, EndIndexOfPre - 1);
        root.left = printRoot(inorder, postorder, startIndexOfIn, r - 1, startIndexOfPre,
                EndIndexOfPre - rightSideEle - 1);

        return root;
    }
}
