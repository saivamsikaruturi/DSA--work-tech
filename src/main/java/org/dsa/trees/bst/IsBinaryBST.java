package org.dsa.trees.bst;

import java.util.ArrayList;
import java.util.List;

public class IsBinaryBST {

    boolean isBst(Node root) {

        List<Integer> list = new ArrayList<>();

        populateList(list, root);
        int prev = list.get(0);

        for (int i = 1; i < list.size(); i++) {

            if (prev >= list.get(i))
                return false;

            prev = list.get(i);

        }

        return true;
    }


    void populateList(List<Integer> list, Node root) {

        if (root == null) {
            return;
        }

        populateList(list, root.left);
        list.add(root.data);
        populateList(list, root.right);
    }

    public static void main(String[] args) {
        IsBinaryBST bstChecker = new IsBinaryBST();

        // Constructing a valid BST
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);
        root.left.left = new Node(2);
        root.left.right = new Node(7);
        root.right.left = new Node(12);
        root.right.right = new Node(20);

        System.out.println("Is the tree a BST? " + bstChecker.isBst(root)); // Expected: true

        // Constructing an invalid BST
        Node invalidRoot = new Node(10);
        invalidRoot.left = new Node(5);
        invalidRoot.right = new Node(15);
        invalidRoot.left.left = new Node(2);
        invalidRoot.left.right = new Node(12); // Violates BST property

        System.out.println("Is the tree a BST? " + bstChecker.isBst(invalidRoot)); // Expected: false
    }
}

