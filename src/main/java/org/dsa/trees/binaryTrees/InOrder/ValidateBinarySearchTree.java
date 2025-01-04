package org.dsa.trees.binaryTrees.InOrder;

import org.dsa.trees.binaryTrees.Node;

import java.util.ArrayList;
import java.util.List;

public class ValidateBinarySearchTree {

    public static boolean checkBst(Node node){

        List<Integer> list = new ArrayList<>();
        populateList(node,list);

        int prev = list.get(0);

        for(int i = 1;i<list.size();i++){
            if(prev > list.get(i))
                return false;
        }

        return true;

       }

    private static void populateList(Node node,List<Integer>list) {


         if(node == null){
             return;
         }
          populateList(node.left,list);
          list.add(node.data);
          populateList(node.right,list);

    }

    public static void main(String[] args) {
        Node node = new Node(4);
        node.left = new Node(2);
        node.right = new Node(6);
        node.left.left = new Node(1);
        node.left.right = new Node(3);
        System.out.println(checkBst(node));
    }
}
