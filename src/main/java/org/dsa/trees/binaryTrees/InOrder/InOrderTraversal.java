package org.dsa.trees.binaryTrees.InOrder;

import org.dsa.trees.binaryTrees.Node;

import java.util.ArrayList;
import java.util.List;

public class InOrderTraversal {
    static List<Integer> getInorderTraversal(Node root) {
        List<Integer> list = new ArrayList<>();
        inorderTraversal(root, list);
        return list;
    }

    private static void inorderTraversal(Node root, List<Integer> list) {
        if (root == null) {
            return;
        }

        inorderTraversal(root.left, list);
        list.add(root.data);
        inorderTraversal(root.right, list);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

          /*
                  1
                 /  \
                 2   3
                 / \  / \
                 4  5 6  7
           */

        // Perform in-order traversal
        List<Integer> result = getInorderTraversal(root);

        // Print the result
        System.out.println("In-order Traversal: " + result);
    }
}
