package com.urban.algorithms.practice.BST;

import java.util.List;

import static sun.swing.MenuItemLayoutHelper.max;


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

    public Node find(int valueToFind) {
        Node currentNode = root;

        while(currentNode != null) {
            if(currentNode.value == valueToFind) {
                return currentNode;
            } else if(currentNode.value > valueToFind) {
                currentNode = currentNode.leftNode;
            } else if(currentNode.value < valueToFind){
                currentNode = currentNode.rightNode;
            }
        }
        return null;
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
        /*if(root == null) {
            System.out.println("error");
            return null;
        }

        Node currentNode = root;

        while(currentNode.leftNode != null) {
            currentNode = currentNode.leftNode;
        }
        System.out.println("min value is: " + currentNode.value);
        return currentNode;*/

        Node currentNode = root;
        if(currentNode.leftNode == null) {
            return currentNode;
        } else {
            return findMinValue(currentNode.leftNode);
        }
    }

    public Node findMaxValue(Node root) {

        Node currentNode = root;

        if(currentNode.rightNode == null) {
            return currentNode;
        } else {
            return findMaxValue(currentNode.rightNode);
        }
    }

    public void removeNode(int valueToRemove) {
        Node nodeToDelete = find(valueToRemove);

        if(nodeToDelete.leftNode == null && nodeToDelete.rightNode == null) {
            Node parent = getParentOfMin(root, nodeToDelete.value);
            parent.leftNode = null;
        } else if(nodeToDelete.leftNode == null) {
            Node toChange = nodeToDelete.rightNode;
            nodeToDelete.value = toChange.value;
            if(toChange.leftNode != null) {
                nodeToDelete.leftNode = toChange.leftNode;
            }
            if(toChange.rightNode != null) {
                nodeToDelete.rightNode = toChange.rightNode;
            }
            nodeToDelete.rightNode = null;
        }else if(nodeToDelete.rightNode == null) {
            Node toChange = nodeToDelete.leftNode;
            nodeToDelete.value = toChange.value;
            if(toChange.leftNode != null) {
                nodeToDelete.leftNode = toChange.leftNode;
            }
            if(toChange.rightNode != null) {
                nodeToDelete.rightNode = toChange.rightNode;
            }
            nodeToDelete.leftNode = null;
        } else {
            Node minNodeInRight = findMinValue(nodeToDelete.rightNode);
            int temp = minNodeInRight.value;
            removeNode(temp);
            nodeToDelete.value = temp;
        }
    }

    public Node getParentOfMin(Node root, int value) {
        Node currentNode = root.rightNode;
        while(currentNode.leftNode != null) {
            if(currentNode.leftNode.value == value) {
                return currentNode;
            }
            currentNode = currentNode.leftNode;
        }
        return null;
    }

    public int calculateHeight(Node root) {
        if(root == null) {
            return -1;
        } else {
            int leftHeight = calculateHeight(root.leftNode);
            int rightHeight = calculateHeight(root.rightNode);
            return max(leftHeight, rightHeight)+1;
        }
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


