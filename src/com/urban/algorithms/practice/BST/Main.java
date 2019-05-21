package com.urban.algorithms.practice.BST;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BST tree = new BST();

        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(15);
        numbers.add(20);
        numbers.add(23);
        numbers.add(100);
        numbers.add(117);
        numbers.add(157);
        numbers.add(282);

        tree.root = tree.buildBST(numbers, 0, numbers.size() - 1);
        tree.addNewNode(tree.root, 92);
        tree.printNodes(tree.root);
        tree.removeNode(282);
        System.out.println("Nodes after removing");
        tree.printNodes(tree.root);
        int height = tree.calculateHeight(tree.root);
        System.out.println("Height of the tree: " + height);
    }
}
