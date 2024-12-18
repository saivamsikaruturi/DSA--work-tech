package org.dsa.trees.binaryTrees;

public class SymmetricTree {

    
    public static void main(String[] args) {
          /*
                     1
                   /    \ 
                   2     2
                  / \   /  \
                  4  3  3   4
           */
        
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(2);
        root.left.right = new Node(3);
        root.left.left = new Node(4);
        root.right.left = new Node(3);
        root.right.right = new Node(4);

        Node root1 = new Node(1);
        root1.left = new Node(2);
        root1.right = new Node(2);
        root1.left.right = new Node(3);
        root1.left.left = new Node(4);
        root1.right.left = new Node(4);
        root1.right.right = new Node(3);


        boolean res = isSymmetric(root);
        System.out.println(res);

        boolean res1 = isSymmetric(root1);
        System.out.println(res1);
        
    }

    private static boolean isSymmetric(Node root) {
       return checkSymmetry(root.left,root.right);
    }

    private static boolean checkSymmetry(Node left, Node right) {
        if(left == null  && right == null)
            return true;

        if(left == null || right == null || left.data!=right.data)
            return false;

        return checkSymmetry(left.left,right.right) && checkSymmetry(left.right,right.left);
    }
}
