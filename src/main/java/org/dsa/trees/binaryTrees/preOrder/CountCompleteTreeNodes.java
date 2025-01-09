package org.dsa.trees.binaryTrees.preOrder;

import org.dsa.trees.binaryTrees.Node;

public class CountCompleteTreeNodes {

      static int countNodes(Node root){
          if(root == null){
              return 0;
          }
          int leftHeight = calculateLeftHeight(root);
          int rightHeight = calculateRightHeight(root);
          if(leftHeight == rightHeight)
              return (int) (Math.pow(2,leftHeight)-1);
          else
              return 1+countNodes(root.left)+countNodes(root.right);
      }

    private static int calculateRightHeight(Node root) {
        int count = 0;
        while(root!=null){
            count++;
            root = root.right;
        }
        return count;
    }

    private static int calculateLeftHeight(Node root) {
          int count = 0;
          while(root!=null){
              count++;
              root = root.left;
          }
          return count;
    }

    public static void main(String[] args) {
        Node node = new Node(1);
        node.left = new Node(2);
        node.right = new Node(3);
        node.left.left = new Node(4);
        node.left.right = new Node(5);
        node.right.left = new Node(6);
        node.right.right = new Node(7);

       int ans = countNodes(node);
        System.out.println(ans);

        Node node1 = new Node(1);
        node1.left = new Node(2);
        node1.right = new Node(3);
        node1.left.left = new Node(4);
        node1.left.right = new Node(5);
        node1.right.left = new Node(6);
        node1.right.right = new Node(7);
        node1.left.left.left = new Node(8);
        int ans1 = countNodes(node1);
        System.out.println(ans1);
    }
}
