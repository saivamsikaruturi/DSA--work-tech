package org.dsa.trees.binaryTrees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> globalList = new ArrayList<>();

        if (root == null) {
            return globalList;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> levelList = new ArrayList<>();

            for (int i = 0; i < levelSize; i++) {
                Node currentNode = queue.poll();
                levelList.add(currentNode.data);

                if (currentNode.left != null) {
                    queue.add(currentNode.left);
                }

                if (currentNode.right != null) {
                    queue.add(currentNode.right);
                }
            }

            globalList.add(levelList);
        }

        return globalList;
    }
}
