package org.dsa.trees.bst;

import java.util.ArrayList;
import java.util.List;

public class BalanceBST {

    List<Node> list = new ArrayList<>();

    public Node balanceBST(Node root) {
        inOrderTraversal(root);
        return sortArray(0, list.size() - 1);
    }

    private Node sortArray(int start, int end) {
        if (start > end) return null;
        int mid = (start + end) / 2;
        Node root = list.get(mid);
        root.left = sortArray(start, mid - 1);
        root.right = sortArray(mid + 1, end);
        return root;
    }

    private void inOrderTraversal(Node root) {
        if (root == null)
            return;
        inOrderTraversal(root.left);
        list.add(root);
        inOrderTraversal(root.right);
    }

    // Helper function to insert a node into BST
    public Node insert(Node root, int key) {
        if (root == null) {
            return new Node(key);
        }

        if (key < root.data) {
            root.left = insert(root.left, key);
        } else {
            root.right = insert(root.right, key);
        }

        return root;
    }

    // Helper function to perform in-order traversal
    public void inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }

    // Function to print tree in a structured way (pre-order traversal)
    public void printTree(Node root, String indent, boolean isLeft) {
        if (root != null) {
            System.out.println(indent + (isLeft ? "L── " : "R── ") + root.data);
            printTree(root.left, indent + (isLeft ? "   " : "│  "), true);
            printTree(root.right, indent + (isLeft ? "   " : "│  "), false);
        }
    }

    public static void main(String[] args) {
        BalanceBST bst = new BalanceBST();
        Node root = null;

        // Creating an unbalanced BST
        int[] values = {10, 20, 30, 40, 50, 60, 70};
        for (int val : values) {
            root = bst.insert(root, val);
        }

        System.out.println("In-order traversal of unbalanced BST:");
        bst.inOrder(root);
        System.out.println("\nTree structure before balancing:");
        bst.printTree(root, "", false);

        // Balancing the BST
        root = bst.balanceBST(root);

        System.out.println("\nIn-order traversal of balanced BST:");
        bst.inOrder(root);
        System.out.println("\nTree structure after balancing:");
        bst.printTree(root, "", false);
    }
}
