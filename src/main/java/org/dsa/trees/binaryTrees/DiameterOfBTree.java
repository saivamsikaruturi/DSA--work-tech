package org.dsa.trees.binaryTrees;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class DiameterOfBTree {
    public static void main(String[] args) {
        Node root1 = new Node(1);
        root1.left = new Node(2);
        root1.right = new Node(3);
        root1.left.right = new Node(6);
        root1.left.left = new Node(5);
        System.out.println(getDiameter(root1));

    }
    static int getDiameter(Node root) {
        Map<Node,Integer> map = new HashMap<>();
        Stack<Node> stack = new Stack<>();
        int diameter = 0;

        if(root!=null){
            stack.push(root);
        }

        while(!stack.isEmpty())
        {
            Node node = stack.peek();

            if(node.left!=null && !map.containsKey(node.left)){
                stack.push(node.left);
            }

            else if(node.right!=null && !map.containsKey(node.right))
            {
                stack.push(node.right);
            }
            else{
                stack.pop();

                int left = map.getOrDefault(node.left,0);
                int right = map.getOrDefault(node.right,0);

                map.put(node,1+Math.max(left,right));

                diameter = Math.max(diameter,right+left);

            }
        }
        return diameter;


    }
}
