package org.dsa.trees.binaryTrees;

import java.util.ArrayList;
import java.util.List;

public class InOrderTraversal {
    List<Integer> getInorderTraversal(Node root) {
        List<Integer> list = new ArrayList<>();
        inorderTraversal(root, list);
        return list;
    }

    private void inorderTraversal(Node root, List<Integer> list) {
        if (root == null) {
            return;
        }

        inorderTraversal(root.left, list);
        list.add(root.data);
        inorderTraversal(root.right, list);
    }
}
