package com.urban.algorithms.practice.BST;

import java.util.List;

public class BST {

    protected Node root;

    public BST() {
        this.root = null;
    }

    public Node buildBST(List<Integer> elements, int startIndex, int endIndex) {
        if(startIndex > endIndex) {
            return null;
        }

        int mid = (startIndex + endIndex) / 2;
        int valueOfNode = elements.get(mid);
        Node rootNode = new Node(valueOfNode);
        int newEndIndex = mid - 1;
        rootNode.leftNode = buildBST(elements, startIndex, newEndIndex);
        int newStartIndex = mid + 1;
        rootNode.rightNode = buildBST(elements, newStartIndex, endIndex);
        return rootNode;
    }

    public boolean find(int valueToFind) {
        Node currentNode = root;

        while(currentNode != null) {
            if(currentNode.value == valueToFind) {
                System.out.println("Value is found: " + valueToFind);
                return true;
            } else if(currentNode.value > valueToFind) {
                currentNode = currentNode.leftNode;
            } else if(currentNode.value < valueToFind){
                currentNode = currentNode.rightNode;
            }
        }
        System.out.println("There is no value like this: " + valueToFind);
        return false;
    }

    public Node addNewNode(Node root, int valueToAdd) {
        if(root == null) {
            root = new Node(valueToAdd);
            return root;
        } else {
            if(valueToAdd < root.value) {
                root.leftNode = addNewNode(root.leftNode, valueToAdd);
            } else if(valueToAdd > root.value){
                root.rightNode = addNewNode(root.rightNode, valueToAdd);
            }
        }

        return root;
    }

    public Node findMinValue(Node root) {
        if(root == null) {
            System.out.println("error");
            return null;
        }

        Node currentNode = root;

        while(currentNode.leftNode != null) {
            currentNode = currentNode.leftNode;
        }

        return currentNode;
    }

    public Node findMaxValue(Node root) {
        if(root == null) {
            System.out.println("error");
            return null;
        }

        Node currentNode = root;

        while(currentNode.rightNode != null) {
            currentNode = currentNode.rightNode;
        }

        return currentNode;
    }

    public Node removeNode(Node root, int valueToRemove) {
        return null;
    }

    public void printNodes(Node root) {
        if(root == null) {
            return;
        }

        printNodes(root.leftNode);
        System.out.println("Node value: " + root.value);
        printNodes(root.rightNode);
    }
}


