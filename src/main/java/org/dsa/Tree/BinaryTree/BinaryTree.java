package org.dsa.Tree.BinaryTree;

public class BinaryTree {

    private BinaryTree left;
    private int data;

    private BinaryTree right;

    public BinaryTree(int data) {
        this.data = data;
    }

    public BinaryTree getLeft() {
        return left;
    }

    public void setLeft(BinaryTree left) {
        this.left = left;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public BinaryTree getRight() {
        return right;
    }

    public void setRight(BinaryTree right) {
        this.right = right;
    }
}
