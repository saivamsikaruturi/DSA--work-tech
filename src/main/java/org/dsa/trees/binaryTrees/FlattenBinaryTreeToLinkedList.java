package org.dsa.trees.binaryTrees;

public class FlattenBinaryTreeToLinkedList {
    public void flatten(Node root) {
        if (root == null) {
            return;
        }

        // Flatten the left and right subtrees
        flatten(root.left);
        flatten(root.right);

        // Store the right subtree
        Node tempRight = root.right;

        // Move the left subtree to the right
        root.right = root.left;
        root.left = null; // Set the left child to null

        // Find the end of the new right subtree
        Node current = root;
        while (current.right != null) {
            current = current.right;
        }

        // Attach the previously stored right subtree
        current.right = tempRight;
    }
}
