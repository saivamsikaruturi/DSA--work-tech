package org.dsa.trees.bst;


public class KthLargestElement {

    // Function to find the k-th largest element in the BST
    static int findKthLargest(Node root, int k) {
        int[] count = {0}; // To keep track of the count of visited nodes
        int[] result = {-1}; // To store the k-th largest element
        reverseInOrderTraversal(root, k, count, result);
        return result[0];
    }

    // Helper function to perform reverse in-order traversal
    static void reverseInOrderTraversal(Node root, int k, int[] count, int[] result) {
        if (root == null || count[0] >= k) return;

        // Traverse the right subtree first (for descending order)
        reverseInOrderTraversal(root.right, k, count, result);

        // Increment count and check if we reached the k-th largest
        count[0]++;
        if (count[0] == k) {
            result[0] = root.data;
            return;
        }

        // Traverse the left subtree
        reverseInOrderTraversal(root.left, k, count, result);
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

        // Test cases
        int k = 3;
        System.out.println("The " + k + "-th largest element in the BST is: " + findKthLargest(root, k));

        k = 1;
        System.out.println("The " + k + "-th largest element in the BST is: " + findKthLargest(root, k));

        k = 5;
        System.out.println("The " + k + "-th largest element in the BST is: " + findKthLargest(root, k));

        k = 7;
        System.out.println("The " + k + "-th largest element in the BST is: " + findKthLargest(root, k));

        k = 8; // Edge case: k is greater than the number of nodes
        System.out.println("The " + k + "-th largest element in the BST is: " + findKthLargest(root, k));
    }
}
