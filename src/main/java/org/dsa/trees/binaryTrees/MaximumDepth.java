package org.dsa.trees.binaryTrees;

public class MaximumDepth {
    public static void main(String[] args) {
        Node node = new Node(3);
        node.left = new Node(9);
        node.right = new Node(20);
        node.right.left= new Node(15);
        node.right.right = new Node(7);
        System.out.println(maxDepth(node));
    }

    static int maxDepth(Node root){
         if(root == null){
             return 0;
         }
         int leftDepth = maxDepth(root.left);
         int rightDepth = maxDepth(root.right);

         // The depth of the tree is the maximum of the left and right subtree depths, plus 1 for the root node
         return Math.max(leftDepth, rightDepth) + 1;
     }
}
