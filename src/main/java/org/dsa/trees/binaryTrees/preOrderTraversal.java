package org.dsa.trees.binaryTrees;

import java.util.ArrayList;
import java.util.List;

public class preOrderTraversal {
        List<Integer> getPreorderTraversal(Node root) {
            List<Integer> list = new ArrayList<>();
            preOrder(root,list);
            return list;
        }

        void preOrder(Node root ,List<Integer>list){
            if(root == null){
                return ;
            }
            list.add(root.data);
            preOrder(root.left,list);
            preOrder(root.right,list);
        }

}
