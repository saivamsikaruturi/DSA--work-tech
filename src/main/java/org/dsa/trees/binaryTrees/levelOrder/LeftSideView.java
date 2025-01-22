package org.dsa.trees.binaryTrees.levelOrder;

import org.dsa.trees.binaryTrees.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LeftSideView {
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
           /  \  / \
           4   5 6  7
         */

        // Create an instance of LeftSideView and call leftView
        LeftSideView lsv = new LeftSideView();
        int[] leftSideView = lsv.leftView(root);

        // Print the left-side view of the binary tree
        System.out.print("Left-side view of the binary tree: ");
        for (int value : leftSideView) {
            System.out.print(value + " ");
        }
    }
    int[] leftView(Node root) {
        int[] res = new int[0];
        if (root == null) {
            return res;
        }
        List<Integer> list = new ArrayList<>();
        Queue<Node> qu = new LinkedList<>();
        qu.add(root);

        while (!qu.isEmpty()) {
            int len = qu.size();

            for (int i = 0; i < len; i++) {

                Node first = qu.poll();
                if (i == 0) {
                    list.add(first.data);
                }

                if (first.left != null) {
                    qu.add(first.left);
                }

                if (first.right != null) {
                    qu.add(first.right);
                }

            }


        }

        int[] array = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        return array;
    }
}
