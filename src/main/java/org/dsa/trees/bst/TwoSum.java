package org.dsa.trees.bst;

import java.util.HashSet;
import java.util.Set;


public class TwoSum {

    boolean pairExists(Node root, int k) {
        // Use a set to store visited nodes
        Set<Integer> seen = new HashSet<>();
        return dfs(root, k, seen);
    }

    boolean dfs(Node node, int k, Set<Integer> seen) {
        // Base case: if the node is null, return false
        if (node == null) {
            return false;
        }

        // If the complement (k - node.val) is already in the set, return true
        if (seen.contains(k - node.data)) {
            return true;
        }

        // Add the current node's value to the set
        seen.add(node.data);

        // Continue the search on both left and right subtrees
        return dfs(node.left, k, seen) || dfs(node.right, k, seen);
    }

    public static void main(String[] args) {
        // Creating a sample BST
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);
        root.left.left = new Node(3);
        root.left.right = new Node(7);
        root.right.right = new Node(18);

        System.out.println("BST Structure:");
        System.out.println("       10");
        System.out.println("      /  \\");
        System.out.println("     5    15");
        System.out.println("    / \\     \\");
        System.out.println("   3   7     18");

        TwoSum twoSum = new TwoSum();

        // Test Cases
        int k1 = 10; // Expect false (no two nodes sum to 10)
        int k2 = 18; // Expect true (5 + 13)
        int k3 = 25; // Expect true (7 + 18)
        int k4 = 30; // Expect false (no such pair)

        System.out.println("Pair exists for " + k1 + ": " + twoSum.pairExists(root, k1));
        System.out.println("Pair exists for " + k2 + ": " + twoSum.pairExists(root, k2));
        System.out.println("Pair exists for " + k3 + ": " + twoSum.pairExists(root, k3));
        System.out.println("Pair exists for " + k4 + ": " + twoSum.pairExists(root, k4));
    }
}
