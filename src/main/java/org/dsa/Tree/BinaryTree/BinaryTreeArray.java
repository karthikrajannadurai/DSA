package org.dsa.Tree.BinaryTree;

public class BinaryTreeArray {

    // for generic array we need to use reflections to create array of T see to it.
    private int[] binaryTree;

    public BinaryTreeArray(int size) {
        this.binaryTree = new int[size];
    }

    public void setLeft(int parent, int data) {
        int location = (parent * 2) - 1;
        if (location < binaryTree.length) {
            binaryTree[location] = data;
        } else {
            System.out.println("Parent not found");
        }
    }

    public void setRight(int parent, int data) {

        int location = (parent * 2) + 1;
        if (location < binaryTree.length) {
            binaryTree[location] = data;
        } else {
            System.out.println("Parent not found");
        }
    }

    public void setRoot(int data) {
        binaryTree[0] = data;
    }
}
