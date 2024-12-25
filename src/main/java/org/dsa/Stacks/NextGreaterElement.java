package org.dsa.Stacks;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElement {
    static int[] getNextGreaterElement (int[] nums1,int[] nums2) {

        Stack<Integer>st = new Stack<>();
        Map<Integer,Integer> map = new HashMap();
        map.put(nums2[nums2.length-1],-1);
        st.push(nums2[nums2.length-1]);
        for(int i = nums2.length-2;i>=0;i--){
             while(!st.isEmpty() && st.peek()<=nums2[i]){
                 st.pop();
             }

             if(st.isEmpty()){
                 map.put(nums2[i],-1);
             }
             else {
                 map.put(nums2[i],st.peek());
             }
             st.push(nums2[i]);
        }

        int[] res = new int[nums1.length];
        for(int i=0;i<nums1.length;i++) {
            res[i] = map.get(nums1[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getNextGreaterElement(new int[]{4, 1, 2}, new int[]{1, 3, 4, 2})));
    }
}
