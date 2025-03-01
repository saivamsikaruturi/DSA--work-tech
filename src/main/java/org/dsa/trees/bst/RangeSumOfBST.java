package org.dsa.trees.bst;


public class RangeSumOfBST {

    public int rangeSumBST(Node root, int low, int high) {
        if (root == null) {
            return 0;
        }

        int sum = 0;

        // Traverse left if there's a chance of finding values in range
        if (low < root.data) {
            sum += rangeSumBST(root.left, low, high);
        }

        // Include root data if it's within the range
        if (low <= root.data && root.data <= high) {
            sum += root.data;
        }

        // Traverse right if there are potential values in range
        if (root.data < high) {
            sum += rangeSumBST(root.right, low, high);
        }

        return sum;
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

        RangeSumOfBST rangeSum = new RangeSumOfBST();

        // Test Cases
        int low = 7, high = 15;
        System.out.println("Range Sum of BST for range [" + low + ", " + high + "] = " + rangeSum.rangeSumBST(root, low, high));

        low = 5;
        high = 10;
        System.out.println("Range Sum of BST for range [" + low + ", " + high + "] = " + rangeSum.rangeSumBST(root, low, high));
    }
}
