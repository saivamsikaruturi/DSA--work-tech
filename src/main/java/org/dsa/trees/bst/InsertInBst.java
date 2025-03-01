package org.dsa.trees.bst;

public class InsertInBst {

    // Function to insert a key into the BST
    Node insertBst(Node root, int key) {
        if (root == null) {
            return new Node(key);
        }

        if (root.data > key) {
            root.left = insertBst(root.left, key);
        } else if (root.data < key) { // Should use else if to avoid redundant checks
            root.right = insertBst(root.right, key);
        }

        return root;
    }

    // Function to perform in-order traversal
    void inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }

    // Function to print the BST structure (pre-order traversal)
    void printTree(Node root, String indent, boolean isLeft) {
        if (root != null) {
            System.out.println(indent + (isLeft ? "L── " : "R── ") + root.data);
            printTree(root.left, indent + (isLeft ? "   " : "│  "), true);
            printTree(root.right, indent + (isLeft ? "   " : "│  "), false);
        }
    }

    public static void main(String[] args) {
        InsertInBst bst = new InsertInBst();
        Node root = null;

        // Insert elements into the BST
        int[] values = {50, 30, 70, 20, 40, 60, 80};
        for (int val : values) {
            root = bst.insertBst(root, val);
        }
        System.out.println("Tree structure:");
        bst.printTree(root, "", false);
        System.out.println("In-order traversal of the BST:");
        bst.inOrder(root);

    }
}
