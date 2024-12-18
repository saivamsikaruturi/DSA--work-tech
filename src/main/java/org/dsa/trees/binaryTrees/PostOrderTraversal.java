package org.dsa.trees.binaryTrees;

import java.util.ArrayList;
import java.util.List;

public class PostOrderTraversal {
        List<Integer> getPostorderTraversal(Node root) {
            List<Integer>list = new ArrayList();
            // add your logic here
            helper(root,list);

            return list;
        }

        static void helper(Node root, List<Integer>list){
            if(root == null){
                return;
            }

            helper(root.left,list);
            helper(root.right,list);
            list.add(root.data);



    }
}
