package org.dsa.trees.binaryTrees;

import java.util.*;

public class ZigZagTraversal {

          static List<List<Integer>> getZigZagTraversal(Node node){
               List<List<Integer>> zigZagList = new ArrayList<>();
               Queue<Node> queue = new LinkedList<>();
               queue.offer(node);
               boolean flag = false;
               while (!queue.isEmpty()){
                   int size = queue.size();
                   List<Integer> level = new ArrayList<>();
                   Stack<Integer> st = new Stack<>();
                   for(int i =0;i<size;i++){
                       Node  current = queue.poll();
                      if(!flag) {
                          level.add(current.data);
                      }
                      else {
                          st.push(current.data);
                      }

                      if(current.left!=null){
                          queue.add(current.left);
                      }

                       if(current.right!=null){
                           queue.add(current.right);
                       }

                   }
                   flag = !flag;
                   while(!st.isEmpty()){
                       level.add(st.pop());
                   }
                   zigZagList.add(level);
               }

               return  zigZagList;
           }

    public static void main(String[] args) {
              Node node = new Node(4);
              node.left = new Node(8);
              node.right = new Node(15);
              node.right.left = new Node(23);
              node.right.right = new Node(42);
              node.right.left.left = new Node(16);
          List<List<Integer>> ans = getZigZagTraversal(node);

        ans.forEach(System.out::println);
    }
}
