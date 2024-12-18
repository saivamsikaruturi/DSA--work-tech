package org.dsa.trees.binaryTrees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RightSideView {
    static int[] rightView(Node root) {
        if (root == null) {
            return new int[0];
        }

        List<Integer> list = new ArrayList<>();
        Queue<Node> qu = new LinkedList<>();
        qu.add(root);

        while (!qu.isEmpty()) {
            int len = qu.size();

            for (int i = 0; i < len; i++) {
                Node first = qu.poll();
                if (i == len-1) {
                    list.add(first.data);
                }

                // Corrected lines to use `first` instead of `root`
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
