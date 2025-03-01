package org.dsa.trees.bst;


class SearchInBst {

    Node searchBst(Node root, int key) {
        return searchRec(root, key);
    }

    // Helper method for recursive search (returns the node if found)
    private Node searchRec(Node root, int key) {
        // Base case: if root is null, the key is not found
        if (root == null) {
            return null;
        }

        // If the key matches the root's data, return the root node
        if (root.data == key) {
            return root;
        }

        // If the key is smaller, search in the left subtree
        if (key < root.data) {
            return searchRec(root.left, key);
        }

        // If the key is greater, search in the right subtree
        return searchRec(root.right, key);
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

        SearchInBst bstSearch = new SearchInBst();

        // Test Cases
        int key = 7;
        Node result = bstSearch.searchBst(root, key);
        if (result != null) {
            System.out.println("Node with value " + key + " found in BST.");
        } else {
            System.out.println("Node with value " + key + " not found in BST.");
        }

        key = 12;
        result = bstSearch.searchBst(root, key);
        if (result != null) {
            System.out.println("Node with value " + key + " found in BST.");
        } else {
            System.out.println("Node with value " + key + " not found in BST.");
        }
    }
}
