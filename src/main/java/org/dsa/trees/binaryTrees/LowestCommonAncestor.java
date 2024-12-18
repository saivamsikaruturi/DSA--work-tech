package org.dsa.trees.binaryTrees;

public class LowestCommonAncestor {
   static Node  lowestCommonAncestor(Node root, Node p, Node q) {

        if(root==null) return null;

        if((root.data == p.data) || (root.data == q.data) ) return root;

        Node left = lowestCommonAncestor(root.left,p,q);

        Node right = lowestCommonAncestor(root.right,p,q);

        if(left!=null && right!=null) return root;

        if(left!=null) return left;

        return right;
    }

    public static void main(String[] args) {
        Node root = new Node(3);
        root.left = new Node(5);
        root.right = new Node(1);
        root.left.left = new Node(6);
        root.left.right = new Node(2);
        root.right.left = new Node(0);
        root.right.right = new Node(8);
        root.left.right.left = new Node(7);
        root.left.right.right = new Node(4);

        // Define nodes for which LCA is to be found
        Node p = root.left;  // Node 5
        Node q = root.left.right.right;  // Node 4

        // Find and print the LCA
        Node lca = lowestCommonAncestor(root, p, q);
        System.out.println(lca.data);
    }
}
