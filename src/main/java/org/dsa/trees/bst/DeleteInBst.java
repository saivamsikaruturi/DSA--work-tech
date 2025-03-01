package org.dsa.trees.bst;

class DeleteInBst {

    Node removeFromBst(Node root, int key) {
        if (root == null) {
            return null;
        }

        if (root.data > key) {
            root.left = removeFromBst(root.left, key);
        } else if (root.data < key) {
            root.right = removeFromBst(root.right, key);
        } else {
            // Node found
            if (root.left == null) {
                return root.right; // Case 1 & 2: No left child or leaf node
            } else if (root.right == null) {
                return root.left; // Case 2: No right child
            } else {
                // Case 3: Node has two children
                root.data = findMin(root.right).data; // Find the in-order successor
                root.right = removeFromBst(root.right, root.data); // Remove the in-order successor
            }
        }

        return root;
    }

    // Helper function to find the minimum value node in a subtree
    Node findMin(Node node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }

    // Helper function to insert a node into BST
    Node insert(Node root, int key) {
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
    void inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }

    public static void main(String[] args) {
        DeleteInBst bst = new DeleteInBst();
        Node root = null;

        // Insert nodes into the BST
        int[] values = {50, 30, 70, 20, 40, 60, 80};
        for (int val : values) {
            root = bst.insert(root, val);
        }

        System.out.println("In-order traversal before deletion:");
        bst.inOrder(root);
        System.out.println();

        // Delete a node and print the result
        int keyToDelete = 50;
        root = bst.removeFromBst(root, keyToDelete);

        System.out.println("In-order traversal after deleting " + keyToDelete + ":");
        bst.inOrder(root);
        System.out.println();
    }
}
