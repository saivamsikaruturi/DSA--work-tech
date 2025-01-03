package org.dsa.trees.binaryTrees.InOrder;

import org.dsa.trees.binaryTrees.Node;

public class MinimumDistanceBetweenBstNodes {
    static Node prev;
    static int res;
    public static int minDiffInBST(Node root) {
        prev = null;
        res = Integer.MAX_VALUE;
        inOrder(root);
        return res;

    }

    static void inOrder(Node node){
        if(node== null){
            return;
        }

        inOrder(node.left);
        if(prev != null){
            res = Math.min(res,node.data-prev.data);
        }
        prev = node;
        inOrder(node.right);
    }

    public static void main(String[] args) {
        Node node = new Node(4);
        node.left = new Node(2);
        node.right = new Node(6);
        node.left.left = new Node(1);
        node.left.right = new Node(3);
        System.out.println(minDiffInBST(node));
    }
}
