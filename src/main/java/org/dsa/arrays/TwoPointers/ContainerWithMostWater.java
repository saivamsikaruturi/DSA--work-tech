package org.dsa.arrays.TwoPointers;

public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int maxArea = Integer.MIN_VALUE;
        int minH = -1;
        while(left < right){
            minH = Math.min(height[left],height[right]);
            int  area =minH*(right-left);
            maxArea = Math.max(area,maxArea);

            while (left < right && height[left] <= minH) {
                left++;
            }
            while (left < right && height[right] <= minH) {
                right--;
            }
        }
        return maxArea;
    }
    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }
}
