package org.dsa.Tree.BinaryTree;

public class Main {
    public static void main(String[] args) {

        // doubly Linked list implementation of tree
        BinaryTree node1 = new BinaryTree(12);
        BinaryTree node2 = new BinaryTree(13);
        BinaryTree node3 = new BinaryTree(14);
        BinaryTree node4 = new BinaryTree(15);
        node1.setLeft(node2);
        node1.setRight(node3);
        node3.setLeft(node4);

        // array representation of tree
        BinaryTreeArray binaryTreeArray = new BinaryTreeArray(8);
        binaryTreeArray.setRoot(1);
        binaryTreeArray.setLeft(0, 1);
        binaryTreeArray.setRight(0, 2);
    }
}
