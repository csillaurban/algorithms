package com.urban.algorithms.practice.BST;

public class Node {

    protected int value;
    protected Node leftNode;
    protected Node rightNode;

    public Node(int value) {
        this.value = value;
        this.leftNode = null;
        this.rightNode = null;
    }

    protected void deleteLeftNode() {
        this.leftNode = null;
    }

    protected void deleteRightNode() {
        this.rightNode = null;
    }



}
