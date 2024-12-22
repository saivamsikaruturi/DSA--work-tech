package org.dsa.arrays.prefixSum;

import java.util.HashMap;
import java.util.Map;

public class SubArraySumEqualsK {

       static int getSubArraySum(int[] array,int k){
           int sum = 0;
           int count = 0;
           Map<Integer,Integer> map = new HashMap<>();
           map.put(0,1);
           for(int i = 0;i<array.length;i++){
               sum+=array[i];
               if(map.containsKey(sum-k)){
                   count++;
               }
               map.put(sum,map.getOrDefault(sum,0)+1);
           }
           return  count;
       }
    public static void main(String[] args) {
        System.out.println(getSubArraySum(new int[]{1,1,2},2));
        System.out.println(getSubArraySum(new int[]{1,2,3},3));

    }
}
