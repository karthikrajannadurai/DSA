package org.dsa.Tree.BST;

class Node {
    int data;
    Node left, right;

    Node(int d) {
        data = d;
        left = right = null;
    }
}

public class G_InOrder_Successor_In_BST {
    public Node inorderSuccessor(Node root, Node x) {

        if (x == null) {
            return null;
        }

        if (x.right != null) {
            return findMin(x.right);
        }

        Node parent = null, current = root;
        while (root != null && current != x) {
            if (x.data < current.data) {
                parent = current;
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return parent;
    }

    public Node findMin(Node root) {

        while (root != null && root.left != null) {
            root = root.left;
        }
        return root;
    }
}
