package org.dsa.arrays.TwoPointers;

public class TrappingRainWater {
    int volumeOfTrappedRainWater(int[] heights) {
        int leftMax=0,rightMax=0,ans=0,left=0;
        int right = heights.length-1;

        while(left < right){
            leftMax = Math.max(leftMax,heights[left]);
            rightMax = Math.max(rightMax,heights[right]);
            if(leftMax < rightMax){
                ans+=leftMax-heights[left];
                left++;
            }
            else{
                ans+=rightMax-heights[right];
                right--;
            }
        }

        return ans;

    }
}
