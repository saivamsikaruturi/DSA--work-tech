package org.dsa.trees.binaryTrees;


import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class BottomView {

    static void bottomView(Node root){
        Map<Integer,Integer> map = new HashMap<>();
        Queue<Pair> queue = new LinkedList<>();
        queue.offer(new Pair(root,0));
        while(!queue.isEmpty()){

            Pair pair = queue.poll();
            int hd = pair.hd;
            Node current = pair.node;

                map.put(hd,current.data);


            if(pair.node.left!=null){
                queue.offer(new Pair(current.left,hd-1));
            }
            if(pair.node.right!=null){
                queue.offer(new Pair(current.right,hd+1));
            }

        }

        for(Integer values : map.values()){
            System.out.println(values);
        }
    }

    public static void main(String[] args) {
        Node node = new Node(1);
        Node node1 = new Node(2);
        Node node2 = new Node(3);
        Node node3 = new Node(4);
        Node node4 = new Node(5);
        Node node5 = new Node(6);
        Node node6 = new Node(7);
        node.left = node1;
        node.right = node2;
        node1.left=node3;
        node1.right=node4;
        node2.left=node5;
        node2.right=node6;
        bottomView(node);
    }
}
