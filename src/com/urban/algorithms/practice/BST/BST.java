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
        //calculate middle position in list
        int mid = (startIndex + endIndex) / 2;
        int valueOfNode = elements.get(mid);
        //the value of the new Node will be the value of the middle element in the list
        Node rootNode = new Node(valueOfNode);
        //the method invoke itself and continuously cut in half the list until not reaching every element
        int newEndIndex = mid - 1;
        //left side from the middle
        rootNode.leftNode = buildBST(elements, startIndex, newEndIndex);
        int newStartIndex = mid + 1;
        //right side of the middle
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
        /* ITERATIVE METHOD:

        if(root == null) {
            System.out.println("error");
            return null;
        }

        Node currentNode = root;

        while(currentNode.leftNode != null) {
            currentNode = currentNode.leftNode;
        }
        System.out.println("min value is: " + currentNode.value);
        return currentNode;*/

        // RECURSIVE

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
        //find the element to delete
        Node nodeToDelete = find(valueToRemove);

        //if there is no children -> delete the node
        if(nodeToDelete.leftNode == null && nodeToDelete.rightNode == null) {
            //find the parent of the node
            Node parent = getParent(root, nodeToDelete.value);
            //delete the node from parent reference, it it is the left node:
            if(parent.leftNode != null && parent.leftNode == nodeToDelete) {
                parent.deleteLeftNode();
            } else {
                parent.deleteRightNode();
            }
            //if there is no left node
        } else if(nodeToDelete.leftNode == null) {
            //get the right node, because it will replace the deleted node
            Node toChange = nodeToDelete.rightNode;
            //change the value of the node to delete
            nodeToDelete.value = toChange.value;
            //set the leftNode and rightNode to the deleted node, if any
            if(toChange.leftNode != null) nodeToDelete.leftNode = toChange.leftNode;

            if(toChange.rightNode != null) nodeToDelete.rightNode = toChange.rightNode;
            //delete the rightNode
            nodeToDelete.deleteRightNode();
            //if there is no right node ~ comment in the case above
        }else if(nodeToDelete.rightNode == null) {
            Node toChange = nodeToDelete.leftNode;
            nodeToDelete.value = toChange.value;
            if(toChange.leftNode != null) nodeToDelete.leftNode = toChange.leftNode;

            if(toChange.rightNode != null) nodeToDelete.rightNode = toChange.rightNode;

            nodeToDelete.deleteLeftNode();
            //when there are left and right nodes as well
        } else {
            //find the node with the smallest value to the right of node to delete
            Node minNodeInRight = findMinValue(nodeToDelete.rightNode);
            //save the value of node to delete to smallest value
            int temp = minNodeInRight.value;
            //the method invoke itself to remove the selected node with the smallest value
            removeNode(temp);
            //change the value of node to delete to smallest value
            //the left and right node remain the same
            nodeToDelete.value = temp;
        }
    }

    public Node getParent(Node root, int value) {
        Node current = root;
        if((current.leftNode != null && current.leftNode.value == value) | (current.rightNode != null && current.rightNode.value == value)) {
            return current;
        } else {
            if(current.value > value) {
                current = getParent(current.leftNode, value);
            } else {
                current = getParent(current.rightNode, value);
            }
        }
        return current;
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


