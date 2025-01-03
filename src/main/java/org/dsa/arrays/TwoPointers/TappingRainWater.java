package org.dsa.arrays.TwoPointers;

public class TappingRainWater {
    public static int trap(int[] height) {
        int leftMax = height[0], rightMax = height[height.length-1];
        int ans = 0;
        int left =0,right=height.length-1;
        while(left<right){
            leftMax = Math.max(leftMax,height[left]);
            rightMax =  Math.max(rightMax,height[right]);
            if(leftMax < rightMax){
                ans += leftMax - height[left];
                left++;
            }
            else{
                ans += rightMax - height[right];
                right--;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(trap(new int[]{4,2,0,3,2,5}));
    }
}
