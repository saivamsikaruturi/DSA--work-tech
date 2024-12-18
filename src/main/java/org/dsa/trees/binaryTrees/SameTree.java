package org.dsa.trees.binaryTrees;

public class SameTree {

     static boolean isSameTree(Node root1,Node root2){
         if(root1 == null && root2 == null)
             return true;

         if(root1 == null || root2 == null || root1.data != root2.data)
             return false;

          return isSameTree(root1.left,root2.left) && isSameTree(root1.right,root2.right);
      }

    public static void main(String[] args) {
         Node root1 = new Node(1);
        root1.left = new Node(2);
        root1.right = new Node(3);
        root1.left.right = new Node(6);
        root1.left.left = new Node(5);

        Node root2 = new Node(1);
        root2.left = new Node(2);
        root2.right = new Node(3);
        root2.left.right = new Node(6);
        root2.left.left = new Node(5);
         boolean result = isSameTree(root1,root2);
        System.out.println(result);

    }
}
