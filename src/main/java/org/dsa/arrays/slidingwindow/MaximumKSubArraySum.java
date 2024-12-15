package org.dsa.arrays.slidingwindow;

public class MaximumKSubArraySum {
        int maxKSubarraySum (int[] A, int k) {
            int i =0;
            int j=0;
            int cs =0;
            int max = Integer.MIN_VALUE;
            while(j<A.length){
                cs +=A[j];
                if(j-i+1==k){
                    max = Math.max(cs,max);
                    cs-=A[i];
                    i++;
                }
                j++;
            }
            return max;

        }
}
