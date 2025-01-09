package org.dsa.trees.binaryTrees.postOrder;

import org.dsa.trees.binaryTrees.Node;

public class InvertBinaryTree {
    public Node getInvertedTree(Node root) {
        if (root == null) {
            return null;
        }

        // Swap the left and right children
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;

        // Recursively invert the left and right subtrees
        getInvertedTree(root.left);
        getInvertedTree(root.right);

        // Return the root after inversion
        return root;
    }

    public static void main(String[] args) {
        System.out.println();
    }
}
