package org.dsa.trees.binaryTrees;

public class BalancedBinaryTree {
    boolean isBinaryTreeBalanced(Node root) {
        return checkHeight(root) != -1;
    }

    // Helper method to calculate height and check balance
    private static int checkHeight(Node root) {
        if (root == null) return 0;

        int leftHeight = checkHeight(root.left);
        if (leftHeight == -1) return -1; // Left subtree is not balanced

        int rightHeight = checkHeight(root.right);
        if (rightHeight == -1) return -1; // Right subtree is not balanced

        // If the current node is not balanced
        if (Math.abs(leftHeight - rightHeight) > 1) return -1;

        // Return the height of the current subtree
        return Math.max(leftHeight, rightHeight) + 1;
    }
}
