package org.dsa.trees.bst;

public class MinimumAbsoluteDifferenceInBST {

    int min = Integer.MAX_VALUE;
    Integer prev = null;

    // Function to find the minimum absolute difference
    public int getMinimumDifference(Node root) {
        if (root == null)
            return min;

        // In-order traversal (left, root, right)
        getMinimumDifference(root.left);

        // Calculate min difference and update prev
        if (prev != null) {
            min = Math.min(min, root.data - prev);
        }
        prev = root.data;

        getMinimumDifference(root.right);

        return min;
    }

    // Main method to test the function
    public static void main(String[] args) {
        // Constructing a BST
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);
        root.left.left = new Node(2);
        root.left.right = new Node(7);
        root.right.left = new Node(12);
        root.right.right = new Node(20);

        System.out.println("BST Structure:");
        System.out.println("       10");
        System.out.println("      /  \\");
        System.out.println("     5    15");
        System.out.println("    / \\   / \\");
        System.out.println("   2   7 12 20");

        // Find and print the minimum absolute difference in BST
        MinimumAbsoluteDifferenceInBST solution = new MinimumAbsoluteDifferenceInBST();
        int minDiff = solution.getMinimumDifference(root);
        System.out.println("The Minimum Absolute Difference in BST is: " + minDiff);
    }
}
