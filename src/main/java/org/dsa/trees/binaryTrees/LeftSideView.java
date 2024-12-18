package org.dsa.trees.binaryTrees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LeftSideView {
    public static void main(String[] args) {

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
