package org.dsa.Tree.BST;

public class GFG_InOrderSuccessor_Predecessor {

    private static Node suc;
    private static Node pre;

    public static void findPreSuc(Node root, int key) {
        // code here.

    /* There are two static nodes defined above pre(representing predecessor) and suc(representing successor) as follows:
       static Node pre=null,suc=null
       You need to update these both.
       And the data inside these classes will be printed automatically by the driver code.
    */

        // search
        Node current = root;
        suc = null;
        pre = null;
        while (current != null && current.data != key) {
            if (key < current.data) {
                suc = current;
                current = current.left;
            } else {
                pre = current;
                current = current.right;
            }
        }
        if (current == null) {
            return;
        }

        if (current.right != null) {
            suc = findMin(current.right);
        }

        if (current.left != null) {
            pre = findMax(current.left);
        }
    }

    public static Node findMin(Node root) {

        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static Node findMax(Node root) {
        while (root.right != null) {
            root = root.right;
        }
        return root;
    }
}
